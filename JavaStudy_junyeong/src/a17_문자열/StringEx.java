package a17_문자열;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("이름입력: ");
		String name = in.nextLine();
		
		in.close();
		
		String name1 = "김준일";
		String name2 = "김준일";
		
		System.out.println(name1 == "김준일");
		System.out.println(name == "김준일");
	}
}
