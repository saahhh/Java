package com.kh.IAddress.Practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PracticeAddress {

	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getByName("www.geogle.com");
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Adress bytes�� ����");
			for(byte ip : ipAddress) {
				System.out.print(ip + "."); 
			}
			System.out.println();
			
			InetAddress[] alladdress = InetAddress.getAllByName("www.naver.com");
			System.out.println("���̹��� ������ ��� ȣ��Ʈ�� IP�ּҸ� �迭�� ���� : ");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
