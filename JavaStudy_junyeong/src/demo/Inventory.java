package demo;

public class Inventory {
	
	// 재료 6종류 배열
	// 고급 나무장작, 최고급 나무장작, 가는 실, 굵은 실, 질긴 끈, 빛나는 질긴 끈
	
	// 완제품 10종류 배열
	// 숏 보우, 엘븐 숏 보우, 롱 보우, 콤포짓 보우, 가디언 보우, 엘븐 롱 보우, 레더 롱 보우, 석궁, 하이랜더 롱 보우, 아바레스트
	
	Material[] material = null;
	Product[] product = null;
	
	public Inventory(Material[] material, Product[] product)
	{
		this.material = material;
		this.product = product;
		
		this.material[0] = new Material("고급 나무장작");
		this.material[1] = new Material("최고급 나무장작");
		
		this.material[2] = new Material("가는 실");
		this.material[3] = new Material("굵은 실");
		
		this.material[4] = new Material("질긴 끈");
		this.material[5] = new Material("빛나는 질긴 끈");
		
		// 숏 보우 = 고작2 굵실2
		this.product[0] = new Product("숏 보우", material[0].getMaterialName(), material[3].getMaterialName(), null, 2, 2, 0, 0.8, 50);
		
		// 엘븐 숏 보우 = 고작3 굵실3
		this.product[1] = new Product("엘븐 숏 보우", material[0].getMaterialName(), material[3].getMaterialName(), null, 3, 3, 0, 0.75, 70);
		
		// 롱 보우 = 고작5 굵실3
		this.product[2] = new Product("롱 보우", material[0].getMaterialName(), material[3].getMaterialName(), null, 5, 3, 0, 0.70, 100);
		
		// 콤포짓 보우 = 고작8 가실2 굵실2
		this.product[3] = new Product("콤포짓 보우", material[0].getMaterialName(), material[2].getMaterialName(), material[3].getMaterialName(), 8, 2, 2, 0.65, 150);
		
		// 가디언 보우 = 고작4 최고작1 질끈2
		this.product[4] = new Product("가디언 보우", material[0].getMaterialName(), material[1].getMaterialName(), material[4].getMaterialName(), 4, 1, 2, 0.60, 150);
		
		// 엘븐 롱 보우 = 고작3 최고작2 질끈1
		this.product[5] = new Product("엘븐 롱 보우", material[0].getMaterialName(), material[1].getMaterialName(), material[4].getMaterialName(), 3, 2, 1, 0.55, 170);
		
		// 레더 롱 보우 = 고작5 최고작3 굵실3
		this.product[6] = new Product("엘븐 롱 보우", material[0].getMaterialName(), material[1].getMaterialName(), material[3].getMaterialName(), 5, 3, 3, 0.50, 200);
		
		// 석궁 = 최고작6 질끈1
		this.product[7] = new Product("석궁", material[1].getMaterialName(), material[4].getMaterialName(), null, 6, 1, 0, 0.45, 250);
		
		// 하이랜더 롱 보우 = 최고작10 빛질끈5
		this.product[8] = new Product("하이랜더 롱 보우", material[1].getMaterialName(), material[5].getMaterialName(), null, 10, 5, 0, 0.40, 350);
		
		// 아바레스트 = 최고작4 빛질끈1
		this.product[9] = new Product("아바레스트", material[1].getMaterialName(), material[5].getMaterialName(), null, 4, 1, 0, 0.35, 300);
	}

}
