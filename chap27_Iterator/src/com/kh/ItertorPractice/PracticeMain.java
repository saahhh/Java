package com.kh.ItertorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		//Iterator 
		ArrayList<String> snack = new ArrayList<>();
		snack.add("Ä­Ãİ");
		snack.add("Æ÷Å×ÅäÄ¨");
		snack.add("ÃÊÄÚÄ¨");
		snack.add("²¿±òÄÜ");
		
		Iterator<String> iter = snack.iterator();
		
		while(iter.hasNext()) {
			String snk = iter.next();
			System.out.println(snk);
		}
		iter = snack.iterator();
		while(iter.hasNext()) {
			String snk = iter.next();
			if(snk.equals("²¿±òÄÜ")) {
				iter.remove();
			} System.out.println(snk);
		}
		System.out.println("»èÁ¦ ÈÄ Ãâ·Â : ");
		for (String a : snack) {
			System.out.println(a);
		}
	}

}
