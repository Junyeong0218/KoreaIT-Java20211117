package a23_예외;

public class TryCatch {

	public static void main(String[] args) {
		
		//TryCatch tc = new TryCatch();
		
		int[] arrayInt = new int[5];
		int j=0;
		while(j < 11) {
			try {
				for(int i=0; i<6; i++) {
					arrayInt[i] = i+1;
					System.out.println(i + " 입력");
				}
			} catch(ArrayIndexOutOfBoundsException e) {
				arrayInt = new int[6];
				for(int i=0; i<6; i++) {
					arrayInt[i] = i+1;
					System.out.println(i + " 입력");
				}
				System.out.println("배열의 범위를 초과한 데이터 삽입이 이루어졌습니다");
			} catch(Exception e) {
				System.out.println("예외 발생 : " + e.getMessage());
			} finally {
				System.out.println("예외 발생 여부에 관계없이 무조건 실행");
			}
			
			j++;
		}
		
		/*
		try {
			arrayInt = tc.arrays();
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		for(int i : arrayInt) {
			System.out.println(i);
		}
		
		System.out.println("프로그램 종료 완료");
	}
	
	public int[] arrays() throws ArrayIndexOutOfBoundsException {
		int[] arr = new int[5];
		for(int i=0; i<6; i++) {
			arr[i] = i+1;
			System.out.println(i + " 입력");
		}
		return arr;
	}
}
