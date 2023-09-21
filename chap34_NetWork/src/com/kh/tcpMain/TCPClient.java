package com.kh.tcpMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		//서버 주소와 포트 번호로 소켓 생성
		//서버 주소와 포트번호는 내가 연결하고자 하는 포트와 동일해야함 (TCPServer의 주소와 동일해야함)
		Socket socket = new Socket("localhost", 8080);
		System.out.println("[ Server Connect ]");
		
		//보낼 때 코드
		OutputStream outStream = socket.getOutputStream();
		PrintStream printStream = new PrintStream(outStream);
		printStream.print("HHHHIIIII SSSEEERRVVEERR");
		printStream.flush();
		
		//서버로부터 읽어옴
		InputStream InStream = socket.getInputStream();
		Scanner sc = new Scanner(InStream);
		System.out.println("[Client} server" + sc.nextLine());
		
		socket.close();
		System.out.println("Byte Server See you later!!");
	
		}
		
	}
/*		try {
			//서버 주소와 포트 번호로 소켓 생성
			//서버 주소와 포트번호는 내가 연결하고자 하는 포트와 동일해야함 (TCPServer의 주소와 동일해야함)
			Socket socket = new Socket("localhost", 8080);
			System.out.println("[ Server Connect ]");
			
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			
			//서버 되는지 테스트 메세지
			out.println("안녕 서버?");
			
			//서버로부터 메세지 전달되는지 확인 테스트
			String response = in.readLine();
			System.out.println("서버 응답 : " + response);
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
*/

