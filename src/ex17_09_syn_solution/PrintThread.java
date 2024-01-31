package ex17_09_syn_solution;

public class PrintThread extends Thread {

	private SharedArea sharedArea;
	
	PrintThread(SharedArea area) {
		sharedArea = area;
	}
	
	@Override
	public void run() {
		for (int i=0;i<3;i++) {
			/*
			 * synchronized 키워드를 사용해서 블록으로 묶은 부분을 동기화 블럭이라고 한다.
			 */
			// 동기화 시작
			synchronized (sharedArea) {
			int sum = sharedArea.getAccount1().getBalance() 
					+ sharedArea.getAccount2().getBalance();
			System.out.println("계좌 잔액 합계 : "+sum);
			}
			// 동기화 끝
		
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
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