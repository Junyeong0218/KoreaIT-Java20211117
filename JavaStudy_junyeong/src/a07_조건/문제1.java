package a07_����;

import java.util.Scanner;

public class ����1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� (0 ~ 100) : ");
		int score = input.nextInt();
		
		// 90 ~ 100 A
		// 80 ~ 89 B
		// 70 ~ 79 C
		// 60 ~ 69 D
		// 0~ 59 F
		
		if((score < 0) || (score > 100))
		{
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		else if(score > 89)
		{
			System.out.println("A �Դϴ�.");
		}
		else if(score > 79)
		{
			System.out.println("B �Դϴ�.");
		}
		else if(score > 69)
		{
			System.out.println("C �Դϴ�.");
		}
		else if(score > 59)
		{
			System.out.println("D �Դϴ�.");
		}
		else
		{
			System.out.println("F �Դϴ�.");
		}
		
	}
}
