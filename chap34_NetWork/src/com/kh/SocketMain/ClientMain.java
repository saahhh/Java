package com.kh.SocketMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// ������ �����ϱ� ���� ������ ����
		Socket socket = new Socket("localHost", 8080);
		
		//������ �����͸� ���������� ��� ��Ʈ�� ����
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		
		//�����κ��� �����͸� �ޱ����� ��� ��Ʈ�� ����
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Ű����κ��� �Է¹ޱ� ���� ����
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
	
		String userInputString;
		while((userInputString = userInput.readLine()) != null) {
			//����� �Է��� ������ �����ϰڽ��ϴ�.
			out.println(userInputString);
			
			//�����κ��� ���� ���� ���
			String serverResponse = in.readLine();
			System.out.println("���� ���� ������ : " + serverResponse);
		}
		//���� �� �Է� ��Ʈ�� �ݱ�
		socket.close();
		userInput.close();
	}
	

}
