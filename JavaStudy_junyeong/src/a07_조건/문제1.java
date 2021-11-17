package a07_조건;

import java.util.Scanner;

public class 문제1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("성적을 입력해주세요 (0 ~ 100) : ");
		int score = input.nextInt();
		
		// 90 ~ 100 A
		// 80 ~ 89 B
		// 70 ~ 79 C
		// 60 ~ 69 D
		// 0~ 59 F
		
		if((score < 0) || (score > 100))
		{
			System.out.println("잘못된 입력입니다.");
		}
		else if(score > 89)
		{
			System.out.println("A 입니다.");
		}
		else if(score > 79)
		{
			System.out.println("B 입니다.");
		}
		else if(score > 69)
		{
			System.out.println("C 입니다.");
		}
		else if(score > 59)
		{
			System.out.println("D 입니다.");
		}
		else
		{
			System.out.println("F 입니다.");
		}
		
	}
}
