package ex17_07_SharedArea_solution;

public class CalcThread extends Thread{
	private SharedArea SharedArea;
	
	CalcThread(SharedArea sharedArea) {
		this.SharedArea = sharedArea;
	}
	
	public void run() {
		double total = 0.0;
		// 파이 계산 부분
		for (int cnt = 1; cnt < 1000000000; cnt +=2) {
			if (cnt / 2 % 2 == 0)
				total += 1.0 / cnt;
			else
				total -= 1.0 / cnt;
			
		// 계산 결과를 공유 영역에 저장
		// total * 4의 결과를 필드의 setResult()를 이용해서 저장
		}
		SharedArea.setResult(total*4);
		
		// SharedArea 객체의 isReady 필드 값을 true로 설정
		SharedArea.setReadY(true);
	}
}


