package a08_�ݺ�;

import java.util.Scanner;

public class WhileGuGuDan2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int gugudanStart = 0;
		int gugudanEnd = 0;
		int number1 = 0;
		int number2 = 0;
		
		System.out.print("���� �ܼ� : ");
		gugudanStart = in.nextInt();
		System.out.println();
		
		System.out.print("������ �ܼ� : ");
		gugudanEnd = in.nextInt();
		System.out.println();
		
		System.out.print("���� ���� : ");
		number1 = in.nextInt();
		System.out.println();
		
		System.out.print("������ ���� : ");
		number2 = in.nextInt();
		System.out.println();
		
		while(gugudanStart < gugudanEnd+1)
		{
			if(gugudanStart % 2 == 0)
			{
				gugudanStart++;
				// continue �� ������ �ٷ� ���� �ݺ����� �̵��ϱ� ������ ���� �������� ������ ���� �Է������ ��Ȯ�� ��°��� ���� �� �ִ�.
				// else �� �ʿ� X
				// �ҽ��ڵ��� ���ü��� ���� continue �� ���
				continue;
			}
				System.out.println(gugudanStart + " ��");
				
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
