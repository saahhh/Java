package com.kh.ItertorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		//Iterator 
		ArrayList<String> snack = new ArrayList<>();
		snack.add("ĭ��");
		snack.add("������Ĩ");
		snack.add("����Ĩ");
		snack.add("������");
		
		Iterator<String> iter = snack.iterator();
		
		while(iter.hasNext()) {
			String snk = iter.next();
			System.out.println(snk);
		}
		iter = snack.iterator();
		while(iter.hasNext()) {
			String snk = iter.next();
			if(snk.equals("������")) {
				iter.remove();
			} System.out.println(snk);
		}
		System.out.println("���� �� ��� : ");
		for (String a : snack) {
			System.out.println(a);
		}
	}

}
