package a08_반복;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		boolean loopFlag = true;
		
		String select = null;
		
		while(loopFlag)
		{
			System.out.println("[프로그램 메뉴]");
			System.out.println("1. 김준일 강사 폴더");
			System.out.println("2. 프로그램 종료");
			System.out.print("명령을 입력하세요 : ");
			select = in.nextLine();
			System.out.println();
			
			// 문자열 대조 = 변수 . equals( "대조할 문자열" ) -> boolean 형 반환
			if(select.equals("1"))
			{
				boolean loopFlag2 = true;
				while(loopFlag2)
				{
					System.out.println("[1. 김준일 강사 폴더]");
					System.out.println("1. javaStudy 폴더");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.print("명령을 입력하세요 : ");
					select = in.nextLine();
					System.out.println();
					
					if(select.equals("1"))
					{
						System.out.println("[1. javaStudy 폴더]");
					}
					else if(select.equals("b"))
					{
						System.out.println("이전화면으로 돌아갑니다.");
						loopFlag2 = false;
					}
					else if(select.equals("q"))
					{
						System.out.println("프로그램 종료 중...");
						loopFlag = false;
						loopFlag2 = false;
					}
					else
					{
						System.out.println("실행할 수 없는 명령입니다.");
					}
					System.out.println();
				}
			}
			else if(select.equals("2"))
			{
				System.out.println("프로그램 종료");
				loopFlag = false;
			}
			else
			{
				System.out.println("실행할 수 없는 명령입니다.");
			}
		}
	}

}
