package demo;

import java.util.Scanner;

public class ViewTitle {
	
	public ViewTitle() {}
	
	public void showTitle()
	{
		clearLines();
		System.out.println("########< 메인 화면 >########");
		System.out.println("##########################");
		System.out.println();
		System.out.println("1. 게임 시작");
		System.out.println();
		System.out.println("2. 게임 종료");
		System.out.println();
		System.out.println("원하는 메뉴의 숫자를 입력해주세요.");
		System.out.println();
		System.out.println("##########################");
		System.out.println();
	}
	
	public void showTitle2()
	{
		clearLines();
		System.out.println("##########################");
		System.out.println();
		System.out.println(" 각종 재료로 물건을 만들어 팔아");
		System.out.println(" 돈을 모으는 게임입니다.");
		System.out.println();
		System.out.println(" 시작하시려면 엔터 키를 눌러주세요.");
		System.out.println();
		System.out.println("##########################");
	}
	
	public void showInputName()
	{
		clearLines();
		System.out.println("##########################");
		System.out.println();
		System.out.println(" 사용할 닉네임을 입력해주세요.");
		System.out.println();
		System.out.println("##########################");
	}
	
	public void clearLines()
	{
		for(int i = 0; i < 55; i++)
		{
			System.out.println();
		}
	}
	
}
