package a20_�÷���;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		Map<String, User> userMap = new HashMap<String, User>();
		// String == keyValue, User == value
		// Set<key> keySet() -> key ���� Set ���·� ��ȯ
		userMap.put("hippo2003", new User("hippo2003", "1234", "���ؿ�", "hippo2003@naver.com"));
		userMap.put("hippo2004", new User("hippo2004", "1234", "���ؿ�", "hippo2003@naver.com"));
		userMap.put("hippo2005", new User("hippo2005", "1234", "���ؿ�", "hippo2003@naver.com"));
		userMap.put("hippo2006", new User("hippo2006", "1234", "���ؿ�", "hippo2003@naver.com"));
		userMap.put("hippo2007", new User("hippo2007", "1234", "���ؿ�", "hippo2003@naver.com"));
		userMap.put("hippo2008", new User("hippo2008", "1234", "���ؿ�", "hippo2003@naver.com"));
		
		//userMap.replace("hippo2003", new User("hippo2008", "4312", "���ؿ�8", "hippo2003@naver.com"));
		
		String username = "hippo2003";
		
		System.out.println(userMap.get("hippo2003"));
		
		Set<String> keySet = userMap.keySet();
		Iterator<String> ir = keySet.iterator();
		while(ir.hasNext()) {
			User user = userMap.get(ir.next());
			if(user.getUserName().equals(username)) {
				System.out.println(user);
			}
		}

		System.out.println(userMap);
	}
}
