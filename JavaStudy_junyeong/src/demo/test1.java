package demo;

public class test1 {

	public static void main(String[] args) {
		
		// 생성 & 호출만
		
		Character character = new Character();
		Inventory inventory = new Inventory();
		Store store = new Store();
		
		ViewTitle viewTitle = new ViewTitle();
		ViewIdle viewIdle = new ViewIdle(character);
		
		Controller controller = new Controller(character, inventory, store, viewTitle, viewIdle);
		
		controller.judgeToPlay();
		
		controller.mainMenu();
	}

}
