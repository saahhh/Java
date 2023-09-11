package com.kh.goodExam.game;

import java.util.Scanner;

public class GameController {
	//		String과 비슷한 GameModel과같은예약어를 만든것
//	private int a; //인스턴스변수 
//	private String b; //참조변수
	private GameModel model;
	private GameView view;


	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	public void runGame() {
		//최초 메세지 보여주는 거 출력하고
		view.displayMessage(); //view에 있는 sysout 메세지 출력
		//스캐너 입력해서 입력값 호출
		
		
		while(true) { //false가 될 때까지 반복
			
			//숫자 추측하는 값을 입력하자
			view.displayGeussPromt();
			
			Scanner sc = new Scanner(System.in);
			int guess = sc.nextInt();
			
		//만약에 컴퓨터가 생각한 숫자를 맞췄을 때 불러올 view
			if(model.inCorrectGuess(guess)) { //guess가 입력한 값이 정답일때
				view.displayCorrectGuess();
				 view.displayAttempts(model.getAempts());
				 //isTrue = false;
				break;
			} else { 
				view.displayInCorrectGuess();
				view.displayAttempts(model.getAempts());
		}		
		view.displayGameOver();
		}	
		
//		//컴퓨터가 생각한 숫자와 내가 입력한 숫자가 틀렸을 때 view
//		view.displayInCorrectGuess();
//		view.displayAttempts(model.getAempts()); //guess를 적으면 입력받은 숫자가 뜨기때문에 안됨
	}
	
	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m,v);
		
		c.runGame();
	}
}	

//지역변수 는 {}안에서 쓰이는 , 이 지역에서 쓰인다, ex)for문
//static이 붙었기 때문에 main에서쓰인다
//객체가 인스턴스
//인스턴스는 객체의 하위항목 중 하나
