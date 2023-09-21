package com.kh.udpserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
//UDP서버클래스를 나타냄
public class UDPClient {
	//start() UDP서버를 시작하는 메서드, 항상 예외처리 필요
	public void start() throws Exception {
		//소켓을 생성하고 난 후 UDP통신이 이루어짐
		DatagramSocket dataSocket = new DatagramSocket();
		//서버에 연결하기 위해 소켓을 생성
		//127.0.0.1 = localhost 클라이언트와 서버가 같은 컴퓨터에서 실행중인 것으로 가정
		//포트번호 설정을 server에서 진행하고, 서버에서 연결한 포트로 들어간다.
		InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
		//InetAddress serverAddress = InetAddress.getAllByName("127.0.0.1");
													//All이 들어갔는지 확인
		
		//데이터가 저장될 공간을 임의의 지정된 크기로 byte 배열이 생성
		byte[] msg = new byte[200];
		//서버로 데이터를 보내기 위한 설정
		DatagramPacket outPacket = new DatagramPacket(msg,1,serverAddress,8888);
		//서버로부터 데이터를 수신하기 위한 설정
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
		
		//DatagramPacket을 전송
		dataSocket.send(outPacket);
		//DatagramPacket을 수신
		dataSocket.receive(inPacket);
		//수신된 데이터를 문자열로 변환하여 서버의 현재시간을 출력한다
		System.out.println("서버의 현재 시간 : " + new String(inPacket.getData()));
		
		//클라이언트의 소켓을 닫아서 연결을 종료한다
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

