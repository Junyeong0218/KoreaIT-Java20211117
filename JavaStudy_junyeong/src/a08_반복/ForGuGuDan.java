package a08_반복;

public class ForGuGuDan {

	public static void main(String[] args) {

		int dan = 2;
		
		for(int i = 1; i < 10; i++)
		{
			System.out.println(dan + " X " + i + " = " + dan*i);
		}
		
		// 조건변환식이 규칙적으로 변할 때는 For 문이 유리
		
		// 조건변환식이 복잡한 형태가 될 때는 While 문이 유리

	}

}
