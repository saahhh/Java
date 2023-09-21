package com.kh.udpserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
��Ʈ��ũ ����� ���� �߿��� Ŭ����
 UDP(User Datagram Protocol)����ؼ� �����͸� �ۼ����ϴµ� ���
 DatagramSocket
	UDP����� ���� ���� Ŭ����
	TCP ���ϰ� �ٸ��� ������ �����ϰų� ���� ������ �������� �ʰ� ������ ��Ŷ�� �׳� ������ �޴� ����
	
 DatagramPacket
 	UDP������ ��Ŷ�� ��Ÿ���� Ŭ����
 	�������� ��������� �����͸� ���� ��� �Ǵ� �����͸� ������ ����� �ּ� ������ �����Ѵ�.
 	Packet(��Ŷ)�̶�? ��ǻ�� ��Ʈ��ũ�� �����ϴ� �������� ����ȭ�� ���
 					�����͸� �ְ���� �� ���س��� ��Ģ
 					Pack + bucket �� �ռ���
 * */

//UDP������ ��Ÿ��
public class UDPServer {
	//start()�� �޼����̴�. ���⼭�� UDP�� �����ϴ� �޼����̸� ���ܸ� ���� �� �����Ƿ� ���� ó���� �ʿ��ϴ�
	public void start() throws Exception {
		
		//8888�� ��Ʈ�� ����ϴ� �����ϰ� ������ ���� UDP����� �̷������
		DatagramSocket socket = new DatagramSocket(8888);
		//inPacket : Ŭ���̾�Ʈ�κ��� �����͸� ������ �� ���
		//outPacket : Ŭ���̾�Ʈ���� �����͸� ������ �� ���
		DatagramPacket inPacket, outPacket;
		
		byte[] inMsg = new byte[10];
		byte[] outMsg;
		
		//while ������ ����ؼ� ������ ����ؼ� �����Ѵ�
		//�� ������ ������ ����ؼ� Ŭ���̾�Ʈ�κ��� �����͸� �����ϰ� �����ϴ� ������ �Ѵ�
		while(true) {
			//�����͸� �����ϱ� ���� ��Ŷ�� ����
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			
			//��Ŷ�� ���� Ŭ���̾�Ʈ�κ��� �����͸� ����
			socket.receive(inPacket);		
			
			//������ ��Ŷ���� Ŭ���̾�Ʈ�� IP & Port
			//inPacket�� ���� Ŭ���̾�Ʈ�� IP�ּҿ� Port��ȣ�� �����´�
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			
			//������ ���� �ð��� �� �� �� ���·� ��ȯ
			//���� �����ð��� hh:mms:ss������ ���ڿ��� ��ȯ�Ѵ�
			SimpleDateFormat simpledate = new SimpleDateFormat("[hh:mm:ss]");
			String time = simpledate.format(new Date());
			outMsg = time.getBytes(); // byte�迭�� ��ȯ
			
			//��Ŷ�� �����ؼ� Ŭ���̾�Ʈ���� ����
			outPacket = new DatagramPacket(outMsg, outMsg.length, address, port);
		}
	}
	//main �޼��忡���� UDPServer Ŭ������ �ν��Ͻ��� �����ϰ�
	//		strat()�޼��带 ȣ���Ͽ� UDP������ �����Ѵ�
	//���� �߻��ϸ� ���ܸ� ó���ؾ��Ѵ�(Ʈ����ĳġ)
	public static void main(String[] args) {
		try {
			new UDPServer().start(); //udp���� ����
			//new UDPServer.start(); //����. ��ü�� �ƴ� �޼���� ������Ѵ�
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
