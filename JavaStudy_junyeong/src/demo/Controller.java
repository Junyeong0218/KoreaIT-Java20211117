package demo;

import java.util.Random;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterMakeAndModel;

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
	
	// 메인 화면
	public void mainMenu()
	{
		int i_temp;
		
		do
		{
			viewIdle.showIdle();
			i_temp = input.nextInt();
			if(i_temp > 4 || i_temp < 1)
			{
				System.out.println(" 잘못된 입력입니다.");
				System.out.println(" 다시 입력해주세요.");
			}
			else if(i_temp == 1)
			{
				makingProduct();
				i_temp = 0;
			}
			else if(i_temp == 2)
			{
				viewIdle.showInventory();
				selectInventory();
				i_temp = 0;
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
	
	// 제작 메뉴
	public void makingProduct()
	{
		int i_temp;
		
		do
		{
			viewIdle.showMakableProduct();
			
			i_temp = input.nextInt();
			
			if(i_temp > 11 || i_temp < 0)
			{
				System.out.println(" 잘못된 입력입니다.");
				System.out.println(" 다시 입력해주세요.");
			}
			else if(i_temp == 11)
			{
				break;
			}
			else
			{
				// 현재 보유 재료 파악을 위한 인덱스 검색
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
				
				// 몇 개 제작이 가능한지 검색
				boolean isPossible;
				int possibleQuantity;
				
				// 재료 3개일 때
				if(i_index_3 != -1)
				{
					if(inventory.material[i_index_1].getCurrentHave() > inventory.product[i_temp-1].getNeededMaterialQuantity_1() )
					{
						possibleQuantity = inventory.material[i_index_1].getCurrentHave() / inventory.product[i_temp-1].getNeededMaterialQuantity_1();
						
						if(inventory.material[i_index_2].getCurrentHave() > inventory.product[i_temp-1].getNeededMaterialQuantity_2() )
						{
							if(possibleQuantity > inventory.material[i_index_2].getCurrentHave() / inventory.product[i_temp-1].getNeededMaterialQuantity_2() )
							{
								possibleQuantity = inventory.material[i_index_2].getCurrentHave() / inventory.product[i_temp-1].getNeededMaterialQuantity_2();
							}
							
							if(inventory.material[i_index_3].getCurrentHave() > inventory.product[i_temp-1].getNeededMaterialQuantity_3() )
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
				// 재료 2개일 때
				else
				{
					if(inventory.material[i_index_1].getCurrentHave() > inventory.product[i_temp-1].getNeededMaterialQuantity_1() )
					{
						possibleQuantity = inventory.material[i_index_1].getCurrentHave() / inventory.product[i_temp-1].getNeededMaterialQuantity_1();
						
						if(inventory.material[i_index_2].getCurrentHave() > inventory.product[i_temp-1].getNeededMaterialQuantity_2() )
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
				
				// 제작이 가능할 경우
				if(isPossible)
				{
					int madeProductQuantity;
					
					do
					{
						madeProductQuantity = input.nextInt();
						
						if(madeProductQuantity > possibleQuantity)
						{
							System.out.println(" 제작 수량이 올바르지 않습니다.");
							System.out.println(" 확인 후 다시 입력해주세요.");
						}
						else if(madeProductQuantity == 0)
						{
							break;
						}
					}
					while(madeProductQuantity > possibleQuantity);
					
					Random random = new Random();
					
					// 제작 시도
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
						
						// 성공시
						if(rand < successRate )
						{
							int doubleMake = 1;
							// 대성공 판단
							rand = random.nextInt(10000)+1;
							if(rand < inventory.product[i_temp-1].getDOUBLEMAKINGRATE() * 10000 )
							{
								doubleMake = 2;
							}
							
							viewIdle.successedMaikng(doubleMake);
							
							inventory.product[i_temp-1].makeProduct(1 * doubleMake);
							inventory.material[i_index_1].useMaterial(inventory.product[i_temp-1].getNeededMaterialQuantity_1() );
							inventory.material[i_index_2].useMaterial(inventory.product[i_temp-1].getNeededMaterialQuantity_2() );
							// 재료가 3종류일때
							if(i_index_3 != -1)
							{
								inventory.material[i_index_3].useMaterial(inventory.product[i_temp-1].getNeededMaterialQuantity_3() );
							}
							// 경험치 증가 && 대성공시 경험치 2배 && 레벨업 판단
							if(doubleMake == 1)
							{
								character.earnExp(inventory.product[i_temp-1].getExp() );
								character.judgeLevelUp(character.getLevel(), character.getExp() );
							} else {
								character.earnExp(inventory.product[i_temp-1].getExp() * 2 );
								character.judgeLevelUp(character.getLevel(), character.getExp() );
							}
							
						}
						// 실패시
						else
						{
							viewIdle.failedMaking();
							
							inventory.material[i_index_1].useMaterial(inventory.product[i_temp-1].getNeededMaterialQuantity_1() );
							inventory.material[i_index_2].useMaterial(inventory.product[i_temp-1].getNeededMaterialQuantity_2() );
							// 재료가 3종류일때
							if(i_index_3 != -1)
							{
								inventory.material[i_index_3].useMaterial(inventory.product[i_temp-1].getNeededMaterialQuantity_3() );
							}
						}
						
					}
					
					viewIdle.afterMaking();
					
				}
				// 제작이 불가능할 경우
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
	
	// 인벤토리 내부 구현 완료
	public void selectInventory()
	{
		int i_temp;
		
		do
		{
			i_temp = input.nextInt();
			if(i_temp < 1 || i_temp > 3)
			{
				System.out.println(" 잘못된 입력입니다.");
				System.out.println(" 다시 입력해주세요.");
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
	
	

}
