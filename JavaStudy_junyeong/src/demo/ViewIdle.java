package demo;

public class ViewIdle {
	
	Character character = null;
	Inventory inventory = null;
	
	public ViewIdle(Character character, Inventory inventory)
	{
		this.character = character;
		this.inventory = inventory;
	}
	
	// 메인 메뉴
	public void showIdle()
	{
		character.showInfo();
		System.out.println();
		System.out.println("1. 제작하기");
		System.out.println("2. 인벤토리");
		System.out.println("3. 상점");
		System.out.println("4. 게임종료");
		System.out.println();
		System.out.println(" 원하는 메뉴의 숫자를 입력해주세요.");
		System.out.println();
		System.out.println("#####################################################");
		System.out.println();
	}
	
	// 생산할 제품 선택 창
	public void showMakableProduct()
	{
		clearLines();
		System.out.println("#####################################################");
		System.out.println();
		System.out.println("#############성공시 7% 확률로 생산품 2배#############");
		System.out.println();
		for(int i = 0; i < 10; i++)
		{
			System.out.print((i+1) + ". " + inventory.product[i].getProductName() + " ===  성공확률 : ");
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
		System.out.println("11. 메인 화면으로 돌아가기");
		System.out.println();
		System.out.println(" 생산을 원하는 제품의 번호를 입력해주세요.");
		System.out.println();
		System.out.println("#####################################################");
		System.out.println();
	}
	
	// 제품 상세 정보 출력
	public void showDetailMaking(int index, int i_index_1, int i_index_2, int i_index_3, boolean isPossible, int possibleQuantity)
	{
		clearLines();
		System.out.println("#####################################################");
		System.out.println();
		System.out.println("#############성공시 7% 확률로 생산품 2배#############");
		System.out.println();
		System.out.println("== " + inventory.product[index-1].getProductName() + " ==");
		System.out.println();
		
		System.out.println(inventory.product[index-1].getNeededMaterialName_1() +
				" == 보유 : " + inventory.material[i_index_1].currentHave +
				" / 필요 : " + inventory.product[index-1].getNeededMaterialQuantity_1() );
		System.out.println();
		System.out.println(inventory.product[index-1].getNeededMaterialName_2() +
				" == 보유 : " + inventory.material[i_index_2].currentHave +
				" / 필요 : " + inventory.product[index-1].getNeededMaterialQuantity_2() );
		System.out.println();
		if(inventory.product[index-1].getNeededMaterialName_3() != null)
		{
			System.out.println(inventory.product[index-1].getNeededMaterialName_3() +
					" == 보유 : " + inventory.material[i_index_3].currentHave +
					" / 필요 : " + inventory.product[index-1].getNeededMaterialQuantity_3() );
			System.out.println();
		}
		System.out.println();
		
		if(isPossible)
		{
			System.out.println(" " + possibleQuantity + "개 제작이 가능합니다.");
			System.out.println();
			System.out.println(" 몇 개를 제작하시겠습니까?");
			System.out.println();
			System.out.println(" 0을 입력하시면, 이전 화면으로 돌아갑니다. ");
			System.out.println();
			System.out.println("#####################################################");
			System.out.println();
		}
		else
		{
			System.out.println("제작이 불가능합니다.");
			System.out.println();
			System.out.println(" 엔터를 입력하면 이전 화면으로 돌아갑니다.");
			System.out.println();
			System.out.println("#####################################################");
			System.out.println();
		}
		
		
	}
	
	// 제작 성공시 출력
	public void successedMaikng(int doubleMake)
	{
		for(int i = 0; i < 3; i++)
		{
			System.out.print(" .");
			try {

				Thread.sleep(1000); //1초 대기

			   } catch (InterruptedException e) {

				e.printStackTrace();

			   }
		}
		System.out.println();
		if(doubleMake == 1)
		{
			System.out.println(" 제작에 성공했습니다!");
		} else {
			System.out.println(" 대성공입니다!!");
		}
	}
	
	// 제작 실패시 출력
	public void failedMaking()
	{
		for(int i = 0; i < 3; i++)
		{
			System.out.print(" .");
			try {

				Thread.sleep(1000); //1초 대기

			   } catch (InterruptedException e) {

				e.printStackTrace();

			   }
		}
		System.out.println();
		System.out.println(" 제작에 실패했습니다.");
	}
	
	// 제작 후 출력
	public void afterMaking()
	{
		System.out.println();
		System.out.println(" 모든 제작이 완료되었습니다.");
		System.out.println();
		System.out.println(" 3초 후 제작 화면으로 돌아갑니다.");
		try {

			Thread.sleep(3000); //1초 대기

		   } catch (InterruptedException e) {

			e.printStackTrace();

		   }
		
	}
	
	// 인벤토리 선택창
	public void showInventory()
	{
		clearLines();
		System.out.println("#####################################################");
		System.out.println();
		System.out.println("1. 재료 현황");
		System.out.println();
		System.out.println("2. 제작품 현황");
		System.out.println();
		System.out.println("3. 메인화면으로 돌아가기");
		System.out.println();
		System.out.println(" 원하는 메뉴의 숫자를 입력해주세요.");
		System.out.println();
		System.out.println("#####################################################");
		System.out.println();
	}
	
	// 보유 재료
	
	// 인벤토리 - 제작 재료 현황
	public void showCurrentMaterial()
	{
		clearLines();
		System.out.println("#####################################################");
		System.out.println();
		for(int i = 0; i < 6; i++)
		{
			System.out.println(inventory.material[i].materialName + " : " + inventory.material[i].currentHave + "개");
			System.out.println();
		}
		System.out.println(" 아무키나 입력하면 인벤토리 선택창으로 돌아갑니다.");
		System.out.println();
		System.out.println("#####################################################");
		System.out.println();
	}
	
	// 보유 생산품
	
	// 인벤토리 - 제품 현황
	public void showCurrentProduct()
	{
		clearLines();
		System.out.println("#####################################################");
		System.out.println();
		for(int i = 0; i < 10; i++)
		{
			System.out.println(inventory.product[i].getProductName() + " : " + inventory.product[i].getCurrentHave() + "개");
			System.out.println();
		}
		System.out.println(" 아무키나 입력하면 인벤토리 선택창으로 돌아갑니다.");
		System.out.println();
		System.out.println("#####################################################");
		System.out.println();
	}
	
	// 상점
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
