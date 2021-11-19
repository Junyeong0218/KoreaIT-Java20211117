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
	
	// 게임 진행 여부 및 진행시 이름 설정
	public void judgeToPlay()
	{
		String name;
		int i_temp;
		viewIdle.showTitle();
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
		
		viewIdle.showTitle2();
		input.nextLine();
		input.nextLine();
		
		viewIdle.showInputName();
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
	
	// 제작 메뉴 구현 완료
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
				// 재료 2개일 때
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
		viewIdle.showInventory();
		
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
	
	// 상점 메뉴
	public void selectStore()
	{
		boolean wrongInput = false;
		
		int i_temp;
		
		do
		{
			viewIdle.showStore(wrongInput);
			i_temp = input.nextInt();
			
			// 범위 밖의 숫자 입력시
			if(i_temp > 3 || i_temp < 1)
			{
				wrongInput = true;
				viewIdle.showStore(wrongInput);
			}
			// 재료 구매
			else if(i_temp == 1)
			{
				wrongInput = false;
				int i_temp2;
				
				viewIdle.showBuyMaterial(wrongInput);
				
				do
				{
					i_temp2 = input.nextInt();
					
					// 범위 밖의 숫자 입력시
					if(i_temp2 > 7 || i_temp2 < 1)
					{
						wrongInput = true;
						viewIdle.showBuyMaterial(wrongInput);
					}
					// 재료 정확히 선택시
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
							// 수량까지 정확히 입력한 경우
							else if(quantity > 0 && quantity < 1001)
							{
								// 소지금이 구매가격보다 적을 경우
								if(character.getMoney() < (quantity * inventory.material[i_temp2-1].getPrice() ) )
								{
									System.out.println(" 소지금이 부족합니다.");
									System.out.println(" 이전 화면으로 돌아갑니다.");
								}
								// 소지금이 충분할 경우
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
			// 제품 판매
			else if(i_temp == 2)
			{
				wrongInput = false;
				int i_temp2;
				
				viewIdle.showSellProduct(wrongInput);
				
				do
				{
					i_temp2 = input.nextInt();
					
					// 범위 밖의 숫자 입력시
					if(i_temp2 < 1 || i_temp2 > 11)
					{
						wrongInput = true;
						viewIdle.showSellProduct(wrongInput);
					}
					// 제품 정확히 선택시
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
							
							// 범위 밖의 숫자 입력시
							if(quantity < 0 || quantity > currentQuantity )
							{
								wrongInput = true;
								viewIdle.showSellProductQuantity(i_temp2, wrongInput);
							}
							// 제품 수량 정확히 입력시
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
			// 메인으로 돌아가기
			else if(i_temp == 3)
			{
				break;
			}
		}
		while(true);
	}

}
