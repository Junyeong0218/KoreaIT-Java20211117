package demo;

public class test1 {

	public static void main(String[] args) {
		
		// 생성 & 호출만
		
		Character character = new Character();
		Material[] material = new Material[6];
		Product[] product = new Product[10];
		Inventory inventory = new Inventory(material, product);
		
		ViewIdle viewIdle = new ViewIdle(character, inventory);
		
		Controller controller = new Controller(character, inventory, viewIdle);
				
		controller.judgeToPlay();
		
		controller.mainMenu();
	}

}
