package ch.com.gettersetter.goodExam;

public class GoodPlayer {
	private String name; 		//1.ĳ�����̸�
	private  int health; 		//ü��
	private  int attackPower;	//�����Ŀ�
	
	public void setName(String name) { // 2.�̸��� ����Ǹ� ����� set�� �������
		this.name = name;
	}
	
	//�����ϴ� valid
	public void ValidName() { // 3.ĳ���� �̸��� ������ ������ ����!
		if(this.name == "") {
			this.name = "No name";
		}
	}
	public String getName() { // 4.ĳ���� �̸��� ��ȯ //get���ٰ� set�� ������ �����ϴ� ��
		return name;
	}

	
	
	
	public void ValidHealth() {
		if(this.health == 0) {
			System.out.println("ü���� ���� �ʾҽ��ϴ�.");
		}
	}
	
	public void setHealth(int health) { //�Ű������� ����� ü�� �����ϴ� ��
		this.health = health;
	}
	public int getHealth() {
		return health;
	}


	
		
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	public void ValidAttackPower() { //���Ἲ�ǰ� ����
		//���࿡ �Ŀ��� 0���� ���� ���
		if(attackPower <= 0) {
			this.attackPower =0;			
		}
	}
	public int attackpower() {
		return attackPower;
	}
		
		
	public int getAttackPower() {
		return attackPower; // 
							//void�� return�� ���� ���� �� ����
	}
	
	//��� �޼ҵ� �ۼ�
	public void displayInfo() { //void�� ��¸��ϰ� �� (=� ���� �������� ���� ��)
		System.out.println("ĳ���� ���� : " + this.name);
		System.out.println("ü�� ���� : " + this.health);
		System.out.println("���� �Ŀ� : " + this.attackPower);
		
	}
}
	