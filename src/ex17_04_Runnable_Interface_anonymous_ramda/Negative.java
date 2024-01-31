package ex17_04_Runnable_Interface_anonymous_ramda;

@FunctionalInterface // 두 개 이상의 추상 메서드가 선언되면 컴파일 오류가 발생
public interface Negative {
	int neg(int x);
	// int neg2(int x); // 에러 발생
}
