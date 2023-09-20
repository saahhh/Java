package com.kh.SocketMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// 서버의 연결하기 위한 소켓을 생성
		Socket socket = new Socket("localHost", 8080);
		
		//서버로 데이터를 보내기위한 출력 스트림 생성
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		
		//서버로부터 데이터를 받기위한 출력 스트림 생성
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		//키보드로부터 입력받기 위한 생성
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
	
		String userInputString;
		System.out.println("서버와 대화를 시작합니다. 종료하려면 'exit'를 입력하세요.");
		while((userInputString = userInput.readLine()) != null) {
			//사용자 입력을 서버로 전송하겠습니다.
			out.println(userInputString);
			
			//서버로부터 받은 응답 출력
			String serverResponse = in.readLine();
			System.out.println("서버 너의 응답은 : " + serverResponse);
			
			//사용자가 'exit'를 입력하면 대화 종료
			if("exit".equalsIgnoreCase(userInputString)) {
				break;
			}
		}
		//소켓 및 입력 스트림 닫기
		socket.close();
		userInput.close();
	}
	

}
