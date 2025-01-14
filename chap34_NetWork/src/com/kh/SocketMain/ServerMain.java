package com.kh.SocketMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) throws IOException {
		// 소켓 서버 생성
		ServerSocket serverSocket = new ServerSocket(8080);
		System.out.println("서버가 시작되었습니다.");
		
		//클라이언트 연결 대기
		Socket clientSocket = serverSocket.accept();
		System.out.println("클라이언트가 연결되었습니다.");
		
		//클라이언트로부터 데이터를 받기 위해 입력 스트림 생성
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		//클라이언트로부터 데이터를 보내기 위한 출력 스트림 생성
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
		
		String clientMsg; //msg는 message
		while((clientMsg = in.readLine()) != null) {
			System.out.println("클라이언트의 대화 : " + clientMsg);
			
			//클라이언트에게 응답 전송
			out.print("서버의 응답 전송 : " + clientMsg);
		}
		//클라이언트와의 연결종료
		clientSocket.close();
		clientSocket.close();
	}

}
