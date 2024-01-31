// Runnable 인터페이스를 이용한 멀티스레드 프로그램
package ex_17_04_Runnable_Interface_anonymous_ramda_method;
// 1. 람다식은 메서드를 하나의 식으로 표현한 것입니다.
public class RamdaExample {
	public static void main(String args[]) {
		Parse p;
		
		// 인터페이스 익명 구현 객체
		p = new Parse() {
			
			@Override
			public int toInt(String x) {
				return Integer.parseInt(x);
			}
		};
		System.out.println(p.toInt("100"));
		
		
		p = (x) -> {
			return Integer.parseInt(x);
		};
		
		System.out.println(p.toInt("200"));
		
		
		p = x-> {
			return Integer.parseInt(x);
		};
		System.out.println(p.toInt("300"));
		
		
		p = (String x) -> Integer.parseInt(x);
		System.out.println(p.toInt("400"));
		
		
		p = x -> Integer.parseInt(x);
		System.out.println(p.toInt("500"));
		
		/*
		위의 방법은 값 하나를 받아 Integer.parseInt()에 넘겨주는 일을 하고 있다.
		즉 하나의 메서드를 호출하고 있다.
		이것을 메서드 참조방법으로 나타낼 수 있으며
		메서드 참조는 클래스이름::메서드이름 또는 참조변수::메서드이름 형식으로 작성합니다.
		 */
		
		p = Integer::parseInt;
		System.out.println(p.toInt("600"));
	}
}