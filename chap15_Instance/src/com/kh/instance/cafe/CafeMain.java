package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafe client = new Cafe("�Ƹ޸�ī��",2,true);
		Cafe client1 = new Cafe("�ٴҶ��",3,false);		
		Cafe client2 = new Cafe("ī���",1,true);
		
		client.CafeMenu();
		client1.CafeMenu();
		client2.CafeMenu();
		
	}

}
