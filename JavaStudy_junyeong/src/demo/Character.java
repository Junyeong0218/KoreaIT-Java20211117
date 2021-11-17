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
		this.name = "이름";
		this.level = 1;
		this.exp = 0;
		this.money = 10_000;
		
		// 경험치테이블 & 제작 성공률 보너스 테이블
		for(int i = 1; i < 31; i++)
		{
			neededExp[i-1] = ( (i+2) * i * 100 - temp); // 경험치 = (레벨 + 2) * 레벨 * 100
			bonusPercent[i-1] = ((double)i-1)/100; // 제작 성공률 보너스 = (레벨-1) * 0.01
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
	
	// 정보창 호출
	public void showInfo()
	{
		clearLines();
		System.out.println("#######< 스테이터스 >########");
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level);
		System.out.println("경험치 : " + exp + " / " + neededExp[level-1]);
		System.out.println("금전 : " + money);
		if(bonusPercent[level-1] == 0)
		{
		System.out.printf("성공률 보너스 : %.0f", bonusPercent[level-1]);	System.out.println(" %");
		} else if(bonusPercent[level-1] < 0.1)
		{
			System.out.printf("성공률 보너스 : %.2f", bonusPercent[level-1]);	System.out.println(" %");
		} else
		{
			System.out.printf("성공률 보너스 : %.1f", bonusPercent[level-1]);	System.out.println(" %");
		}
		System.out.println("##########################");
		// 이름 : (7) + 한글(2개당3) or 영어&숫자(개당1)
		// 레벨 : (7) + 1자리 or 2자리
		// 경험치 : (9) + 현재 경험치 + " / "(3) + 필요 경험치
		// 금전 : (7) + 금전만큼
		// 성공률 보너스 : (16) + 4자리 or 5자리
	}
	
	// 레벨업 판단 + 처리
	public void judgeLevelUp(int level, int exp)
	{
		if(exp >= neededExp[level-1])
		{
			this.exp -= neededExp[level-1];
			this.level++;
			System.out.println("레벨업!!");
			System.out.println("스테이터스를 확인해주세요.");
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
	// m - model (데이터 및 연산)
	// v - view (화면)
	// c - controller (m & v 를 결합)
	
}
