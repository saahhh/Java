package com.kh.ThreadPractice;

import java.io.IOException;
import java.util.Random;

public class GameMain {
	public static void main(String[] args) {
		
		//�ܺ� Ŭ������ �ν��Ͻ��� ����
		GameLoop Gl = new GameLoop();		
		
		// ���� ���� ������ ����
		Thread gameThread = new Thread(Gl);
		gameThread.start();
		
		// ���� ���� ���� : �÷��̾ Enter Ű�� ������ ���� ����
		try {
			//����ڰ� Ű����� �Է��� ����Ʈ�� ����
			//����ڰ� EnterŰ�� ���� �� ���� ���α׷� �Ͻ� ����
			System.in.read(); 
			Gl.setGameOver(!false);
//			isGameOver = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}