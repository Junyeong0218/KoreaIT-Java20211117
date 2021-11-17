package a06_표준입력;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		// ctrl + shift + o = 자동 import
		Scanner input = new Scanner(System.in);

		// 조건이 만족할 때까지 기다리는 것 = buffering
		// nextLine 을 제외한 메서드 = space & enter 무시
		// 보통은 1 | 0 | \n 이렇게 운영체제에 입력이 되고 \n에서 끊은 뒤 앞의 값을 변수에 저장하고 나머지 \n은 버퍼에 저장됨
		// 그 다음 next 메서드가 시작될 때 버퍼에 있는 \n을 가장 먼저 호출한 뒤 입력을 받으나
		// nextLine 을 제외한 메서드들은 \n 값을 무시하므로 제대로 진행 가능.
		// nextLine 은 \n을 포함하므로 아래와 같이 처리하는 것이 필요.
		
		int number = input.nextInt(); // 입력값 \n↓
		int number2 = input.nextInt(); // \n 입력값 \n↓
		
		String name = input.next(); // \n 입력값 \n↓
		
		input.nextLine(); // \n
		String phone = input.nextLine(); // 입력값 \n
		
		System.out.println(number2);
		System.out.println(number);
		System.out.println(name);
		System.out.println(phone);
		
		// https://app.diagrams.net/ 순서도 도메인
		
	}

}
