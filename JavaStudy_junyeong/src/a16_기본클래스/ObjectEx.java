package a16_�⺻Ŭ����;

/**
 * 
 * �⺻Ŭ������ JRE ���̺귯������ �����ϴ� Ŭ������
 * 
 * ��ü��ü�� ����϶�� ��ɿ��� ��ü�� ���� toString() �޼ҵ带 ȣ���Ѵ�.
 *
 */
public class ObjectEx {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�ȳ��ϼ���. toString�Դϴ�.";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	// ���� equals �� ������ �ּҰ��� �������� �˻��ؼ� boolean ���� ��ȯ�ϴ� �޼ҵ��.
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	public static void main(String[] args) {
		ObjectEx objEx = new ObjectEx();
		String str = new String();
		System.out.println(str);
		System.out.println(objEx);
		System.out.println(objEx.hashCode());
		System.out.println(objEx.equals(objEx));
	}
}
