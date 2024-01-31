package ex17_02_Thread_sleep.Test_Runnable;

public class ThreadSleep_date_main {
	public static void main(String args[]) {
		Thread t = new Thread(new ThreadSleep_date());
		t.start();
	}
}

// 추후에 anonymous_ramda때 할것임