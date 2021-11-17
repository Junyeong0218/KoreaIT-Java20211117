package demo;

public class ViewIdle {
	
	Character character = null;
	
	public ViewIdle(Character character)
	{
		this.character = character;
	}
	
	public void showIdle()
	{
		character.showInfo();
		System.out.println("1. 제작하기");
		System.out.println("2. 인벤토리");
		System.out.println("3. 상점");
		System.out.println("4. 게임종료");
		System.out.println();
		System.out.println(" 원하는 메뉴의 숫자를 입력해주세요.");
		System.out.println("##########################");
		System.out.println();
	}
	
	public void showMaking()
	{
		clearLines();
		System.out.println("제작화면입니다.");
	}
	
	public void showInventory()
	{
		clearLines();
		System.out.println("인벤토리입니다.");
	}
	
	public void showStore()
	{
		clearLines();
		System.out.println("상점화면입니다.");
	}
	
	public void clearLines()
	{
		for(int i = 0; i < 55; i++)
		{
			System.out.println();
		}
	}
	
	
	

}
