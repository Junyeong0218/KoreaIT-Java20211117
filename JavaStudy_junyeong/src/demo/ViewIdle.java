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
		System.out.println("1. �����ϱ�");
		System.out.println("2. �κ��丮");
		System.out.println("3. ����");
		System.out.println("4. ��������");
		System.out.println();
		System.out.println(" ���ϴ� �޴��� ���ڸ� �Է����ּ���.");
		System.out.println("##########################");
		System.out.println();
	}
	
	public void showMaking()
	{
		clearLines();
		System.out.println("����ȭ���Դϴ�.");
	}
	
	public void showInventory()
	{
		clearLines();
		System.out.println("�κ��丮�Դϴ�.");
	}
	
	public void showStore()
	{
		clearLines();
		System.out.println("����ȭ���Դϴ�.");
	}
	
	public void clearLines()
	{
		for(int i = 0; i < 55; i++)
		{
			System.out.println();
		}
	}
	
	
	

}
