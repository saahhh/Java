package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafe client = new Cafe("¾Æ¸Þ¸®Ä«³ë",2,true);
		Cafe client1 = new Cafe("¹Ù´Ò¶ó¶ó¶¼",3,false);		
		Cafe client2 = new Cafe("Ä«Æä¶ó¶¼",1,true);
		
		client.CafeMenu();
		client1.CafeMenu();
		client2.CafeMenu();
		
	}

}
