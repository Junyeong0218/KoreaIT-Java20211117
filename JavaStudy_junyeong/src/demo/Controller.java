package demo;

import java.util.Scanner;

public class Controller {
	
	Character character = null;
	Inventory inventory = null;
	
	ViewTitle viewTitle = null;
	ViewIdle viewIdle = null;
	
	Scanner input = new Scanner(System.in);
	
	public Controller(Character character, ViewTitle viewTitle, ViewIdle viewIdle)
	{
		this.character = character;
		this.viewTitle = viewTitle;
		this.viewIdle = viewIdle;
	}
	
	// 게임 진행 여부 및 진행시 이름 설정
	public void judgeToPlay()
	{
		String name;
		
		String s_temp;
		int index;
		viewTitle.showTitle();
		do
		{
			index = input.nextInt();
			if(index > 2 || index < 1){
				System.out.println(" 잘못된 입력입니다.");
				System.out.println(" 다시 입력해주세요.");
			}
			else if(index == 2){
				System.exit(1);
			}
		}
		while(index > 2 || index < 1);
		
		viewTitle.showTitle2();
		input.nextLine();
		s_temp = input.nextLine();
		
		viewTitle.showInputName();
		name = input.next();
		character.setName(name);
	}
	
	public void mainMenu()
	{
		int i_temp;
		viewIdle.showIdle();
		
		do
		{
			i_temp = input.nextInt();
			if(i_temp > 4 || i_temp < 1)
			{
				System.out.println(" 잘못된 입력입니다.");
				System.out.println(" 다시 입력해주세요.");
			}
			else if(i_temp == 1)
			{
				viewIdle.showMaking();
			}
			else if(i_temp == 2)
			{
				viewIdle.showInventory();
			}
			else if(i_temp == 3)
			{
				viewIdle.showStore();
			}
			else
			{
				System.exit(1);
			}	
		}
		while(i_temp > 4 || i_temp < 1);
	}
	
	

}
