package a17_문자열;

/**
 * 
 * subStrin(int startIndex, int endIndex) 메소드
 * startIndex 부터 endIndex 전까지 문자열을 잘라주는 메소드이다.
 *
 * indexOf(문자열) 메소드
 * 
 *
 */

public class SubString {

	public static void main(String[] args) {
		//String str = "안녕하세요. 반갑습니다.";
		//System.out.println(str.substring(0, 6));
		
		String data = "# 안녕하세요. 반갑습니다.";
		while(data != "" || data == null) {
			System.out.println(data.substring(0, data.indexOf(" ")+1));
			data = data.substring(data.indexOf(" ")+1, data.length());
		}
		
		
		String number = "123456789";
		for(int i=0; i<number.length(); i++) {
			System.out.println(number.substring(i, i+1));
		}
	}
}

// mvnrepository.com
