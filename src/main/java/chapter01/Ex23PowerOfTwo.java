package chapter01;

public class Ex23PowerOfTwo {

	public static void main(String[] args) {
		final int POWER = 32;
		long result = 1;
		
		for(int i = 0; i < POWER; i++) {
			result *= 2;
		}
		
		System.out.println("2의 " + POWER + "승은 " + result + "입니다.");

	}

}
