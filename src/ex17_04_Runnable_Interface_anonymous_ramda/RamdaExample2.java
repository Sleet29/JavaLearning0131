package ex17_04_Runnable_Interface_anonymous_ramda;

public class RamdaExample2 {
	public static void main(String args[]) {
		print(()->System.out.println("new Sample -1"));
		print(()->System.out.println("new Sample -2"));
		print(()->System.out.println("new Sample -3"));
		}
	
		
		static void print(Sample sample) 
		{
			sample.print();
		}
}