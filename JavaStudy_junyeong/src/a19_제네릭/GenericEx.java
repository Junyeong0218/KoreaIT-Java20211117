package a19_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
class Message<T> {
	private int code;
	private T msg;
}

@AllArgsConstructor
@NoArgsConstructor
@Data
class ErrorMessage<T extends Error> {
	private int code;
	private T msg;
}

@AllArgsConstructor
@NoArgsConstructor
@Data
class Error {
	private int errorNumber;
	private String msg;
}

@AllArgsConstructor
@NoArgsConstructor
@Data
class WebError extends Error {
	private String msgDtl;
}

public class GenericEx {

	public static void main(String[] args) {
		Message<?> m = new Message<String>(200, "전송성공");
		System.out.println(m);
		
		Message<?> m2 = new Message<Error>(400, new Error(3, "경로에 접근할 권한이 없습니다."));
		System.out.println(m2);
		
		// ? = 와일드카드
		// extends 뒤에 있는 객체를 상속받은 객체만 와일드카드에 들어갈 수 있다.
		// 대입연산자 뒤에 객체를 실제로 생성할 때는 어떤 객체를 받을지 무조건 입력해줘야한다.
		ErrorMessage<? extends Error> em = new ErrorMessage<WebError>(200, new WebError(new Error(4, "경로에 오류가 있습니다.") + "웹주소 오류"));
		System.out.println(em);
		
	}
}
