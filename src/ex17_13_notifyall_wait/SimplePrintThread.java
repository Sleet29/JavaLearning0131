// 파이를 소수점 두자리까지만 출력하는 클래스
package ex17_13_notifyall_wait;
public class SimplePrintThread extends Thread {

	private SharedArea sharedArea;
	SimplePrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}
	
	@Override
	public void run() {
		if (sharedArea.isReady() != true) {
			try {
				synchronized(sharedArea) {
					sharedArea.wait(); // 다른 스레드로부터 신호를 기다림
									   // 파이의 계싼 끝나면 다른 스레드에 신호 보냄
				}
			} // try end
			catch (InterruptedException e) { // wait 메소드가 발생하는 익셉션 처리
				System.out.println(e.getMessage());
			} // catch end
		} // if end
		System.out.printf("SimplePrintThread : %.2f %n", sharedArea.getResult());
	}
}

