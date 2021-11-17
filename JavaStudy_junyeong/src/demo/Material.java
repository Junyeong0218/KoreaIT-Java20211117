package demo;

public class Material {
	
	String materialName;
	int currentHave;
	
	public Material(String materialName)
	{
		this.materialName = materialName;
		this.currentHave = 100;
	}

	public String getMaterialName() {
		return materialName;
	}
	
	public int getCurrentHave() {
		return currentHave;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
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
