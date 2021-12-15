package a20_�÷���;

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
		System.out.println("[ ����� �߰� ]");
		
		System.out.print("���̵� : ");
		user.setUserName(in.nextLine());
		System.out.print("��й�ȣ : ");
		user.setPassword(in.nextLine());
		System.out.print("�̸� : ");
		user.setName(in.nextLine());
		System.out.print("�̸��� : ");
		user.setEmail(in.nextLine());
		
		System.out.println("[ ����� �Է��� �Ϸ�Ǿ����ϴ�. ]\n");
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
			System.out.println("[ ����� ��ȸ ]");
			System.out.println("1. ���̵�� ��ȸ");
			System.out.println("2. ��ü��ȸ");
			System.out.println("b. �ڷΰ���");
			String select = in.nextLine();
		
			if(select.equals("1")) {
				System.out.println("[ ���̵�� ����� ���� ��ȸ ]");
				System.out.print("��ȸ�� ����� ���̵� �Է����ּ��� :");
				String userName = in.nextLine();
				User user = getUserByUsername(userName);
				
				if(user == null) {
					System.out.println("�ش� ���̵� ����ϴ� ����ڸ� ã�� �� �����ϴ�.");
				} else {
					System.out.println(user);
				}
			} else if(select.equals("2")) {
				System.out.println(getUserAll());
			} else if(select.equals("b")) {
				break;
			} else {
				System.out.println("����� �� ���� ����Դϴ�.\n");
			}
		}
	}
	
	public void updatePassword(User user) {
		System.out.print("�����Ͻ� ��й�ȣ�� �Է����ּ��� : ");
		user.setPassword(in.nextLine());
		System.out.println("��й�ȣ ������ �Ϸ�Ǿ����ϴ�.");
	}
	
	public void updateName(User user) {
		System.out.print("������ �̸��� �Է����ּ��� : ");
		user.setName(in.nextLine());
		System.out.println("�̸� ������ �Ϸ�Ǿ����ϴ�.");
	}
	
	public void updateEmail(User user) {
		System.out.print("������ �̸����� �Է����ּ��� : ");
		user.setEmail(in.nextLine());
		System.out.println("�̸��� ������ �Ϸ�Ǿ����ϴ�.");
	}
	
	public void updateUserDtl(User user) {
		while(true) {
			System.out.println("[ " + user.getUserName() + " ����� ���� ���� ]");
			System.out.println("1. ��й�ȣ ����");
			System.out.println("2. �̸� ����");
			System.out.println("3. �̸��� ����");
			System.out.println("b. �ڷΰ���");
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
				System.out.println("����� �� ���� ����Դϴ�.\n");
			}
		}
	}
	
	public void updateUser() {
		while(true) {
			System.out.println("[ ����� ���� ���� ]");
			System.out.print("������ ������� ���̵� �Է����ּ��� : (�ڷ� ���ư��÷��� ` �� �Է����ּ���.) ");
			String username = in.nextLine();
			
			if(username == null) {
				System.out.println("�ش� ���̵� ����ϴ� ����ڸ� ã�� �� �����ϴ�.\n");
			} else if(username.equals("`")) {
				break;
			} else {
				updateUserDtl(getUserByUsername(username));
			}
		}
	}
	
	public void removeUser() {
		while(true) {
			System.out.println("[ ����� ���� ]");
			System.out.println("1. ���̵�� ����");
			System.out.println("2. ��ü����");
			System.out.println("b. �ڷΰ���");
			String select = in.nextLine();
			
			if(select.equals("1")) {
				System.out.println("[ ���̵�� ����� ���� ���� ]");
				System.out.print("������ ����� ���̵� �Է����ּ��� :");
				String userName = in.nextLine();
				User user = deleteUserByUsername(userName);
				
				if(user == null) {
					System.out.println("�ش� ���̵� ����ϴ� ����ڸ� ã�� �� �����ϴ�.");
				} else {
					System.out.println(user);
					System.out.println("���� ������ �����߽��ϴ�.");
				}
			} else if(select.equals("2")) {
				deleteUserAll();
				System.out.println("��� ���� ������ �����߽��ϴ�.\n");
				break;
			} else if(select.equals("b")) {
				break;
			} else {
				System.out.println("����� �� ���� ����Դϴ�.\n");
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
			System.out.println("1. ����� �Է�");
			System.out.println("2. ����� ��ȸ");
			System.out.println("3. ����� ����");
			System.out.println("4. ����� ���� ����");
			System.out.println("q. ���α׷� ����");
			System.out.println("------------------");
			System.out.print("����� �Է����ּ��� : ");
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
				System.out.println("���α׷� ������...\n");
				break;
			} else {
				System.out.println("����� �� ���� ����Դϴ�.\n");
			}
		}
	}
	
	public static void main(String[] args) {
		UserArrayList ual = new UserArrayList();
		ual.displayController();
		
		System.out.println("���α׷� ����");
	}
}
