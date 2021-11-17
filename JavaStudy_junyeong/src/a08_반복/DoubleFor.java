package a08_반복;

public class DoubleFor {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++)
		{
			System.out.println(i+1 + "번째 바퀴");
			
			for(int j = 0; j < 5; j++)
			{
				System.out.println("코끼리코 " + (j+1) + "번째");
			}
		}

	}

}
