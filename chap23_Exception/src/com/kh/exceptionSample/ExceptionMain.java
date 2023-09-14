package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionMain exmain = new ExceptionMain();
		//exmain.ExceptionA();
		//exmain.ExceptionN();
		//  exmain.ExceptionF();
		  exmain.ExceptionExam();
		  
	}

	public void ExceptionA() {
		try {
			int result = 10/0; //0으로 나누는 시도
			System.out.println("Result : " + result);

		} catch (ArithmeticException e) {
			/*
			 ArithmeticException 수학적인 계산 과정에서 발생하는 오류
			 ArithmeticException e : e는 우리가 지정한 변수명 (임의로 정한 것)
			 e로 지정한 변수로 메세지를 getMessage()로 전달받는다.
			*/
			
			System.out.println("산술 연산으로 인해 발생한 에러!!" +e.getMessage());			
		}
	
	}	

	public void ExceptionN() {
		try {
			String text = null;
			int length = text.length(); //내용이 없는데 text로 부터 문자열의 길이를 얻기
			System.out.println("문자열의 길이 : " + length);
		} catch (NullPointerException abc) {
			System.out.println("빈값입니다. 번호를 필수로 입력하세요.");
			System.out.println("빈 값임!!" + abc.getMessage());
			
		}
			
		/*Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "text" is null
		at com.kh.exceptionSample.ExceptionMain.ExceptionN(ExceptionMain.java:28)
		at com.kh.exceptionSample.ExceptionMain.main(ExceptionMain.java:8)*/
	} 

	public void ExceptionF() {
		try {
			String juminNumber = "공오공904";
			int number = Integer.parseInt(juminNumber); //문자열을 정수로 변환 시도
			System.out.println("숫자 : " + number); //안에 String이 들어있기 때문에 실행이 되지 않는다.
		} catch (NumberFormatException format) {
			System.out.println("숫자만 넣어주세요.");
			System.out.println("NumberFormatException 발생 : " + format.getMessage());
		}

	
		/*Exception in thread "main" java.lang.NumberFormatException: For input string: "팔오공904"
		at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
		at java.base/java.lang.Integer.parseInt(Integer.java:668)
		at java.base/java.lang.Integer.parseInt(Integer.java:786)
		at com.kh.exceptionSample.ExceptionMain.ExceptionF(ExceptionMain.java:47)
		at com.kh.exceptionSample.ExceptionMain.main(ExceptionMain.java:9)
		 */
	}

	public void ExceptionExam() {
		try {
			int[] numbers = {1,2,3,4,5};
			int index = 7; //유효하지 않은 인덱스 넘버
			int result = numbers[index]; //배열 요소에 접근
			System.out.println("Result : " + result);
		} catch(ArrayIndexOutOfBoundsException e) { //ArrayIndexOutOfBoundsException e 는 지역변수 여서 밑에 catch 한번 더 쓰는게 가능
			//배열 인덱스가 범위를 벗어났을 때 발생하는 예외 처리
			System.out.println("배열 인덱스 범위를 벗어나 예외가 발생!!");
		} catch(Exception e) {
			//다른 예외를 처리할 수 있는 예외 처리
			System.out.println("배열 인덱스 범위를 벗어난 예외가 아닌 일반적인 다른 예외 발생");
		
		} finally { //finally는 경우(상황)에 따라 넣어도 안넣어도 가능
			//항상 실행되는 블록
			System.out.println("Finally 등장!");
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
