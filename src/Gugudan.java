import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// 사용자에게 4또는 5를 입력받는다.
		System.out.println("구구단 중 출력한 단은? : ");
		Scanner scanner = new Scanner(System.in);
		// 입력받은 값을 상수로 저장.
		final int number = scanner.nextInt();
		System.out.println("number: " + number); 
		
		// 해당하는 구구단을 출력한다.
		int result = number * 1;
		System.out.println(result);
		result = number * 2;
		System.out.println(result);
		result = number * 3;
		System.out.println(result);
		result = number * 4;
		System.out.println(result);
		result = number * 5;
		System.out.println(result);
		result = number * 6;
		System.out.println(result);
		result = number * 7;
		System.out.println(result);
		result = number * 8;
		System.out.println(result);
		result = number * 9;
		System.out.println(result);
		
	}
}
