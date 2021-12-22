package a22_�����ͺ��̽�;

public class Controller {
	
	private Display display;
	private Input input;
	private SignupService signupService;
	
	public Controller() {
		display = new Display();
		input = new Input();
		signupService = new SignupService();
	}
	
	public boolean mainMenu() {
		String cmd;
		
		display.mainDisplay();
		cmd = input.cmdInput();
		boolean returnFlag = false;
		
		if(cmd.equals("1")) {
			display.signUpDisplay();
			display.signUpMessage(signupService.signup());
		} else if(cmd.equals("2")) {
			
		} else if(cmd.equals("q")) {
			System.out.println("���α׷� ������...");
			returnFlag = true;
		} else {
			input.cmdErrorMessage();
		}
		
		return returnFlag;
	}

	public static void main(String[] args) {
		Controller controller = new Controller();
		
		while(true) {
			if(controller.mainMenu()) {
				break;
			}			
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
	}
}
