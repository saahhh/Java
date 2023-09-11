package com.kh.goodExam.game;

import java.util.Scanner;

public class GameController {
	//		String�� ����� GameModel���������� �����
//	private int a; //�ν��Ͻ����� 
//	private String b; //��������
	private GameModel model;
	private GameView view;


	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	public void runGame() {
		//���� �޼��� �����ִ� �� ����ϰ�
		view.displayMessage(); //view�� �ִ� sysout �޼��� ���
		//��ĳ�� �Է��ؼ� �Է°� ȣ��
		
		
		while(true) { //false�� �� ������ �ݺ�
			
			//���� �����ϴ� ���� �Է�����
			view.displayGeussPromt();
			
			Scanner sc = new Scanner(System.in);
			int guess = sc.nextInt();
			
		//���࿡ ��ǻ�Ͱ� ������ ���ڸ� ������ �� �ҷ��� view
			if(model.inCorrectGuess(guess)) { //guess�� �Է��� ���� �����϶�
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
		
//		//��ǻ�Ͱ� ������ ���ڿ� ���� �Է��� ���ڰ� Ʋ���� �� view
//		view.displayInCorrectGuess();
//		view.displayAttempts(model.getAempts()); //guess�� ������ �Է¹��� ���ڰ� �߱⶧���� �ȵ�
	}
	
	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m,v);
		
		c.runGame();
	}
}	

//�������� �� {}�ȿ��� ���̴� , �� �������� ���δ�, ex)for��
//static�� �پ��� ������ main�������δ�
//��ü�� �ν��Ͻ�
//�ν��Ͻ��� ��ü�� �����׸� �� �ϳ�
