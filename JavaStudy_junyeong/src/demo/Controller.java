package demo;

import java.util.Random;
import java.util.Scanner;

public class Controller {
	
	Character character = null;
	Inventory inventory = null;
	
	ViewIdle viewIdle = null;
	
	Scanner input = new Scanner(System.in);
	
	public Controller(Character character, Inventory inventory, ViewIdle viewIdle)
	{
		this.character = character;
		this.inventory = inventory;
		this.viewIdle = viewIdle;
	}
	
	// ���� ���� ���� �� ����� �̸� ����
	public void judgeToPlay()
	{
		String name;
		int i_temp;
		viewIdle.showTitle();
		do
		{
			i_temp = input.nextInt();
			if(i_temp > 2 || i_temp < 1){
				System.out.println(" �߸��� �Է��Դϴ�.");
				System.out.println(" �ٽ� �Է����ּ���.");
			}
			else if(i_temp == 2){
				System.exit(1);
			}
		}
		while(i_temp > 2 || i_temp < 1);
		
		viewIdle.showTitle2();
		input.nextLine();
		input.nextLine();
		
		viewIdle.showInputName();
		name = input.next();
		character.setName(name);
	}
	
	// ���� ȭ��
	public void mainMenu()
	{
		int i_temp;
		
		do
		{
			viewIdle.showIdle();
			i_temp = input.nextInt();
			if(i_temp > 4 || i_temp < 1)
			{
				System.out.println(" �߸��� �Է��Դϴ�.");
				System.out.println(" �ٽ� �Է����ּ���.");
			}
			else if(i_temp == 1)
			{
				makingProduct();
			}
			else if(i_temp == 2)
			{
				selectInventory();
			}
			else if(i_temp == 3)
			{
				selectStore();
			}
			else
			{
				System.exit(1);
			}	
		}
		while(true);
	}
	
