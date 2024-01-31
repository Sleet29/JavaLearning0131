package ex17_04_Runnable_Interface_anonymous_ramda;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleep_date_main_anonymous4_ramdause {
	public static void main(String args[]) {
		// The type new Runnable(){} must implement the inherited abstract 
		Thread th = new Thread(() -> {

				SimpleDateFormat s = 
					new SimpleDateFormat("yyyy년MM월dd일E요일 HH시mm분ss초");
				for(;;) {
					Date d = new Date();
					System.out.println(s.format(d));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ie) {
						System.out.println(ie.toString());
					}
				}
		});
		th.start();
	}
}

