package demo;

import java.util.Scanner;

public class ViewTitle {
	
	public ViewTitle() {}
	
	public void showTitle()
	{
		clearLines();
		System.out.println("########< ���� ȭ�� >########");
		System.out.println("##########################");
		System.out.println();
		System.out.println("1. ���� ����");
		System.out.println();
		System.out.println("2. ���� ����");
		System.out.println();
		System.out.println("���ϴ� �޴��� ���ڸ� �Է����ּ���.");
		System.out.println();
		System.out.println("##########################");
		System.out.println();
	}
	
	public void showTitle2()
	{
		clearLines();
		System.out.println("##########################");
		System.out.println();
		System.out.println(" ���� ���� ������ ����� �Ⱦ�");
		System.out.println(" ���� ������ �����Դϴ�.");
		System.out.println();
		System.out.println(" �����Ͻ÷��� ���� Ű�� �����ּ���.");
		System.out.println();
		System.out.println("##########################");
	}
	
	public void showInputName()
	{
		clearLines();
		System.out.println("##########################");
		System.out.println();
		System.out.println(" ����� �г����� �Է����ּ���.");
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
