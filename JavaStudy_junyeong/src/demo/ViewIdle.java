package demo;

public class ViewIdle {
	
	Character character = null;
	Inventory inventory = null;
	
	public ViewIdle(Character character, Inventory inventory)
	{
		this.character = character;
		this.inventory = inventory;
	}
	
	// ���� �޴�
	public void showIdle()
	{
		character.showInfo();
		System.out.println();
		System.out.println("1. �����ϱ�");
		System.out.println("2. �κ��丮");
		System.out.println("3. ����");
		System.out.println("4. ��������");
		System.out.println();
		System.out.println(" ���ϴ� �޴��� ���ڸ� �Է����ּ���.");
		System.out.println();
		System.out.println("#####################################################");
		System.out.println();
	}
	
	// ������ ��ǰ ���� â
	public void showMakableProduct()
	{
		clearLines();
		System.out.println("#####################################################");
		System.out.println();
		System.out.println("#############������ 7% Ȯ���� ����ǰ 2��#############");
		System.out.println();
		for(int i = 0; i < 10; i++)
		{
			System.out.print((i+1) + ". " + inventory.product[i].getProductName() + " ===  ����Ȯ�� : ");
			if( ( inventory.product[i].getbasicSuccessRate() + character.getBonusPercent( character.getLevel() ) ) * 100 > 100)
			{
				System.out.print(100);
			}
			else
			{
				System.out.printf("%.1f", ( inventory.product[i].getbasicSuccessRate() + character.getBonusPercent( character.getLevel() ) ) * 100 );	
			}
			System.out.println("%");
			
			System.out.println();
		}
		System.out.println("11. ���� ȭ������ ���ư���");
		System.out.println();
		System.out.println(" ������ ���ϴ� ��ǰ�� ��ȣ�� �Է����ּ���.");
		System.out.println();
		System.out.println("#####################################################");
		System.out.println();
	}
	
	// ��ǰ �� ���� ���
	public void showDetailMaking(int index, int i_index_1, int i_index_2, int i_index_3, boolean isPossible, int possibleQuantity)
	{
		clearLines();
		System.out.println("#####################################################");
		System.out.println();
		System.out.println("#############������ 7% Ȯ���� ����ǰ 2��#############");
		System.out.println();
		System.out.println("== " + inventory.product[index-1].getProductName() + " ==");
		System.out.println();
		
		System.out.println(inventory.product[index-1].getNeededMaterialName_1() +
				" == ���� : " + inventory.material[i_index_1].currentHave +
				" / �ʿ� : " + inventory.product[index-1].getNeededMaterialQuantity_1() );
		System.out.println();
		System.out.println(inventory.product[index-1].getNeededMaterialName_2() +
				" == ���� : " + inventory.material[i_index_2].currentHave +
				" / �ʿ� : " + inventory.product[index-1].getNeededMaterialQuantity_2() );
		System.out.println();
		if(inventory.product[index-1].getNeededMaterialName_3() != null)
		{
			System.out.println(inventory.product[index-1].getNeededMaterialName_3() +
					" == ���� : " + inventory.material[i_index_3].currentHave +
					" / �ʿ� : " + inventory.product[index-1].getNeededMaterialQuantity_3() );
			System.out.println();
		}
		System.out.println();
		
		if(isPossible)
		{
			System.out.println(" " + possibleQuantity + "�� ������ �����մϴ�.");
			System.out.println();
			System.out.println(" �� ���� �����Ͻðڽ��ϱ�?");
			System.out.println();
			System.out.println(" 0�� �Է��Ͻø�, ���� ȭ������ ���ư��ϴ�. ");
			System.out.println();
			System.out.println("#####################################################");
			System.out.println();
		}
		else
		{
			System.out.println("������ �Ұ����մϴ�.");
			System.out.println();
			System.out.println(" ���͸� �Է��ϸ� ���� ȭ������ ���ư��ϴ�.");
			System.out.println();
			System.out.println("#####################################################");
			System.out.println();
		}
		
		
	}
	
	// ���� ������ ���
	public void successedMaikng(int doubleMake)
	{
		for(int i = 0; i < 3; i++)
		{
			System.out.print(" .");
			try {

				Thread.sleep(1000); //1�� ���

			   } catch (InterruptedException e) {

				e.printStackTrace();

			   }
		}
		System.out.println();
		if(doubleMake == 1)
		{
			System.out.println(" ���ۿ� �����߽��ϴ�!");
		} else {
			System.out.println(" �뼺���Դϴ�!!");
		}
	}
	
	// ���� ���н� ���
	public void failedMaking()
	{
		for(int i = 0; i < 3; i++)
		{
			System.out.print(" .");
			try {

				Thread.sleep(1000); //1�� ���

			   } catch (InterruptedException e) {

				e.printStackTrace();

			   }
		}
		System.out.println();
		System.out.println(" ���ۿ� �����߽��ϴ�.");
	}
	
	// ���� �� ���
	public void afterMaking()
	{
		System.out.println();
		System.out.println(" ��� ������ �Ϸ�Ǿ����ϴ�.");
		System.out.println();
		System.out.println(" 3�� �� ���� ȭ������ ���ư��ϴ�.");
		try {

			Thread.sleep(3000); //1�� ���

		   } catch (InterruptedException e) {

			e.printStackTrace();

		   }
		
	}
	
	// �κ��丮 ����â
	public void showInventory()
	{
		clearLines();
		System.out.println("#####################################################");
		System.out.println();
		System.out.println("1. ��� ��Ȳ");
		System.out.println();
		System.out.println("2. ����ǰ ��Ȳ");
		System.out.println();
		System.out.println("3. ����ȭ������ ���ư���");
		System.out.println();
		System.out.println(" ���ϴ� �޴��� ���ڸ� �Է����ּ���.");
		System.out.println();
		System.out.println("#####################################################");
		System.out.println();
	}
	
	// ���� ���
	
	// �κ��丮 - ���� ��� ��Ȳ
	public void showCurrentMaterial()
	{
		clearLines();
		System.out.println("#####################################################");
		System.out.println();
		for(int i = 0; i < 6; i++)
		{
			System.out.println(inventory.material[i].materialName + " : " + inventory.material[i].currentHave + "��");
			System.out.println();
		}
		System.out.println(" �ƹ�Ű�� �Է��ϸ� �κ��丮 ����â���� ���ư��ϴ�.");
		System.out.println();
		System.out.println("#####################################################");
		System.out.println();
	}
	
	// ���� ����ǰ
	
	// �κ��丮 - ��ǰ ��Ȳ
	public void showCurrentProduct()
	{
		clearLines();
		System.out.println("#####################################################");
		System.out.println();
		for(int i = 0; i < 10; i++)
		{
			System.out.println(inventory.product[i].getProductName() + " : " + inventory.product[i].getCurrentHave() + "��");
			System.out.println();
		}
		System.out.println(" �ƹ�Ű�� �Է��ϸ� �κ��丮 ����â���� ���ư��ϴ�.");
		System.out.println();
		System.out.println("#####################################################");
		System.out.println();
	}
	
	// ����
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
