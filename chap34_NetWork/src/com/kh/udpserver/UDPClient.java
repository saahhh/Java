package com.kh.udpserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
//UDP����Ŭ������ ��Ÿ��
public class UDPClient {
	//start() UDP������ �����ϴ� �޼���, �׻� ����ó�� �ʿ�
	public void start() throws Exception {
		//������ �����ϰ� �� �� UDP����� �̷����
		DatagramSocket dataSocket = new DatagramSocket();
		//������ �����ϱ� ���� ������ ����
		//127.0.0.1 = localhost Ŭ���̾�Ʈ�� ������ ���� ��ǻ�Ϳ��� �������� ������ ����
		//��Ʈ��ȣ ������ server���� �����ϰ�, �������� ������ ��Ʈ�� ����.
		InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
		//InetAddress serverAddress = InetAddress.getAllByName("127.0.0.1");
													//All�� ������ Ȯ��
		
		//�����Ͱ� ����� ������ ������ ������ ũ��� byte �迭�� ����
		byte[] msg = new byte[200];
		//������ �����͸� ������ ���� ����
		DatagramPacket outPacket = new DatagramPacket(msg,1,serverAddress,8888);
		//�����κ��� �����͸� �����ϱ� ���� ����
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
		
		//DatagramPacket�� ����
		dataSocket.send(outPacket);
		//DatagramPacket�� ����
		dataSocket.receive(inPacket);
		//���ŵ� �����͸� ���ڿ��� ��ȯ�Ͽ� ������ ����ð��� ����Ѵ�
		System.out.println("������ ���� �ð� : " + new String(inPacket.getData()));
		
		//Ŭ���̾�Ʈ�� ������ �ݾƼ� ������ �����Ѵ�
		dataSocket.close();
	}
	public static void main(String[] args) {
		try {
			new UDPClient().start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