	// ���� �޴� ���� �Ϸ�
	public void makingProduct()
	{
		int i_temp;
		
		do
		{
			viewIdle.showMakableProduct();
			
			i_temp = input.nextInt();
			
			if(i_temp > 11 || i_temp < 0)
			{
				System.out.println(" �߸��� �Է��Դϴ�.");
				System.out.println(" �ٽ� �Է����ּ���.");
			}
			else if(i_temp == 11)
			{
				break;
			}
			else
			{
				// ���� ���� ��� �ľ��� ���� �ε��� �˻�
				int i_index_1 = -1;
				int i_index_2 = -1;
				int i_index_3 = -1;
				
				for(int i = 0; i < 6; i++)
				{
					if(inventory.material[i].materialName == inventory.product[i_temp-1].getNeededMaterialName_1() )
					{
						i_index_1 = i;
					} else if(inventory.material[i].materialName == inventory.product[i_temp-1].getNeededMaterialName_2() )
					{
						i_index_2 = i;
					} else if(inventory.material[i].materialName == inventory.product[i_temp-1].getNeededMaterialName_3() )
					{
						i_index_3 = i;
					}
				}
				
				// �� �� ������ �������� �˻�
				boolean isPossible;
				int possibleQuantity;
				
				// ��� 3���� ��
				if(i_index_3 != -1)
				{
					if(inventory.material[i_index_1].getCurrentHave() > inventory.product[i_temp-1].getNeededMaterialQuantity_1()-1 )
					{
						possibleQuantity = inventory.material[i_index_1].getCurrentHave() / inventory.product[i_temp-1].getNeededMaterialQuantity_1();
						
						if(inventory.material[i_index_2].getCurrentHave() > inventory.product[i_temp-1].getNeededMaterialQuantity_2()-1 )
						{
							if(possibleQuantity > inventory.material[i_index_2].getCurrentHave() / inventory.product[i_temp-1].getNeededMaterialQuantity_2() )
							{
								possibleQuantity = inventory.material[i_index_2].getCurrentHave() / inventory.product[i_temp-1].getNeededMaterialQuantity_2();
							}
							
							if(inventory.material[i_index_3].getCurrentHave() > inventory.product[i_temp-1].getNeededMaterialQuantity_3()-1 )
							{
								isPossible = true;
								
								if(possibleQuantity > inventory.material[i_index_3].getCurrentHave() / inventory.product[i_temp-1].getNeededMaterialQuantity_3() )
								{
									possibleQuantity = inventory.material[i_index_3].getCurrentHave() / inventory.product[i_temp-1].getNeededMaterialQuantity_3();
								}
								
							}
							else
							{
								isPossible = false;
								possibleQuantity = 0;
							}
						}
						else
						{
							isPossible = false;
							possibleQuantity = 0;
						}
					}
					else
					{
						isPossible = false;
						possibleQuantity = 0;
					}
				}
				// ��� 2���� ��
				else
				{
					if(inventory.material[i_index_1].getCurrentHave() > inventory.product[i_temp-1].getNeededMaterialQuantity_1()-1 )
					{
						possibleQuantity = inventory.material[i_index_1].getCurrentHave() / inventory.product[i_temp-1].getNeededMaterialQuantity_1();
						
						if(inventory.material[i_index_2].getCurrentHave() > inventory.product[i_temp-1].getNeededMaterialQuantity_2()-1 )
						{
							isPossible = true;
							
							if(possibleQuantity > inventory.material[i_index_2].getCurrentHave() / inventory.product[i_temp-1].getNeededMaterialQuantity_2() ) {
								possibleQuantity = inventory.material[i_index_2].getCurrentHave() / inventory.product[i_temp-1].getNeededMaterialQuantity_2();
							}
						}
						else
						{
							isPossible = false;
							possibleQuantity = 0;
						}
					}
					else
					{
						isPossible = false;
						possibleQuantity = 0;
					}
				}
				
				viewIdle.showDetailMaking(i_temp, i_index_1, i_index_2, i_index_3, isPossible, possibleQuantity);
				
				// ������ ������ ���
				if(isPossible)
				{
					int madeProductQuantity;
					
					do
					{
						madeProductQuantity = input.nextInt();
						
						if(madeProductQuantity > possibleQuantity)
						{
							System.out.println(" ���� ������ �ùٸ��� �ʽ��ϴ�.");
							System.out.println(" Ȯ�� �� �ٽ� �Է����ּ���.");
						}
						else if(madeProductQuantity == 0)
						{
							break;
						}
					}
					while(madeProductQuantity > possibleQuantity);
					
					Random random = new Random();
					
					// ���� �õ�
					for(int i = 0; i < madeProductQuantity; i++)
					{
						int rand = random.nextInt(10000)+1;
						int successRate;
						
						if( ( ( inventory.product[i_temp-1].getbasicSuccessRate() + character.getBonusPercent(character.getLevel() ) ) * 10000 ) > 10000)
						{
							successRate = 10001;
						}
						else
						{
							successRate = (int)((inventory.product[i_temp-1].getbasicSuccessRate() + character.getBonusPercent(character.getLevel() ) ) * 10000);
						}
						
						// ������
						if(rand < successRate )
						{
							int doubleMake = 1;
							// �뼺�� �Ǵ�
							rand = random.nextInt(10000)+1;
							if(rand < inventory.product[i_temp-1].getDOUBLEMAKINGRATE() * 10000 )
							{
								doubleMake = 2;
							}
							
							viewIdle.successedMaikng(doubleMake);
							
							inventory.product[i_temp-1].makeProduct(1 * doubleMake);
							inventory.material[i_index_1].useMaterial(inventory.product[i_temp-1].getNeededMaterialQuantity_1() );
							inventory.material[i_index_2].useMaterial(inventory.product[i_temp-1].getNeededMaterialQuantity_2() );
							// ��ᰡ 3�����϶�
							if(i_index_3 != -1)
							{
								inventory.material[i_index_3].useMaterial(inventory.product[i_temp-1].getNeededMaterialQuantity_3() );
							}
							// ����ġ ���� && �뼺���� ����ġ 2�� && ������ �Ǵ�
							if(doubleMake == 1)
							{
								character.earnExp(inventory.product[i_temp-1].getExp() );
								character.judgeLevelUp(character.getLevel(), character.getExp() );
							} else {
								character.earnExp(inventory.product[i_temp-1].getExp() * 2 );
								character.judgeLevelUp(character.getLevel(), character.getExp() );
							}
							
						}
						// ���н�
						else
						{
							viewIdle.failedMaking();
							
							inventory.material[i_index_1].useMaterial(inventory.product[i_temp-1].getNeededMaterialQuantity_1() );
							inventory.material[i_index_2].useMaterial(inventory.product[i_temp-1].getNeededMaterialQuantity_2() );
							// ��ᰡ 3�����϶�
							if(i_index_3 != -1)
							{
								inventory.material[i_index_3].useMaterial(inventory.product[i_temp-1].getNeededMaterialQuantity_3() );
							}
						}
						
					}
					
					viewIdle.afterMaking();
					
				}
				// ������ �Ұ����� ���
				else
				{
					
					input.nextLine();
					input.nextLine();
				}
				
				i_temp = -1;
			}
		}
		while(i_temp > 11 || i_temp < 0);
	}
	
