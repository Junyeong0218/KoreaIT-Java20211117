package a16_기본클래스;

/**
 * 
 * 기본클래스란 JRE 라이브러리에서 제공하는 클래스들
 * 
 * 객체자체를 출력하라는 명령에는 객체가 가진 toString() 메소드를 호출한다.
 *
 */
public class ObjectEx {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "안녕하세요. toString입니다.";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	// 본래 equals 는 서로의 주소값이 같은지를 검사해서 boolean 으로 반환하는 메소드다.
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	public static void main(String[] args) {
		ObjectEx objEx = new ObjectEx();
		String str = new String();
		System.out.println(str);
		System.out.println(objEx);
		System.out.println(objEx.hashCode());
		System.out.println(objEx.equals(objEx));
	}
}
