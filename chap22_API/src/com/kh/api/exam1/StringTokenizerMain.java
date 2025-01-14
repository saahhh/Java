package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
/*
 StringTokenizer 클래스 : 문자열을 분리하는데 사용
 						주어진 구분자(기본은 공백)를 구분으로 문자열을 토큰으로 분리한다
*/
	public static void main(String[] args) {
	
		StringTokenizerMain stm = new StringTokenizerMain();
		stm.STExam();
		stm.stExam2();
		stm.stExam3();
		stm.stExam4();
		stm.stExam5();
		stm.stringtoMath();
	}
	
	public void STExam() {
		String text = "apple orange banana";
		StringTokenizer tokenizer = new StringTokenizer(text);
		
		//hasMoreTokens 은 불린이다 (true,false)
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
	}
	public void stExam2() {
		String text = "apple,orange,banana";
		StringTokenizer tokenizer = new StringTokenizer(text,",");
		while (tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	
	public void stExam3() {
		// - 구분자를 사용해서 text 만들고 - 구분자로 끊어서 출력하기
		String text = "apple-orange-banana";
		StringTokenizer tokenizer = new StringTokenizer(text,"-");
		while (tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	public void stExam4() {
		//특정 단어 제외하고 구분자로 분리
		String text = "This is a test. But not a real one.";
		StringTokenizer tokenizer = new StringTokenizer(text," .");
		
		while(tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			if(!word.equals("test")) { //test 문자 빼고 출력하는 것
				System.out.println(word); //test가 아니라면 출력하겠다
			}
		}
	}
	
	public void stExam5() {
		//날짜 구분자로 분리
		String date = "2023-09-13";
		StringTokenizer tokenizer = new StringTokenizer(date, "-");
		int year = Integer.parseInt(tokenizer.nextToken());
		int month = Integer.parseInt(tokenizer.nextToken());
		int day = Integer.parseInt(tokenizer.nextToken());
		System.out.println(/*"Year : " +*/ year + "년 " + month + "월 "+ day + "일");
//		System.out.println("Month : " + month + "월 ");
//		System.out.println("day : " + day + "일");
	}
	
	public void stringtoMath() {
		String text = "The Price is $15.99";
		StringTokenizer tokenizer = new StringTokenizer(text, "$.");
		
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if(token.matches("\\d+(\\.\\d+)?")) {
				System.out.println("Number : " + token);
			}
		}
	}
			
}

