package demo;

public class Inventory {
	
	// ��� 6���� �迭
	// ��� ��������, �ְ�� ��������, ���� ��, ���� ��, ���� ��, ������ ���� ��
	
	// ����ǰ 10���� �迭
	// �� ����, ���� �� ����, �� ����, ������ ����, ����� ����, ���� �� ����, ���� �� ����, ����, ���̷��� �� ����, �ƹٷ���Ʈ
	
	Material[] material = null;
	Product[] product = null;
	
	public Inventory(Material[] material, Product[] product)
	{
		this.material = material;
		this.product = product;
		
		this.material[0] = new Material("��� ��������", 700);
		this.material[1] = new Material("�ְ�� ��������", 3000);
		
		this.material[2] = new Material("���� ��", 300);
		this.material[3] = new Material("���� ��", 200);
		
		this.material[4] = new Material("���� ��", 800);
		this.material[5] = new Material("������ ���� ��", 1500);
		
		// �� ���� = ����2 ����2
		this.product[0] = new Product("�� ����", material[0].getMaterialName(), material[3].getMaterialName(), null, 2, 2, 0, 0.8, 50, 2088);
		
		// ���� �� ���� = ����3 ����3
		this.product[1] = new Product("���� �� ����", material[0].getMaterialName(), material[3].getMaterialName(), null, 3, 3, 0, 0.75, 70, 3240);
		
		// �� ���� = ����5 ����3
		this.product[2] = new Product("�� ����", material[0].getMaterialName(), material[3].getMaterialName(), null, 5, 3, 0, 0.70, 100, 5084);
		
		// ������ ���� = ����7 ����2 ����2
		this.product[3] = new Product("������ ����", material[0].getMaterialName(), material[2].getMaterialName(), material[3].getMaterialName(), 7, 2, 2, 0.65, 150, 7552);
		
		// ����� ���� = ����4 �ְ���1 ����3
		this.product[4] = new Product("����� ����", material[0].getMaterialName(), material[1].getMaterialName(), material[4].getMaterialName(), 4, 1, 3, 0.60, 150, 10824);
		
		// ���� �� ���� = ����4 �ְ���2 ����2
		this.product[5] = new Product("���� �� ����", material[0].getMaterialName(), material[1].getMaterialName(), material[4].getMaterialName(), 4, 2, 2, 0.55, 170, 14144);
		
		// ���� �� ���� = ����5 �ְ���3 ����3
		this.product[6] = new Product("���� �� ����", material[0].getMaterialName(), material[1].getMaterialName(), material[3].getMaterialName(), 5, 3, 3, 0.50, 200, 18995);
		
		// ���� = ����1 �ְ���5 ����2
		this.product[7] = new Product("����", material[0].getMaterialName(), material[1].getMaterialName(), material[4].getMaterialName(), 1, 5, 2, 0.45, 250, 25864);
		
		// ���̷��� �� ���� = �ְ���7 ������1
		this.product[8] = new Product("���̷��� �� ����", material[1].getMaterialName(), material[5].getMaterialName(), null, 7, 1, 0, 0.40, 350, 36000);
		
		// �ƹٷ���Ʈ = �ְ���7 ������5
		this.product[9] = new Product("�ƹٷ���Ʈ", material[1].getMaterialName(), material[5].getMaterialName(), null, 7, 5, 0, 0.35, 300, 47025);
	}

}
