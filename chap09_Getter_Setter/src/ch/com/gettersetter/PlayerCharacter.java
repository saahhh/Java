package ch.com.gettersetter;

public class PlayerCharacter {
	private String name; 		//캐릭터이름
	private  int health; 		//체력
	private  int attackPower;	//공격파워
	
	/*
	 getter
	   데이터의 복사본을 던져주기 때문에 원래 객체의 데이터는 손상시키지 않기때문에
	   원본데이터는 안전함	 
	   getter는 검증된 setter의 정보를 받아서 출력하는것
	*/

	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getAttackPower() {
		return attackPower;
	}
	
	/*
	 setter
	 	외부에서 메소드를 통해 데이터에 접근을 하게 된다면 
	 	메소드는 매개값(=매개변수)을 검증해서 유효값만 데이터로 저장할 수 있음
	*/
	
	public void setName(String name) {
		this.name = name;
	}

	public void setHealth(int health) {
		//만약에 체력이 0이라면 죽이고 체력이 1이상이면 살리자
		if(health >= 1) { //체력이 1 이상일 경우
			this.health = health;
		}else { //체력이 0이하라면 체력을 표시할 가치도 없다.
			System.out.println("체력이 없습니다...");
		}
		//this.health = health;
	}
	//0미만의 값을 넣어도 0이하의 값이 출력되지 않음
	public void setAttackPower(int attackPower) {
		//만약에 파워가 0보다 클 경우
		if(attackPower >= 1) {
			this.attackPower = attackPower;	
		} else {
			this.attackPower = 0;
			System.out.println("power가 부적절합니다.");
		}
		
	}
//	//valid -> 검증할 때 쓰는 이름
//	public void isValidHealth() {
//		
//	}
	
	//캐릭터 정보 출력
	public void displayInfo() {
		System.out.println("캐릭터 정보 : " + name);
		System.out.println("체력 정보 : " + health);
		System.out.println("공격 파워 : " + attackPower);
		
	}
	
	//캐릭터 공격하는 출력 메서드
	public void attack(PlayerCharacter target) {
		System.out.println("[" + name + "]" + "는 공격했습니다. " + "[" + target.getName() +"]" + "한테 "+ "for" + attackPower + "데미지를 줬습니다.");
		System.out.println("공격했습니다.");
	}
	
	//다른 캐릭터로부터 공격 받았을 때 메서드
	public void takeDamage(int damage) {
		System.out.println("공격 받았습니다");
	}

	
}
