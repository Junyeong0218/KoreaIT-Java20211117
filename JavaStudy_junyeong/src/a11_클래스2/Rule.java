package a11_클래스2;

public class Rule {

	// 메소드 오버로딩
	
	public boolean isEmpty(String string) {
		return string == null || string.equals("");
	}
	
	public boolean isEmpty(int number) {
		return number == 0;
	}
	
}
