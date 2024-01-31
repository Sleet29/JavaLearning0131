package ex17_13_notifyall_wait;

public class LuxuryPrintThread extends Thread {

	private SharedArea sharedArea;
	LuxuryPrintThread(SharedArea sharedArea) {
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
		
		System.out.println("*** π =  "+ sharedArea.getResult() + " ***");
	}
}

/*
 * 
public class PrintThread extends Thread {
	private SharedArea sharedArea;
	
	PrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}
		
	public void run() {
		// SharedArea객체의 isReady 필드 값이 true가 될 때까지 반복
		while(sharedArea.isReady() != true) {
			System.out.println("실행중 ~");
		}
		// 공유 영역 데이터 출력
		System.out.println("공유 영역의 데이터 = " + sharedArea.getResult());
	}// run end
}// class end


 */
/*
package ex17_08_syn_problem;

public class PrintThread extends Thread {

    private SharedArea sharedArea;
    
    PrintThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            // Synchronize access to sharedArea to avoid concurrent access issues
            synchronized (sharedArea) {
                int sum = sharedArea.getAccount1().getBalance() + sharedArea.getAccount2().getBalance();
                System.out.println("계좌 잔액 합계 : " + sum);
            }
            
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
*/