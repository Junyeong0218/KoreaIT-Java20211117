package a18_lombok;

public class LombokTest {

	public static void main(String[] args) {
		User user = new User();
		User user2 = new User("junil", "1234", "±Ë¡ÿ¿œ", "hippo2003@naver.com");
		
		System.out.println(user);
		System.out.println(user2);
		
	}
}
