package a12_�迭;

public class customArraySort {
	/**
	 * 
	 * sort(����)
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		//int[] number = new int[10];
		
		int[] number = {10, 20, 0, 40, 0, 50, 30, 0, 0};
		
		/*for(int i = 0; i < number.length; i++) {
			if(number[i] == 0) {
				for(int j = i; j < number.length; j++) {
					if(j == number.length-1) {
						number[j] = 0;
						break;
					} else {
						number[j] = number[j+1];
						
					}
					
				}
			}
		}*/
		
		// ���� ���� �տ� ������ ����
		for(int i = 0; i < number.length; i++) {
			
			for(int j = number.length-1; j > i-1; j--) {
				
				if(number[i] == 0) {
					break;
				}
				else if(number[i] >= number[j]) {
					
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
			
		}
		
		for(int num : number) {
			System.out.println(num);
		}
		
		//https://www.acmicpc.net/ < �˰��� ���� ����Ʈ Ǯ���
		
	}
	
}
