package demo;

import java.util.Scanner;

public class Controller {
	
	Character character = null;
	Inventory inventory = null;
	Store store = null;
	
	ViewTitle viewTitle = null;
	ViewIdle viewIdle = null;
	
	Scanner input = new Scanner(System.in);
	
	public Controller(Character character, Inventory inventory, Store store, ViewTitle viewTitle, ViewIdle viewIdle)
	{
		this.character = character;
		this.inventory = inventory;
		this.store = store;
		this.viewTitle = viewTitle;
		this.viewIdle = viewIdle;
	}
	
	// 게임 진행 여부 및 진행시 이름 설정
	public void judgeToPlay()
	{
		String name;
		int i_temp;
		viewTitle.showTitle();
		do
		{
			i_temp = input.nextInt();
			if(i_temp > 2 || i_temp < 1){
				System.out.println(" 잘못된 입력입니다.");
				System.out.println(" 다시 입력해주세요.");
			}
			else if(i_temp == 2){
				System.exit(1);
			}
		}
		while(i_temp > 2 || i_temp < 1);
		
		viewTitle.showTitle2();
		input.nextLine();
		input.nextLine();
		
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
