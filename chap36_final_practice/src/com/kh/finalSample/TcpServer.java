package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpServer {
	public static void main(String[] args) throws Exception {
		
		int port = 3333;
		
		//ServerSocket server;
		
		ServerSocket server = new ServerSocket(port);
		System.out.println("������ ��Ʈ " + port + "���� ���� ���Դϴ�.");
		
		while(true) {
			Socket client = server.accept();
			System.out.println("Ŭ���̾�Ʈ ���� : " + client.getInetAddress());
			
		/*	InputStream instream = client.getInputStream();
			Scanner sc = new Scanner(instream);
			System.out.println("server | client : " + sc.nextLine());
			
			
			BufferedReader in = new BufferedReader(server, port);
			OutputStream outstream = client.getOutputStream();
			PrintStream printstream = new PrintStream(outstream);
			printstream.print("hi client");
			System.out.println("server | client");
			printstream.flush();		
		*/
			client.close();
		}
	}
}