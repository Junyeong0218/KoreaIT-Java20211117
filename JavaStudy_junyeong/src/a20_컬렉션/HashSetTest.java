package a20_�÷���;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public HashSetTest() {
		
	}
	
	public static void main(String[] args) {
		Set<User> userSet = new HashSet<User>();
		
		userSet.add(new User("hippo2003", "1234", "���ؿ�", "hippo2003@naver.com"));
		userSet.add(new User("hippo2004", "1234", "���ؿ�", "hippo2003@naver.com"));
		userSet.add(new User("hippo2005", "1234", "���ؿ�", "hippo2003@naver.com"));
		userSet.add(new User("hippo2006", "1234", "���ؿ�", "hippo2003@naver.com"));
		userSet.add(new User("hippo2007", "1234", "���ؿ�", "hippo2003@naver.com"));
		userSet.add(new User("hippo2008", "1234", "���ؿ�", "hippo2003@naver.com"));
		
		Iterator<User> ir = userSet.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		System.out.println(userSet);
		
		Set<String> strSet = new HashSet<String>();
		
		strSet.add("������");
		strSet.add("������");
		strSet.add("������");
		strSet.add("������");
		strSet.add("������");
		strSet.add("������");
		strSet.add("������");
		
		System.out.println(strSet.size());
	}
}
