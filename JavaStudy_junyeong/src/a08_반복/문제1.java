package a08_반복;

import java.util.Scanner;

public class 문제1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int gugudanStart = 0;
		int gugudanEnd = 0;
		int number1 = 0;
		int number2 = 0;
		
		System.out.print("시작 단수 : ");
		gugudanStart = in.nextInt();
		System.out.println();
		
		System.out.print("마지막 단수 : ");
		gugudanEnd = in.nextInt();
		System.out.println();
		
		System.out.print("시작 숫자 : ");
		number1 = in.nextInt();
		System.out.println();
		
		System.out.print("마지막 숫자 : ");
		number2 = in.nextInt();
		System.out.println();
		
	
		for(int i = gugudanStart; i < gugudanEnd+1; i++)
		{
			System.out.println(i +"단");
			
			for(int j = number1 ; j < number2+1; j++)
			{
				System.out.println(i + " X " + j + " = " + i*j);
			}
			
			System.out.println();
		}
		
	}
	
}