	// �κ��丮 ���� ���� �Ϸ�
	public void selectInventory()
	{
		viewIdle.showInventory();
		
		int i_temp;
		
		do
		{
			i_temp = input.nextInt();
			if(i_temp < 1 || i_temp > 3)
			{
				System.out.println(" �߸��� �Է��Դϴ�.");
				System.out.println(" �ٽ� �Է����ּ���.");
			}
			else if(i_temp == 1)
			{
				viewIdle.showCurrentMaterial();
				input.nextLine();
				input.nextLine();
				viewIdle.showInventory();
				i_temp = 0;
			}
			else if(i_temp == 2)
			{
				viewIdle.showCurrentProduct();
				input.nextLine();
				input.nextLine();
				viewIdle.showInventory();
				i_temp = 0;
			}
			else if(i_temp == 3)
			{
				break;
			}
			
		}
		while(i_temp < 1 || i_temp > 3);
		
	}
	
	// ���� �޴�
	public void selectStore()
	{
		boolean wrongInput = false;
		
		int i_temp;
		
		do
		{
			viewIdle.showStore(wrongInput);
			i_temp = input.nextInt();
			
			// ���� ���� ���� �Է½�
			if(i_temp > 3 || i_temp < 1)
			{
				wrongInput = true;
				viewIdle.showStore(wrongInput);
			}
			// ��� ����
			else if(i_temp == 1)
			{
				wrongInput = false;
				int i_temp2;
				
				viewIdle.showBuyMaterial(wrongInput);
				
				do
				{
					i_temp2 = input.nextInt();
					
					// ���� ���� ���� �Է½�
					if(i_temp2 > 7 || i_temp2 < 1)
					{
						wrongInput = true;
						viewIdle.showBuyMaterial(wrongInput);
					}
					// ��� ��Ȯ�� ���ý�
					else if(i_temp2 > 0 && i_temp2 < 7)
					{
						wrongInput = false;
						int quantity;
						
						do
						{
							viewIdle.showBuyMaterialQuantity(i_temp2, wrongInput);
							
							quantity = input.nextInt();
							
							if(quantity > 1000 || quantity < 0)
							{
								wrongInput = true;
								viewIdle.showBuyMaterialQuantity(i_temp2, wrongInput);
							}
							// �������� ��Ȯ�� �Է��� ���
							else if(quantity > 0 && quantity < 1001)
							{
								// �������� ���Ű��ݺ��� ���� ���
								if(character.getMoney() < (quantity * inventory.material[i_temp2-1].getPrice() ) )
								{
									System.out.println(" �������� �����մϴ�.");
									System.out.println(" ���� ȭ������ ���ư��ϴ�.");
								}
								// �������� ����� ���
								else
								{
									character.loseMoney( quantity * inventory.material[i_temp2-1].getPrice() );
									inventory.material[i_temp2-1].buyMaterial(quantity);
									viewIdle.afterBuying();
								}
							}
							
						}
						while(quantity > 1000 || quantity < 0);
						
					}
				
				}
				while(i_temp2 > 7 || i_temp2 < 1);
				
			}
			// ��ǰ �Ǹ�
			else if(i_temp == 2)
			{
				wrongInput = false;
				int i_temp2;
				
				viewIdle.showSellProduct(wrongInput);
				
				do
				{
					i_temp2 = input.nextInt();
					
					// ���� ���� ���� �Է½�
					if(i_temp2 < 1 || i_temp2 > 11)
					{
						wrongInput = true;
						viewIdle.showSellProduct(wrongInput);
					}
					// ��ǰ ��Ȯ�� ���ý�
					else if(i_temp2 > 0 && i_temp2 < 11)
					{
						wrongInput = false;
						int quantity;
						int currentQuantity;
						
						viewIdle.showSellProductQuantity(i_temp2, wrongInput);
						
						do
						{
							quantity = input.nextInt();
							currentQuantity = inventory.product[i_temp2-1].getCurrentHave();
							
							// ���� ���� ���� �Է½�
							if(quantity < 0 || quantity > currentQuantity )
							{
								wrongInput = true;
								viewIdle.showSellProductQuantity(i_temp2, wrongInput);
							}
							// ��ǰ ���� ��Ȯ�� �Է½�
							else if(quantity > 0 && quantity < currentQuantity + 1 )
							{
								character.earnMoney(quantity * inventory.product[i_temp2-1].getPrice() );
								inventory.product[i_temp2-1].sellProduct(quantity);
								viewIdle.afterSelling();
								break;
							}
						}
						while(quantity < 0 || quantity > currentQuantity );
					}
				}
				while(i_temp < 1 || i_temp2 > 11);
			}
			// �������� ���ư���
			else if(i_temp == 3)
			{
				break;
			}
		}
		while(true);
	}

}
