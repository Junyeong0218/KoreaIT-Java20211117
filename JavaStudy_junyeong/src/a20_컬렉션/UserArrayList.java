package a20_컬렉션;

import java.util.*;

public class UserArrayList {
	private Scanner in;
	private List<User> users;
	
	public UserArrayList() {
		in = new Scanner(System.in);
		users = new ArrayList<User>();
	}
	
	public User insertUser() {
		User user = new User();
		System.out.println("[ 사용자 추가 ]");
		
		System.out.print("아이디 : ");
		user.setUserName(in.nextLine());
		System.out.print("비밀번호 : ");
		user.setPassword(in.nextLine());
		System.out.print("이름 : ");
		user.setName(in.nextLine());
		System.out.print("이메일 : ");
		user.setEmail(in.nextLine());
		
		System.out.println("[ 사용자 입력이 완료되었습니다. ]\n");
		return user;
	}
	
	public void displayController() {
		while(true) {
			System.out.println("1. 사용자 입력");
			System.out.println("2. 사용자 조회");
			System.out.println("3. 사용자 삭제");
			System.out.println("q. 프로그램 종료");
			System.out.println("------------------");
			System.out.print("명령을 입력해주세요 : ");
			String cmd = in.nextLine();
			if(cmd.equals("1")) {
				users.add(insertUser());
			} else if(cmd.equals("2")) {
				System.out.println(users + "\n");
			} else if(cmd.equals("3")) {
				System.out.println("사용자삭제선택");
			} else if(cmd.equals("q")) {
				System.out.println("프로그램 종료중...\n");
				break;
			} else {
				System.out.println("사용할 수 없는 명령입니다.\n");
			}
		}
	}
	
	public static void main(String[] args) {
		UserArrayList ual = new UserArrayList();
		ual.displayController();
		
		System.out.println("프로그램 종료");
	}
}
