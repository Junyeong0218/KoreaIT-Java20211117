package a17_���ڿ�;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�̸��Է�: ");
		String name = in.nextLine();
		
		in.close();
		
		String name1 = "������";
		String name2 = "������";
		
		System.out.println(name1 == "������");
		System.out.println(name == "������");
	}
}
