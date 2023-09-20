package com.kh.IAddress.Practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PracticeAddress {

	public static void main(String[] args) {
		//ȣ��Ʈ �̸��� �����ͼ� ��ü ����
		try {
			InetAddress address = InetAddress.getByName("www.geogle.com");
			
			//IP�ּҸ� Byte�迭�� �б�
			//InetAdress ��ü���� IP�ּҸ� ����Ʈ �迭�� ����
			//IP�ּҸ� ����Ʈ �迭�� ������ �� ����Ʈ�� ���� IP�ּҸ� �ٷ� �� �ִ�.
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Adress bytes�� ����");
			for(byte ip : ipAddress) {
				System.out.print(ip + "."); 
			}
			System.out.println();
			
			//������ �� ������ ��� ȣ��Ʈ�� IP�ּҸ� �迭�� ���
			InetAddress[] alladdress = InetAddress.getAllByName("www.naver.com");
			System.out.println("���̹��� ������ ��� ȣ��Ʈ�� IP�ּҸ� �迭�� ���� : ");
			for(InetAddress addr : alladdress) {
				System.out.println(addr.getHostAddress());
				/*���� for��
				for �ݺ� �۾��� �� �� ���Ǵ� ���� ����
				Ư�� ������ ���� ���� �Ǵ� ����Ʈ, �迭 ���� �÷��� ��Ҹ� �ϳ��� ó���� �� ���
				�ڵ� ����
				for(����ǵ�����Ÿ�� ������ : ArrayList������) {
					//ó�� ��� �ڵ�*/
			
			//ȣ��Ʈ �̸� ���
			String hostName = address.getHostName();
			System.out.println("Host Name : " + hostName);
			
			//���� ȣ��Ʈ�� IP�ּ� ���
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host address : " + localHost.getHostAddress());
			
			//��Ƽĳ��Ʈ �ּ� ���� Ȯ��
			boolean isMultiCast = address.isMulticastAddress();
			System.out.println("��Ƽĳ��Ʈ �ּ��Դϱ�?" + isMultiCast);
			
			//ȣ��Ʈ �̸��� �̿��ؼ� InetAddress ��ü ����
			InetAddress name = InetAddress.getByName("www.daum.net");
			System.out.println("IP�ּ� �̸� : " + name.getHostAddress());
			
			//ȣ��Ʈ�� ������ �̸� ��������(��ü ������ �̸�)
			//ȣ��Ʈ�� ����ȭ�� (FQDN) �������� �̸��� ����
			//FQDN : Full Qualified Domain Name
			String hostFullName = address.getCanonicalHostName();
			System.out.println("Ǯ���� : " + hostFullName);
			
			//LookPack �ּ� ���� Ȯ��
			boolean isLookPack = address.isLinkLocalAddress();
			System.out.println("�����ΰ���? : " + isLookPack);
			
			
				}	
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
