package a05_연산자;

public class Operation2 {

	public static void main(String[] args) {
		
		/**
		 * <논리 연산자> = 참 or 거짓 (boolean)
		 * AND 연산 (&&) = 곱 
		 * OR 연산 (||) = 합
		 * NOT 연산 (!) = 반전
		 * 
		 * TRUE = 1
		 * FALSE = 0
		 * 
		 * <AND>
		 * TRUE && FALSE -> FALSE
		 * TRUE && TRUE -> TRUE
		 * FALSE && FALSE -> FALSE
		 * 
		 * <OR>
		 * TRUE || FALSE -> TRUE
		 * TRUE || TRUE -> TRUE
		 * FALSE || FALSE -> FALSE
		 * 
		 * <NOT>
		 * !TRUE = FALSE
		 * !FALSE = TRUE
		 * 
		 * <EXAMPLE>
		 * !(TRUE && TRUE) -> FALSE
		 * !(FALSE || FLASE) -> TRUE
		 */
		
		System.out.println(!(true && true));
		
		/**
		 * 상항(조건) 연산자
		 * boolean trueAndFalse = 조건 ? 결과(참) : 결과(거짓) ;
		 * 
		 */
		
		boolean trueAndFalse = (10 < 20) ? true : false ;
		
		String grade = (59 < 60) ? "F등급" : "F가 아닙니다" ;
		
		System.out.println(trueAndFalse);
		System.out.println(grade);
		
		System.out.println("\"안녕\"");
		// "를 출력시키고 싶으면 쌍따옴표 앞에 역슬래시
		
 	}

}
