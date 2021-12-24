package a22_데이터베이스;

import a22_데이터베이스.service.AuthService;
import a22_데이터베이스.session.Principal;
import a22_데이터베이스.view.Display;
import a22_데이터베이스.view.Input;

/**
 * 
 * MVC 중 Controller 는 Controller Service Repository 로 나뉨
 * Controller = 전제적인 컨트롤러
 * Service = 컨트롤러의 연산부
 * Repository = DB와 소통하는 부분
 *
 */

public class Controller {
	
	private Display display;
	private Input input;
	private AuthService authService;
	private Principal principal;
	
	public Controller() {
		display = new Display();
		input = new Input();
		authService = new AuthService();
		principal = Principal.getInstance();
	}
	
	public boolean mainMenu() {
		String cmd;
		
		display.mainDisplay();
		cmd = input.cmdInput();
		boolean returnFlag = false;
		
		if(cmd.equals("1")) {
			display.signUpDisplay();
			display.signUpMessage(authService.signup());
		} else if(cmd.equals("2")) {
			if(principal.getLoginUser() != null) {
				authService.logout();
			} else {
				display.signinDisplay();
				display.signInMessage(authService.signin());				
			}
		} else if(cmd.equals("q")) {
			System.out.println("프로그램 종료중...");
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
		
		System.out.println("프로그램이 종료되었습니다.");
		
	}
}
