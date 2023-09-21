package com.kh.udpserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClient {
	public void start() throws Exception {
		DatagramSocket dataSocket = new DatagramSocket();
		InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
		//InetAddress serverAddress = InetAddress.getAllByName("127.0.0.1");
													//All�� ������ Ȯ��
		
		//�����Ͱ� ����� ������ ������ ������ ũ��� byte �迭�� ����
		byte[] msg = new byte[200];
		DatagramPacket outPacket = new DatagramPacket(msg,1,serverAddress,8888);
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
		
		//DatagramPacket�� ����
		dataSocket.send(outPacket);
		//DatagramPacket�� ����
		dataSocket.receive(inPacket);
		System.out.println("������ ���� �ð� : " + new String(inPacket.getData()));
		
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

