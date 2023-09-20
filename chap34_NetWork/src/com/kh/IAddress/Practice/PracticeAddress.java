package com.kh.IAddress.Practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PracticeAddress {

	public static void main(String[] args) {
		//호스트 이름을 가져와서 객체 생성
		try {
			InetAddress address = InetAddress.getByName("www.geogle.com");
			
			//IP주소를 Byte배열로 읽기
			//InetAdress 객체에서 IP주소를 바이트 배열로 얻음
			//IP주소를 바이트 배열로 얻으면 각 바이트를 통해 IP주소를 다룰 수 있다.
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Adress bytes로 얻음");
			for(byte ip : ipAddress) {
				System.out.print(ip + "."); 
			}
			System.out.println();
			
			//도메인 명에 지정된 모든 호스트의 IP주소를 배열로 얻기
			InetAddress[] alladdress = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버에 지정된 모든 호스트의 IP주소를 배열로 얻음 : ");
			for(InetAddress addr : alladdress) {
				System.out.println(addr.getHostAddress());
				/*향상된 for문
				for 반복 작업을 할 때 사용되는 제어 구조
				특정 조건이 참인 동안 또는 리스트, 배열 등의 컬렉션 요소를 하나씩 처리할 때 사용
				코드 구조
				for(요소의데이터타입 변수명 : ArrayList변수명) {
					//처리 요소 코드*/
			
			//호스트 이름 얻기
			String hostName = address.getHostName();
			System.out.println("Host Name : " + hostName);
			
			//지역 호스트의 IP주소 얻기
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host address : " + localHost.getHostAddress());
			
			//멀티캐스트 주소 여부 확인
			boolean isMultiCast = address.isMulticastAddress();
			System.out.println("멀티캐스트 주소입니까?" + isMultiCast);
			
			//호스트 이름을 이용해서 InetAddress 객체 생성
			InetAddress name = InetAddress.getByName("www.daum.net");
			System.out.println("IP주소 이름 : " + name.getHostAddress());
			
			//호스트의 완전한 이름 가져오기(전체 도메인 이름)
			//호스트의 정규화된 (FQDN) 도메인의 이름을 얻음
			//FQDN : Full Qualified Domain Name
			String hostFullName = address.getCanonicalHostName();
			System.out.println("풀네임 : " + hostFullName);
			
			//LookPack 주소 여부 확인
			boolean isLookPack = address.isLinkLocalAddress();
			System.out.println("룩팩인가요? : " + isLookPack);
			
			
				}	
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
