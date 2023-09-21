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
		//���� �ּҿ� ��Ʈ ��ȣ�� ���� ����
		//���� �ּҿ� ��Ʈ��ȣ�� ���� �����ϰ��� �ϴ� ��Ʈ�� �����ؾ��� (TCPServer�� �ּҿ� �����ؾ���)
		Socket socket = new Socket("localhost", 8080);
		System.out.println("[ Server Connect ]");
		
		//���� �� �ڵ�
		OutputStream outStream = socket.getOutputStream();
		PrintStream printStream = new PrintStream(outStream);
		printStream.print("HHHHIIIII SSSEEERRVVEERR");
		printStream.flush();
		
		//�����κ��� �о��
		InputStream InStream = socket.getInputStream();
		Scanner sc = new Scanner(InStream);
		System.out.println("[Client} server" + sc.nextLine());
		
		socket.close();
		System.out.println("Byte Server See you later!!");
	
		}
		
	}
/*		try {
			//���� �ּҿ� ��Ʈ ��ȣ�� ���� ����
			//���� �ּҿ� ��Ʈ��ȣ�� ���� �����ϰ��� �ϴ� ��Ʈ�� �����ؾ��� (TCPServer�� �ּҿ� �����ؾ���)
			Socket socket = new Socket("localhost", 8080);
			System.out.println("[ Server Connect ]");
			
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			
			//���� �Ǵ��� �׽�Ʈ �޼���
			out.println("�ȳ� ����?");
			
			//�����κ��� �޼��� ���޵Ǵ��� Ȯ�� �׽�Ʈ
			String response = in.readLine();
			System.out.println("���� ���� : " + response);
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
*/

