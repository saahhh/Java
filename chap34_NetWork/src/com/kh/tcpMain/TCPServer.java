package com.kh.tcpMain;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
public static void main(String[] args) {
	try {
		ServerSocket serverSocket = new ServerSocket(8080); //8080서버생성
		System.out.println("Server Waiting");
		//System.out.println("서버 대기 중!");
		
		//만약에 클라이언트와 연결하고 싶다면 클라이언트와 연결하는 코드를 작성
		while(true) {
			//클라이언트와 연결 대기하는 코드
			Socket client = serverSocket.accept();
			System.out.println("connect Client");
			//System.out.println("클라이언트와 연결되었습니다. ");
			
			//읽어올 때 코드
			InputStream instream = client.getInputStream();
			Scanner sc = new Scanner(instream);
			System.out.println("Server | Client : " + sc.nextLine());
			
			OutputStream outStream = client.getOutputStream();
			PrintStream printstream = new PrintStream(outStream);
			printstream.print("Hi, Client");
			System.out.println("server | Client");
			printstream.flush(); //버퍼의 데이터를 한번에 쏟아냄
			
			client.close(); //클라이언트와 연결만 해제
			System.out.println("Server " + client.getInetAddress().getHostAddress());
			
			//만약 서버는 무한대로 실행이 되어야하나
			//실행 제한을 주고 싶을 때
			int count = 0;
			if(count > 7) {
				serverSocket.close(); //서버를 끝내는 클로즈
				System.out.println("Server Close");
			}
			count += 1;
			
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
