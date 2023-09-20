package com.kh.IAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {
	public static void main(String[] args) {
		InetAddressMain inetMain = new InetAddressMain();
		inetMain.InetSample();
		
	}
	
	public void InetExam() {
		try {
			//ȣ��Ʈ �̸� �̿��ؼ� ��ü ����
			InetAddress address = InetAddress.getByName("www.naver.com");
			
			//IP �ּ� ���
			System.out.println("Host Name : " + address.getHostName());
			System.out.println("IP Address : " + address.getHostAddress());
			
			//���� ȣ��Ʈ(���� ����ϴ� ��ǻ��)�� InetAddress ��ü ���
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Name : " + localHost.getHostName());
			System.out.println("Local IP Address : " + localHost.getHostAddress());
			
			
			
			//ȣ��Ʈ �̸� �̿��ؼ� ��ü ����
			InetAddress address2 = InetAddress.getByName("www.geogle.com");
			
			//IP �ּ� ���
			System.out.println("Host Name : " + address2.getHostName());
			System.out.println("IP Address : " + address2.getHostAddress());
			
			//ȣ��Ʈ �̸� �̿��ؼ� ��ü ����
			InetAddress address3 = InetAddress.getByName("www.daum.net");
			
			//IP �ּ� ���
			System.out.println("Host Name : " + address3.getHostName());
			System.out.println("IP Address : " + address3.getHostAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void InetSample() {
		//ȣ��Ʈ �̸��� �����ͼ� ��ü ����
		try {
			InetAddress address = InetAddress.getByName("www.naver.com");
			
			//IP�ּҸ� Byte�迭�� �б�
			//InetAddress ��ü���� IP�ּҸ� ����Ʈ �迭�� ����
			//IP�ּҸ� ����Ʈ �迭�� ������ �� ����Ʈ�� ���� IP�ּҸ� �ٷ� �� �ִ�
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address bytes�� ����");
			for( byte ip : ipAddress ) {
				System.out.print(ip + "."); //.�� ���м�
			}
			System.out.println();
			
			//������ ���� ������ ��� ȣ��Ʈ�� IP�ּҸ� �迭�� ���
			InetAddress[] alladdress = InetAddress.getAllByName("www.geogle.com");
			System.out.println("���ۿ� ������ ��� ȣ��Ʈ�� IP�ּҸ� �迭�� ���� : ");
			for(InetAddress addr : alladdress) {
				System.out.println(addr.getHostAddress());
			}
			
			//ȣ��Ʈ �̸� ���
			String hostName = address.getHostName();
			System.out.println("Host Name : " + hostName);
			
			//���� ȣ��Ʈ�� IP�ּ� ��� //localHost�� ���� �� ��ǻ�Ͷ���
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host address : " + localHost.getHostAddress());
			
			//��Ƽĳ��Ʈ �ּ� ���� Ȯ��
			boolean isMultiCast = address.isMulticastAddress();
			System.out.println("��Ƽĳ��Ʈ �ּ��Դϱ�? " + isMultiCast);

			//ȣ��Ʈ �̸��� �̿��ؼ� InetAddress ��ü ����
			InetAddress name = InetAddress.getByName("www.daum.net");
			System.out.println("IP�ּ� �̸� : " + name.getHostAddress());
			
			//ȣ��Ʈ�� ������ �̸� �������� (��ü ������ �̸�)
			//ȣ��Ʈ�� ����ȭ�� (FQDN) �������� �̸��� ����
			//FQDN : Full Qualified Domain Name
			String hostFullName = address.getCanonicalHostName();
			System.out.println("Ǯ���� : " + hostFullName);
			
			//LookPack �ּ� ���� Ȯ�� //�������� ���𰡸� ���� ����ϴ°� //���̹��� false
			boolean isLookPack = address.isLoopbackAddress();
			System.out.println("�����ΰ���? : " + isLookPack);
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}