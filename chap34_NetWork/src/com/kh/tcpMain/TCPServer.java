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
		ServerSocket serverSocket = new ServerSocket(8080); //8080��������
		System.out.println("Server Waiting");
		//System.out.println("���� ��� ��!");
		
		//���࿡ Ŭ���̾�Ʈ�� �����ϰ� �ʹٸ� Ŭ���̾�Ʈ�� �����ϴ� �ڵ带 �ۼ�
		while(true) {
			//Ŭ���̾�Ʈ�� ���� ����ϴ� �ڵ�
			Socket client = serverSocket.accept();
			System.out.println("connect Client");
			//System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�. ");
			
			//�о�� �� �ڵ�
			InputStream instream = client.getInputStream();
			Scanner sc = new Scanner(instream);
			System.out.println("Server | Client : " + sc.nextLine());
			
			OutputStream outStream = client.getOutputStream();
			PrintStream printstream = new PrintStream(outStream);
			printstream.print("Hi, Client");
			System.out.println("server | Client");
			printstream.flush(); //������ �����͸� �ѹ��� ��Ƴ�
			
			client.close(); //Ŭ���̾�Ʈ�� ���Ḹ ����
			System.out.println("Server " + client.getInetAddress().getHostAddress());
			
			//���� ������ ���Ѵ�� ������ �Ǿ���ϳ�
			//���� ������ �ְ� ���� ��
			int count = 0;
			if(count > 7) {
				serverSocket.close(); //������ ������ Ŭ����
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
