package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
//���ܸ� ���� ���� �� Ʈ����ĳġ
//Ŭ�����ȿ��� �ذ��� �� throws (��Ű������������輺������)


public class TcpClient { //�޼ҵ� �߰�
	public static void main(String[] args) throws Exception {
		int port = 3333;
		String serverIP; //�� ������ �ּ�
		serverIP = InetAddress.getLocalHost().getHostAddress();
		System.out.println(serverIP);
		try {
//			serverIP = InetAddress.getLocalHost().getHostAddress();
//			System.out.println("serverIP");
			Socket socket = new Socket(serverIP, port);
			System.out.println("server connect");
			
			//Ŭ���̾�Ʈ�� ����� ���� �� ��� ��Ʈ�� ���� 
			//BufferedReader �� ���� �Է� '��Ʈ��'���� �ؽ�Ʈ�� �а�, ���ڸ� ���۸��Ͽ� ����, �迭 �� ���� ȿ�������� ���� �� �ֵ��� �Ѵ�.
			//��Ʈ���� ���� ������ inputstream,outputstream�� �ܾ ����Ѵ�
			//BufferedReader(Reader in) : �⺻ ũ�⸦ ����ϴ� ���۸� ���� �Է� ��Ʈ���� ����ϴ�. �Է� ����.
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			OutputStream out = socket.getOutputStream();
			
			//Ŭ���̾�Ʈ���� ������ �޼��� ����
			String msg = "hi server";
			out.write(msg.getBytes());
			out.flush();
			
			String response = in.readLine();
			System.out.println("���� ���� : " + response);
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
}
