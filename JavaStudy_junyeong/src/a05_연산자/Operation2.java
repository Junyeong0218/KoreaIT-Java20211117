package a05_������;

public class Operation2 {

	public static void main(String[] args) {
		
		/**
		 * <�� ������> = �� or ���� (boolean)
		 * AND ���� (&&) = �� 
		 * OR ���� (||) = ��
		 * NOT ���� (!) = ����
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
		 * ����(����) ������
		 * boolean trueAndFalse = ���� ? ���(��) : ���(����) ;
		 * 
		 */
		
		boolean trueAndFalse = (10 < 20) ? true : false ;
		
		String grade = (59 < 60) ? "F���" : "F�� �ƴմϴ�" ;
		
		System.out.println(trueAndFalse);
		System.out.println(grade);
		
		System.out.println("\"�ȳ�\"");
		// "�� ��½�Ű�� ������ �ֵ���ǥ �տ� ��������
		
 	}

}
