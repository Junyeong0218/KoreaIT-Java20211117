package a08_반복;

public class NumberPlus100 {

	public static void main(String[] args) {

		int result = 0;
		
		// 참 인동안 반복
		// 초기값은 항상 0 으로 줄 수 있게 연습
		for(int i = 0; i < 101; i++)
		{
			result += i;
		}
		
		System.out.println(result);

	}

}
