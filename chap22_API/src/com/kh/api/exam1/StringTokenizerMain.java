package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
/*
 StringTokenizer 클래스 : 문자열을 분리하는데 사용
 						주어진 구분자(기본은 공백)를 구분으로 문자열을 토큰으로 분리한다
 */
	public static void main(String[] args) {
		String text = "apple orange banana";
		StringTokenizer tokenizer = new StringTokenizer(text);
		
		//hasMoreTokens 은 불린이다 (특정 기준에 따라 토큰이 도달?)
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
	}
}
