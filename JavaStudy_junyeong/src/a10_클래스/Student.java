package a10_Ŭ����;

public class Student {

	int studentYear;
	int studentGroup;
	int studentNumber;
	String name;
	
	public Student() {
		System.out.println("���ο� �л� ����");
	}
	
	public Student(int studentYear, int studentGroup, int studentNumber, String name) {
		
		this.studentYear = studentYear;
		this.studentGroup = studentGroup;
		this.studentNumber = studentNumber;
		this.name = name;
		
		showInfo();
	}



	void showInfo() {
		System.out.println("�г� : " + studentYear);
		System.out.println("�� : " + studentGroup);
		System.out.println("��ȣ : " + studentNumber);
		System.out.println("�̸� : " + name);
		System.out.println();
	}
	
}
