package a13_���;

public class Animal {

	private String ����;
	private String �̸�;
	
	public String get����() {
		return ����;
	}

	public String get�̸�() {
		return �̸�;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}
	
	public void move() {
		System.out.println(�̸� + "(" + ���� + ") ��(��) �����Դϴ�.");
		System.out.println();
	}
	
	public Animal(String ����, String �̸�) {
		this.���� = ����;
		this.�̸� = �̸�;
	}
	public Animal() {
		// TODO Auto-generated constructor stub
	}
}
