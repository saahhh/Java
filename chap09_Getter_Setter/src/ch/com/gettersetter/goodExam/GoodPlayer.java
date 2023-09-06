package ch.com.gettersetter.goodExam;

public class GoodPlayer {
	private String name; 		//1.캐릭터이름
	private  int health; 		//체력
	private  int attackPower;	//공격파워
	
	public void setName(String name) { // 2.이름이 변경되면 저장될 set을 만들었고
		this.name = name;
	}
	
	//검증하는 valid
	public void ValidName() { // 3.캐릭터 이름에 공백이 없는지 검증!
		if(this.name == "") {
			this.name = "No name";
		}
	}
	public String getName() { // 4.캐릭터 이름을 반환 //get에다가 set의 내용을 저장하는 것
		return name;
	}

	
	
	
	public void ValidHealth() {
		if(this.health == 0) {
			System.out.println("체력을 넣지 않았습니다.");
		}
	}
	
	public void setHealth(int health) { //매개변수에 저장된 체력 저장하는 곳
		this.health = health;
	}
	public int getHealth() {
		return health;
	}


	
		
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	public void ValidAttackPower() { //무결성되게 검증
		//만약에 파워가 0보다 작을 경우
		if(attackPower <= 0) {
			this.attackPower =0;			
		}
	}
	public int attackpower() {
		return attackPower;
	}
		
		
	public int getAttackPower() {
		return attackPower; // 
							//void와 return은 같이 쓰일 수 없음
	}
	
	//출력 메소드 작성
	public void displayInfo() { //void는 출력만하고 끝 (=어떤 것을 실행하지 않을 때)
		System.out.println("캐릭터 정보 : " + this.name);
		System.out.println("체력 정보 : " + this.health);
		System.out.println("공격 파워 : " + this.attackPower);
		
	}
}
	