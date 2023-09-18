package com.kh.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparator<String> {
		//List客 ArrayList甫 积己秦辑 Comparator 沥府
	
		@Override
		public int compare (String num1, String num2) {
			
			if(num1.length() == num2.length()) {
				return 0;
			}
			else if (num1.length() > num2.length()) {
				return 1;
			}
			else {
				return -1;
			}
		}
		public static void main(String[] args) {
			List<String> str = new ArrayList<>();
			str.add("bob");
			str.add("hani");
			str.add("any");
			str.add("stella");
			
			Collections.sort(str, new Student());
			
			for(String s : str) {
				System.out.println(s);
			}
	}
}
