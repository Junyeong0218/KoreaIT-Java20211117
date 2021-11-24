package a10_클래스;

public class Car {

	// 레퍼런스 변수(참조변수)
	private String company;
	private String model;
	private String color;
	private int year;
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getYear() {
		return year;
	}
	
	public void carInfo() {
		System.out.println(company + ", " + model + ", " + color + ", " + year);
	}
	
}
