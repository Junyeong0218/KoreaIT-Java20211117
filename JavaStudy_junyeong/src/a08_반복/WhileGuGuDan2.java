package a08_반복;

import java.util.Scanner;

public class WhileGuGuDan2 {

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
		
		while(gugudanStart < gugudanEnd+1)
		{
			if(gugudanStart % 2 == 0)
			{
				gugudanStart++;
				// continue 를 만나면 바로 다음 반복으로 이동하기 때문에 조건 증감식을 무조건 위에 입력해줘야 정확한 출력값을 얻을 수 있다.
				// else 쓸 필요 X
				// 소스코드의 가시성을 위해 continue 를 사용
				continue;
			}
				System.out.println(gugudanStart + " 단");
				
				int temp = number1;
				while(temp < number2+1)
				{
					System.out.println(gugudanStart + " X " + temp + " = " + gugudanStart*temp);
					temp++;
				}
				System.out.println();
				gugudanStart++;
			
		}
		
	}

}
