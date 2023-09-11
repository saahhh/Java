package com.kh.goodExam.game;
//랜덤 숫자맞추기 게임 모델
public class GameModel {
	private int secretNumber; //숨겨진 번호
	private int attempts; //몇 번 시도했는가
	
	public GameModel() {
		//1~100사이의 무작위 숫자 생성하기
		secretNumber = (int)(Math.random() *100)+1; //시작이 0이기 때문에 1더해줌
		attempts = 0;
	}
	//1~100사이 중 컴퓨터가 랜덤으로 추측한 숫자 1개
	public int getSecretNumber() {
		return secretNumber;
	}
	
	public int getAempts() {
		return attempts;
	}
	
	public void incrementApttempts() {
		attempts++;
	}
	
	public boolean inCorrectGuess(int guess) {
		incrementApttempts();  //guess가 값을 입력했기 때문에 증가 메소드를 추가
		return guess == secretNumber;
	}
}
