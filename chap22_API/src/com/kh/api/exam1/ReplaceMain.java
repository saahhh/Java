package com.kh.api.exam1;

public class ReplaceMain {

	public static void main(String[] args) {
		//replace1();
		ReplaceMain replacemain = new ReplaceMain(); //= 객체, 이 것과 replacemain.replace1();를 다른 클래스에다 가져다 쓸 수 있다
		replacemain.replace1();
		replacemain.replace2();
		replacemain.replace3();
		replacemain.replace4();
		replacemain.replace5();
		replacemain.replaceAll6();
		
	
		String input = "Hello, world";
		String reInput = input.replace(" " , "-");
		System.out.println(reInput);
		String input2 = reInput.replace("-",""); //단어를 교체
		System.out.println("input2 : " + input2);
	}
	
	public void replace1() {
		String input = "Hello, world";
		String reInput = input.replace(" " , "-");
		System.out.println(reInput);
		String input2 = reInput.replace("-",""); 
		System.out.println("input2 : " + input2);
	}
	
	public void replace2() {
		String input = "Hello World!";
		//World를 Java로 교체
		String reInput = input.replace("World","Java"); //(바꿀위치의단어,새로넣을단어)
		System.out.println("input : " + reInput);
	}
	public void replace3() {
		String originName = "Hello world";
		//o로 적혀 있는 문자열들 x로 변경하기
		String reoriginName = originName.replace("o", "x");
		System.out.println(reoriginName);
	}
	
	public void replace4() {
		String originString = "The quick brown fox jups over the lazy dog";
		// fox를 cat으로 바꾸기
		String reoriginString = originString.replace("fox" , "cat"); //reoriginString를 reStr로도 가능
		System.out.println(reoriginString);
	}
	
	public void replace5() {
		String originString = "The quick brown fox jups over the lazy dog";
		// 모든 공백 제거하기
		String reoriginString = originString.replace(" ", "");
		System.out.println(reoriginString);
		String reAllstr = originString.replace("\\s", "");
		System.out.println(reAllstr);
	}
	
	public void replaceAll6() {
		String originString = "Hello World";
		// replace 대신 replaceAll을 이용해서 대소문자 구분없이 문자열 치환하기
		String reAllstr = originString.replaceAll("(?i)World", "" );
		System.out.println(reAllstr);
	
	}
}
