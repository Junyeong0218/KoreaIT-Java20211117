package a06_ǥ���Է�;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		// ctrl + shift + o = �ڵ� import
		Scanner input = new Scanner(System.in);

		// ������ ������ ������ ��ٸ��� �� = buffering
		// nextLine �� ������ �޼��� = space & enter ����
		// ������ 1 | 0 | \n �̷��� �ü���� �Է��� �ǰ� \n���� ���� �� ���� ���� ������ �����ϰ� ������ \n�� ���ۿ� �����
		// �� ���� next �޼��尡 ���۵� �� ���ۿ� �ִ� \n�� ���� ���� ȣ���� �� �Է��� ������
		// nextLine �� ������ �޼������ \n ���� �����ϹǷ� ����� ���� ����.
		// nextLine �� \n�� �����ϹǷ� �Ʒ��� ���� ó���ϴ� ���� �ʿ�.
		
		int number = input.nextInt(); // �Է°� \n��
		int number2 = input.nextInt(); // \n �Է°� \n��
		
		String name = input.next(); // \n �Է°� \n��
		
		input.nextLine(); // \n
		String phone = input.nextLine(); // �Է°� \n
		
		System.out.println(number2);
		System.out.println(number);
		System.out.println(name);
		System.out.println(phone);
		
		// https://app.diagrams.net/ ������ ������
		
	}

}
