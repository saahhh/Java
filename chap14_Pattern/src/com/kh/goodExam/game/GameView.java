package com.kh.goodExam.game;
//�����ǰ��
public class GameView {
	private String StratMsg = "���� ���߱� ������ �����մϴ�.";
	private String RandomNum = "1���� 100������ ���ڸ� ���纸����!";
	private String GuessNum = "������ ���ڸ� �Է��ϼ���.";
	private String CorrectNum = "���ڸ� ������ϴ�.";;
	private String InCorrctNum = "Ʋ�Ƚ��ϴ�. �ٽ� �õ��ϼ���.";

	private String GameOver = "��������";
	//�����׸�Ʈ
	public void displayMessage() {
		System.out.println("���� ���߱� ������ �����մϴ�.");
		System.out.println(StratMsg);
		System.out.println("1���� 100������ ���ڸ� ���纸����!");
		System.out.println(RandomNum);
		
	}
	//���ڸ� �����ϴ� �� �Է��ϰ� ������� Ʋ�ȴ��� ���°Ŷ� �õ�Ƚ�� ��������
	//1. ���� �����ϴ� �� �Է��ϱ�
	public void displayGeussPromt() { //promt�� ���� �Է��ϴ� â=��������
		
		System.out.println("������ ���ڸ� �Է��ϼ���.");
		System.out.println(GuessNum);
	}
	
	public void displayCorrectGuess() {
		System.out.println("���ڸ� ������ϴ�.");
		System.out.println(CorrectNum);
	}
	
	public void displayInCorrectGuess() {
		System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �õ��ϼ���.");
		System.out.println(InCorrctNum);
	}
	
	public void displayAttempts(int attempts) {
		String AttemptsNum = "�õ�Ƚ�� : " + attempts; //�ۿ��� ���� ���������� �Ǵ� ��������� ������� {}�ȿ� ����Ѵ�
		System.out.println("�õ�Ƚ�� : " + attempts);
		System.out.println(AttemptsNum);
	}
	
	public void displayGameOver() {
		System.out.println("��������!");
		System.out.println(GameOver);
	}
}
