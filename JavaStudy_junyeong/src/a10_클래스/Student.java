package a10_클래스;

public class Student {

	int studentYear;
	int studentGroup;
	int studentNumber;
	String name;
	
	public Student() {
		System.out.println("새로운 학생 생성");
	}
	
	public Student(int studentYear, int studentGroup, int studentNumber, String name) {
		
		this.studentYear = studentYear;
		this.studentGroup = studentGroup;
		this.studentNumber = studentNumber;
		this.name = name;
		
		showInfo();
	}



	void showInfo() {
		System.out.println("학년 : " + studentYear);
		System.out.println("반 : " + studentGroup);
		System.out.println("번호 : " + studentNumber);
		System.out.println("이름 : " + name);
		System.out.println();
	}
	
}
