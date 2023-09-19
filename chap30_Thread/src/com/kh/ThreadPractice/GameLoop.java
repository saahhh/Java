package com.kh.ThreadPractice;

import java.util.Random;

public class GameLoop implements Runnable {
	
	private static boolean isGameOver = false;	

		@Override
		public void run() {
			while(!isGameOver) {
				//게임 루프 내용
				int randomValue = new Random().nextInt(10); //임의의 숫자 생성
				System.out.println("임의의 숫자 : " + randomValue);
				
				//게임 루프 지연 시간
				try {
					Thread.sleep(1000); //1초 대기
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//게임 종료 조건 : Enter키를 누르면 게임이 종료됩니다.
				System.out.println("게임을 종료하려면 Enter를 누르세요.");
			}
		}
	
		public void setGameOver(boolean isGameOver) {
			GameLoop.isGameOver = isGameOver;
		}
	}