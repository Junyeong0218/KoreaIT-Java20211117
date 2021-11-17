package demo;

public class Product {
	
	private String productName;
	private String neededMaterialName_1;
	private String neededMaterialName_2;
	private String neededMaterialName_3;
	
	private int currentHave;
	private int neededMaterialQuantity_1;
	private int neededMaterialQuantity_2;
	private int neededMaterialQuantity_3;
	private int exp;
	
	private double basicSuccessRate;
	private final double DOUBLE_MAKING_RATE;
	
	public Product(String productName, String neededMaterialName_1, String neededMaterialName_2,
			String neededMaterialName_3, int neededMaterialQuantity_1, int neededMaterialQuantity_2,
			int neededMaterialQuantity_3, double basicSuccessRate, int exp)
	{	
		this.productName = productName;
		this.neededMaterialName_1 = neededMaterialName_1;
		this.neededMaterialName_2 = neededMaterialName_2;
		this.neededMaterialName_3 = neededMaterialName_3;
		this.neededMaterialQuantity_1 = neededMaterialQuantity_1;
		this.neededMaterialQuantity_2 = neededMaterialQuantity_2;
		this.neededMaterialQuantity_3 = neededMaterialQuantity_3;
		this.basicSuccessRate = basicSuccessRate;
		this.DOUBLE_MAKING_RATE = 0.07;
		this.exp = exp;
	}

	public String getProductName() {
		return productName;
	}

	public String getNeededMaterialName_1() {
		return neededMaterialName_1;
	}

	public String getNeededMaterialName_2() {
		return neededMaterialName_2;
	}

	public String getNeededMaterialName_3() {
		return neededMaterialName_3;
	}

	public int getCurrentHave() {
		return currentHave;
	}

	public int getNeededMaterialQuantity_1() {
		return neededMaterialQuantity_1;
	}

	public int getNeededMaterialQuantity_2() {
		return neededMaterialQuantity_2;
	}

	public int getNeededMaterialQuantity_3() {
		return neededMaterialQuantity_3;
	}
	
	public double getbasicSuccessRate() {
		return basicSuccessRate;
	}
	
	public double getDOUBLEMAKINGRATE() {
		return DOUBLE_MAKING_RATE;
	}
	
	public int getExp() {
		return exp;
	}

	public void setCurrentHave(int currentHave) {
		this.currentHave = currentHave;
	}
	
	public void makeProduct(int quantity)
	{
		this.currentHave += quantity;
	}
	
	public void sellProduct(int quantity)
	{
		this.currentHave -= quantity;
	}
	

}
