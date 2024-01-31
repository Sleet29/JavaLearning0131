// 계좌 이체를 수행하는 스레드 클래스
package ex17_11_syn_format2;
class TransferThread extends Thread{
	private SharedArea sharedArea;
	
	TransferThread(SharedArea area) {
		sharedArea = area;
	}
	
	public void run() {
		for(int cnt = 0; cnt<12; cnt++) {
			sharedArea.transfer();
		}// for end
	}// run end
}// class end
