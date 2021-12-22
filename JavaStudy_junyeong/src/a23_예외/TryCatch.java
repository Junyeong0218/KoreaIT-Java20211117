package a23_����;

public class TryCatch {

	public static void main(String[] args) {
		
		//TryCatch tc = new TryCatch();
		
		int[] arrayInt = new int[5];
		int j=0;
		while(j < 11) {
			try {
				for(int i=0; i<6; i++) {
					arrayInt[i] = i+1;
					System.out.println(i + " �Է�");
				}
			} catch(ArrayIndexOutOfBoundsException e) {
				arrayInt = new int[6];
				for(int i=0; i<6; i++) {
					arrayInt[i] = i+1;
					System.out.println(i + " �Է�");
				}
				System.out.println("�迭�� ������ �ʰ��� ������ ������ �̷�������ϴ�");
			} catch(Exception e) {
				System.out.println("���� �߻� : " + e.getMessage());
			} finally {
				System.out.println("���� �߻� ���ο� ������� ������ ����");
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
		
		System.out.println("���α׷� ���� �Ϸ�");
	}
	
	public int[] arrays() throws ArrayIndexOutOfBoundsException {
		int[] arr = new int[5];
		for(int i=0; i<6; i++) {
			arr[i] = i+1;
			System.out.println(i + " �Է�");
		}
		return arr;
	}
}
