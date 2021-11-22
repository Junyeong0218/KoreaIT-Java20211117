package a09_메소드;

/**
 * 
 * 오버로딩
 * 메소드 이름은 같지만 매개변수가 다르면 다른 메소드로 취급한다.
 */

public class OverloadingEx {
	
	static void 급여Method(int 월급, int 마이너스금액)
	{
		System.out.println(월급 - 마이너스금액);
		System.out.println("사장님 급여 계산");
	}
	
	/**
	 * 
	 * 문자열의 형 변환
	 * 
	 * 1. 문자열 -> int, double
	 * Integer.parseInt("1000000"); 문자열을 정수형으로 변환
	 * Double.parseDouble("1000000"); 문자열을 실수형으로 변환
	 * 
	 * 2. int, double -> 문자열
	 * Integet.toString(1000000); 정수를 문자열로 변환
	 * Double.toString(1000000); 실수를 문자열로 변환
	 * 
	 */
	
	static void 급여Method(int 월급, String 마이너스금액)
	{
		System.out.println(월급 - Integer.parseInt(마이너스금액));
		System.out.println("사장님 급여 계산");
	}
	
	static void 급여Method(int 월급)
	{
		System.out.println(월급);
		System.out.println("직원 급여 계산");
	}
	
	static void 급여Method(String 월급)
	{
		System.out.println(월급);
		System.out.println("직원 급여 계산(문자열)");
	}
	
	public static void main(String[] args) {
		급여Method(1_000_000, "500000");
		System.out.println(Integer.toString(100005555));
	}

}
