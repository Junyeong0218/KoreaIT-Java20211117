package a21_static;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
class User {
	private static int autoId;
	private int id = 20210000;
	private String username;
	private String password;
	private String name;
	private String email;
	
	public User() {
		id += (++autoId);
	}
	
	public User(String username, String password, String name, String email) {
		super();
		this.id += (++autoId);
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}
}

/**
 * 
 * 싱글톤 = 클래스가 단 하나의 인스턴스만 만들 수 있는 구조
 * 접근 제어자 = private
 *
 */

public class StaticTest {

	public static void main(String[] args) {
		
		List<User> userList = new ArrayList<User>();
		
		User user = new User("hippo2003", "1234", "박준영", "hippo2003@naver.com");
		User user1 = new User("hippo2003", "1234", "박준영", "hippo2003@naver.com");
		User user2 = new User("hippo2003", "1234", "박준영", "hippo2003@naver.com");
		User user3 = new User("hippo2003", "1234", "박준영", "hippo2003@naver.com");
		
		userList.add(user);
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
		System.out.println(userList);
	}
}
