package a12_�迭;

public class ArrayEx {

	/**
	 * 
	 * �迭(Array)
	 * ���� �ڷ��� �Ǵ� ��ü���� ���� �� ����.
	 * �迭�� Ű����
	 * index(�ε���) -> ������ ��ȣǥ�� -> [] ���ȣ
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// �ڷ���[] �迭�� = new �ڷ���[�迭�� ũ��];
		// int[] num = new int[10];
		// ��	��	��	��	��
		// 0	1	2	3	4
		
		int[] num = new int[100];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = 10 * ( i + 1 );
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "] : " + num[i]);
		}
		
		
	}
	
}