package ch.com.gettersetter.goodExam;

public class GameRun {

	public static void main(String[] args) {
		// 플레이 생성자 만들기
		GoodPlayer player1 = new GoodPlayer();
//		player1.displayInfo();
		
		player1.setName("KH");
		
		player1.setHealth(-10); //-10체력을 저장해주고
		player1.ValidHealth(); // -10이 무결성(내가 만든 코드가 결점이 없는지)인지 검증한다.
		
		player1.setAttackPower(-20);
		player1.ValidAttackPower(); //코드를 검증하는 것
		
		
		player1.displayInfo();
		
		
		/*GameRun에서 player2 Valid적용하기*/
		GoodPlayer player2 = new GoodPlayer();
		player2.setName("");
		player2.ValidName();
		
		player2.setHealth(-50);
		player2.ValidHealth();
		
		player2.setAttackPower(-20);
		player2.ValidAttackPower();
		
		player2.displayInfo();
		
		System.out.println("attack!!!!! 후");
		
//		player1.attack(player2);
//		player2.attack(player1);
		
		
	} 
	

}