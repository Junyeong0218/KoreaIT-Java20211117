package demo;

public class Character {

	private String name;
	private int level;
	private int exp;
	private int money;
	private int temp = 0;
	private int[] neededExp = new int[30];
	private double[] bonusPercent = new double[30];
	
	public Character()
	{
		this.name = "�̸�";
		this.level = 1;
		this.exp = 0;
		this.money = 10_000;
		
		// ����ġ���̺� & ���� ������ ���ʽ� ���̺�
		for(int i = 1; i < 31; i++)
		{
			neededExp[i-1] = ( (i+2) * i * 100 - temp); // ����ġ = (���� + 2) * ���� * 100
			bonusPercent[i-1] = ((double)i-1)/100; // ���� ������ ���ʽ� = (����-1) * 0.01
			temp = (i+2) * i * 100;
		}
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public int getExp() {
		return exp;
	}

	public int getMoney() {
		return money;
	}

	public int[] getNeededExp() {
		return neededExp;
	}

	public double[] getBonusPercent() {
		return bonusPercent;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public void setLevel() {
		this.level++;
	}

	public void setExp(int exp) {
		this.exp += exp;
	}

	public void setMoney(int money) {
		this.money += money;
	}
	
	// ����â ȣ��
	public void showInfo()
	{
		clearLines();
		System.out.println("#######< �������ͽ� >########");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + level);
		System.out.println("����ġ : " + exp + " / " + neededExp[level-1]);
		System.out.println("���� : " + money);
		if(bonusPercent[level-1] == 0)
		{
		System.out.printf("������ ���ʽ� : %.0f", bonusPercent[level-1]);	System.out.println(" %");
		} else if(bonusPercent[level-1] < 0.1)
		{
			System.out.printf("������ ���ʽ� : %.2f", bonusPercent[level-1]);	System.out.println(" %");
		} else
		{
			System.out.printf("������ ���ʽ� : %.1f", bonusPercent[level-1]);	System.out.println(" %");
		}
		System.out.println("##########################");
		// �̸� : (7) + �ѱ�(2����3) or ����&����(����1)
		// ���� : (7) + 1�ڸ� or 2�ڸ�
		// ����ġ : (9) + ���� ����ġ + " / "(3) + �ʿ� ����ġ
		// ���� : (7) + ������ŭ
		// ������ ���ʽ� : (16) + 4�ڸ� or 5�ڸ�
	}
	
	// ������ �Ǵ� + ó��
	public void judgeLevelUp(int level, int exp)
	{
		if(exp >= neededExp[level-1])
		{
			this.exp -= neededExp[level-1];
			this.level++;
			System.out.println("������!!");
			System.out.println("�������ͽ��� Ȯ�����ּ���.");
			System.out.println();
			this.showInfo();
		}
	}
	
	public void clearLines()
	{
		for(int i = 0; i < 55; i++)
		{
			System.out.println();
		}
	}
	
	// mvc
	// m - model (������ �� ����)
	// v - view (ȭ��)
	// c - controller (m & v �� ����)
	
}
