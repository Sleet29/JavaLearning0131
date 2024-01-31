package ex17_07_SharedArea_solution;
// CalcThread가 계산된 파이 값을 공유 영역에 쓰기도 전에
// 
//
//
public class PrintMain {
	public static void main(String args[]) {
		SharedArea obj = new SharedArea();
		CalcThread thread1 = new CalcThread(obj);
		PrintThread thread2 = new PrintThread(obj);
		thread1.start();
		thread2.start();
	}
}
