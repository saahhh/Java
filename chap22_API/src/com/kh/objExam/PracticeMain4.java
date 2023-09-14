//formatexam
package com.kh.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PracticeMain4 {
	
	public static void main(String[] args) {
			PracticeMain4 p = new PracticeMain4();
			p.practice1();
			p.practice2();
			p.practice3();
			p.practice4();
	}
	  public void practice1() {
		
		
	} public void practice2() {
			//날짜 형식 출력
			Date currentDate = new Date();
			SimpleDateFormat smDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String formatStr = String.format("현재 날짜 : %s", smDateFormat.format(currentDate));
			System.out.println("formatStr");
			
	} public void practice3() {
			int num = 123;
			int num2 = 7;
			//숫자가 지정된 넓이보다 짧을 경우, 앞에 0으로 채워주겠다.
			//출력되는 숫자의 최소 너비 자리를 5자리로 하고 싶을 경우 %05d 로 쓴다.
			String str = String.format("숫자1:%d,숫자2:%d",num,num2); //""안에 한번에 넣어주기
			
			//String 변수명 = String.format("숫자1: 숫자, 숫자2: 숫자,숫자);
			System.out.println(str);
	}
	
		public void practice4() {
			String text1 = "Hello";
			String text2 = "World";
			//10은 최소 너비, 10자리의 공간을 차지
			//만약 문자열이 10자리보다 짧다면 왼쪽에 공백으로 채워짐
			//만약 문자열이 10자리보다 짧다면 오른쪽에 공백으로 채워짐
			//' (작은따옴표)로 둘러싸야한다.
			String formatStr = String.format("'%-10s' '%10s'", text1 , text2);
			System.out.println(formatStr);
	}

}
