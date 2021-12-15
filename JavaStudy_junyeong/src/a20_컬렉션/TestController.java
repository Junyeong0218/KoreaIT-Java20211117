package a20_컬렉션;

import java.util.HashMap;
import java.util.Map;

public class TestController {

	public static void main(String[] args) {
		int flag = 3;
		
		if(flag == 1) {
			System.out.println("전송 성공 메세지 전달");
			Message<String> msg = new Message<String>();
			msg.setCode(200);
			msg.setData("성공했습니다.");
			System.out.println(msg);
		} else {
			System.out.println("전송 실패");
			Message<Map<Integer, String>> msg = new Message<Map<Integer, String>>();
			Map<Integer, String> error = new HashMap<Integer, String>();
			error.put(3, "권한이 없습니다.");
			error.put(4, "경로를 찾을 수 없습니다.");
			msg.setCode(400);
			msg.setData(error);
			System.out.println(msg);
		}
	}
}
