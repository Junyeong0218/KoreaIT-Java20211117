package a20_컬렉션;

import java.util.*;

// CRUD
// Create Read Update Delete

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
	
	public User getUserByUsername(String Username) {
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).getUserName().equals(Username)) {
				return users.get(i);
			}
		}
		return null;
	}
	
	public List<User> getUserAll() {
		return users;
	}
	
	public void selectUser() {
		while(true) {
			System.out.println("[ 사용자 조회 ]");
			System.out.println("1. 아이디로 조회");
			System.out.println("2. 전체조회");
			System.out.println("b. 뒤로가기");
			String select = in.nextLine();
		
			if(select.equals("1")) {
				System.out.println("[ 아이디로 사용자 정보 조회 ]");
				System.out.print("조회할 사용자 아이디를 입력해주세요 :");
				String userName = in.nextLine();
				User user = getUserByUsername(userName);
				
				if(user == null) {
					System.out.println("해당 아이디를 사용하는 사용자를 찾을 수 없습니다.");
				} else {
					System.out.println(user);
				}
			} else if(select.equals("2")) {
				System.out.println(getUserAll());
			} else if(select.equals("b")) {
				break;
			} else {
				System.out.println("사용할 수 없는 명령입니다.\n");
			}
		}
	}
	
	public void updatePassword(User user) {
		System.out.print("변경하실 비밀번호를 입력해주세요 : ");
		user.setPassword(in.nextLine());
		System.out.println("비밀번호 변경이 완료되었습니다.");
	}
	
	public void updateName(User user) {
		System.out.print("변경할 이름을 입력해주세요 : ");
		user.setName(in.nextLine());
		System.out.println("이름 변경이 완료되었습니다.");
	}
	
	public void updateEmail(User user) {
		System.out.print("변경할 이메일을 입력해주세요 : ");
		user.setEmail(in.nextLine());
		System.out.println("이메일 변경이 완료되었습니다.");
	}
	
	public void updateUserDtl(User user) {
		while(true) {
			System.out.println("[ " + user.getUserName() + " 사용자 정보 수정 ]");
			System.out.println("1. 비밀번호 변경");
			System.out.println("2. 이름 변경");
			System.out.println("3. 이메일 변경");
			System.out.println("b. 뒤로가기");
			String select = in.nextLine();
			
			if(select.equals("1")) {
				updatePassword(user);
			} else if(select.equals("2")) {
				updateName(user);
			} else if(select.equals("3")) {
				updateEmail(user);
			} else if(select.equals("b")) {
				break;
			} else {
				System.out.println("사용할 수 없는 명령입니다.\n");
			}
		}
	}
	
	public void updateUser() {
		while(true) {
			System.out.println("[ 사용자 정보 수정 ]");
			System.out.print("수정할 사용자의 아이디를 입력해주세요 : (뒤로 돌아가시려면 ` 를 입력해주세요.) ");
			String username = in.nextLine();
			
			if(username == null) {
				System.out.println("해당 아이디를 사용하는 사용자를 찾을 수 없습니다.\n");
			} else if(username.equals("`")) {
				break;
			} else {
				updateUserDtl(getUserByUsername(username));
			}
		}
	}
	
	public void removeUser() {
		while(true) {
			System.out.println("[ 사용자 삭제 ]");
			System.out.println("1. 아이디로 삭제");
			System.out.println("2. 전체삭제");
			System.out.println("b. 뒤로가기");
			String select = in.nextLine();
			
			if(select.equals("1")) {
				System.out.println("[ 아이디로 사용자 정보 삭제 ]");
				System.out.print("삭제할 사용자 아이디를 입력해주세요 :");
				String userName = in.nextLine();
				User user = deleteUserByUsername(userName);
				
				if(user == null) {
					System.out.println("해당 아이디를 사용하는 사용자를 찾을 수 없습니다.");
				} else {
					System.out.println(user);
					System.out.println("유저 정보를 삭제했습니다.");
				}
			} else if(select.equals("2")) {
				deleteUserAll();
				System.out.println("모든 유저 정보를 삭제했습니다.\n");
				break;
			} else if(select.equals("b")) {
				break;
			} else {
				System.out.println("사용할 수 없는 명령입니다.\n");
			}
		}
	}
	
	public User deleteUserByUsername(String Username) {
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).getUserName().equals(Username)) {
				return users.remove(i);
			}
		}
		return null;
	}
	
	public void deleteUserAll() {
		users.clear();
	}
	
	public void displayController() {
		while(true) {
			System.out.println("1. 사용자 입력");
			System.out.println("2. 사용자 조회");
			System.out.println("3. 사용자 삭제");
			System.out.println("4. 사용자 정보 수정");
			System.out.println("q. 프로그램 종료");
			System.out.println("------------------");
			System.out.print("명령을 입력해주세요 : ");
			String cmd = in.nextLine();
			if(cmd.equals("1")) {
				users.add(insertUser());
			} else if(cmd.equals("2")) {
				selectUser();
			} else if(cmd.equals("3")) {
				removeUser();
			} else if(cmd.equals("4")) {
				updateUser();
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
