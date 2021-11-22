package a08_นÝบน;

public class Loop {

	public static void main(String[] args) {
		
		int number = 1;
		int result = 0;
		
		while(true)
		{
			result += number++;
			if(number == 101)
			{
				break;
			}
		}
		
		System.out.println(result);
		
	}
	
}
