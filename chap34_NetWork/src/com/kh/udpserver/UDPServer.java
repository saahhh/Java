package com.kh.udpserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
네트워크 통신을 위한 중요한 클래스
 UDP(User Datagram Protocol)사용해서 데이터를 송수신하는데 사용
 DatagramSocket
	UDP통신을 위한 소켓 클래스
	TCP 소켓과 다르게 연결을 설정하거나 연결 유지를 관리하지 않고 데이터 패킷을 그냥 보내고 받는 역할
	
 DatagramPacket
 	UDP데이터 패킷을 나타내는 클래스
 	데이터의 실제내용과 데이터를 보낼 대상 또는 데이터를 수신할 대상의 주소 정보를 포함한다.
 	Packet(패킷)이란? 컴퓨터 네트워크가 전달하는 데이터의 형식화된 블록
 					데이터를 주고받을 때 정해놓은 규칙
 					Pack + bucket 의 합성어
 * */

//UDP서버를 나타냄
public class UDPServer {
	//start()도 메서드이다. 여기서는 UDP를 시작하는 메서드이며 예외를 던질 수 있으므로 예외 처리가 필요하다
	public void start() throws Exception {
		
		//8888번 포트를 사용하는 생성하고 소켓을 통해 UDP통신이 이루어진다
		DatagramSocket socket = new DatagramSocket(8888);
		//inPacket : 클라이언트로부터 데이터를 수신할 때 사용
		//outPacket : 클라이언트에게 데이터를 전송할 때 사용
		DatagramPacket inPacket, outPacket;
		
		byte[] inMsg = new byte[10];
		byte[] outMsg;
		
		//while 루프를 사용해서 서버를 계속해서 실행한다
		//이 루프는 서버가 계속해서 클라이언트로부터 데이터를 수신하고 응답하는 역할을 한다
		while(true) {
			//데이터를 수신하기 위한 패킷을 생성
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			
			//패킷을 통해 클라이언트로부터 데이터를 받음
			socket.receive(inPacket);		
			
			//수신한 패킷에서 클라이언트의 IP & Port
			//inPacket을 통해 클라이언트의 IP주소와 Port번호를 가져온다
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			
			//서버의 현재 시간을 시 분 초 형태로 반환
			//현재 서버시간을 hh:mms:ss형식의 문자열로 변환한다
			SimpleDateFormat simpledate = new SimpleDateFormat("[hh:mm:ss]");
			String time = simpledate.format(new Date());
			outMsg = time.getBytes(); // byte배열로 변환
			
			//패킷을 생성해서 클라이언트한테 전송
			outPacket = new DatagramPacket(outMsg, outMsg.length, address, port);
		}
	}
	//main 메서드에서는 UDPServer 클래스의 인스턴스를 생성하고
	//		strat()메서드를 호출하여 UDP서버를 실행한다
	//예외 발생하면 예외를 처리해야한다(트라이캐치)
	public static void main(String[] args) {
		try {
			new UDPServer().start(); //udp서버 실행
			//new UDPServer.start(); //에러. 객체가 아닌 메서드로 써줘야한다
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
