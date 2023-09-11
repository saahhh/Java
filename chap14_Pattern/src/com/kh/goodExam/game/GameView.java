package com.kh.goodExam.game;
//게임의결과
public class GameView {
	private String StratMsg = "숫자 맞추기 게임을 시작합니다.";
	private String RandomNum = "1에서 100사이의 숫자를 맞춰보세요!";
	private String GuessNum = "추측한 숫자를 입력하세요.";
	private String CorrectNum = "숫자를 맞췄습니다.";;
	private String InCorrctNum = "틀렸습니다. 다시 시도하세요.";

	private String GameOver = "게임종료";
	//오프닝멘트
	public void displayMessage() {
		System.out.println("숫자 맞추기 게임을 시작합니다.");
		System.out.println(StratMsg);
		System.out.println("1에서 100사이의 숫자를 맞춰보세요!");
		System.out.println(RandomNum);
		
	}
	//숫자를 추측하는 값 입력하고 맞췄는지 틀렸는지 적는거랑 시도횟수 게임종료
	//1. 숫자 추측하는 값 입력하기
	public void displayGeussPromt() { //promt는 값을 입력하는 창=프롬프터
		
		System.out.println("추측한 숫자를 입력하세요.");
		System.out.println(GuessNum);
	}
	
	public void displayCorrectGuess() {
		System.out.println("숫자를 맞췄습니다.");
		System.out.println(CorrectNum);
	}
	
	public void displayInCorrectGuess() {
		System.out.println("틀렸습니다. 다시 시도하세요.");
		System.out.println(InCorrctNum);
	}
	
	public void displayAttempts(int attempts) {
		String AttemptsNum = "시도횟수 : " + attempts; //밖에다 쓰면 지역변수가 되니 멤버변수를 만드려면 {}안에 써야한다
		System.out.println("시도횟수 : " + attempts);
		System.out.println(AttemptsNum);
	}
	
	public void displayGameOver() {
		System.out.println("게임종료!");
		System.out.println(GameOver);
	}
}
