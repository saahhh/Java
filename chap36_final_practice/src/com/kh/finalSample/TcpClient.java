package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
//예외를 보고 싶을 땐 트라이캐치
//클래스안에서 해결할 땐 throws (대신강제종료의위험성이있음)


public class TcpClient { //메소드 추가
	public static void main(String[] args) throws Exception {
		int port = 3333;
		String serverIP; //내 아이피 주소
		serverIP = InetAddress.getLocalHost().getHostAddress();
		System.out.println(serverIP);
		try {
//			serverIP = InetAddress.getLocalHost().getHostAddress();
//			System.out.println("serverIP");
			Socket socket = new Socket(serverIP, port);
			System.out.println("server connect");
			
			//클라이언트와 통신을 위한 입 출력 스트림 설정 
			//BufferedReader 는 문자 입력 '스트림'에서 텍스트를 읽고, 문자를 버퍼링하여 문자, 배열 및 줄을 효율적으로 읽을 수 있도록 한다.
			//스트림을 쓰기 때문에 inputstream,outputstream의 단어를 사용한다
			//BufferedReader(Reader in) : 기본 크기를 사용하는 버퍼링 문자 입력 스트림을 만듭니다. 입력 버퍼.
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			OutputStream out = socket.getOutputStream();
			
			//클라이언트에서 서버로 메세지 전송
			String msg = "hi server";
			out.write(msg.getBytes());
			out.flush();
			
			String response = in.readLine();
			System.out.println("서버 응답 : " + response);
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
}
