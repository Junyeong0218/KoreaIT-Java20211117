package demo;

public class Material {
	
	String materialName;
	int currentHave;
	int price;
	
	public Material(String materialName, int price)
	{
		this.materialName = materialName;
		this.currentHave = 0;
		this.price = price;
	}

	public String getMaterialName() {
		return materialName;
	}
	
	public int getCurrentHave() {
		return currentHave;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void buyMaterial(int quantity)
	{
		this.currentHave += quantity;
	}
	
	public void useMaterial(int quantity)
	{
		this.currentHave -= quantity;
	}

}
