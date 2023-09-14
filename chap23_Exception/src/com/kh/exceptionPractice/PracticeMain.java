package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain p = new PracticeMain();
		//p.ArithException();	
		//p.NPException();
		p.NumFormatException();
	}
	
	public void ArithException() {
		//int dividend / divisor �������� �� ����ó��
		int dividend = 100;
		int divisor = 0;
		try {
			int result = 100/0;
			System.out.println("Result : " + result);
		} catch(ArithmeticException e) {
			System.out.println("���� : " + e.getMessage());
		}
	}

	public void NPException() {
		String text = "Hello World";
		String subtext = null;
//		int length = text.indexOf(subtext); //Hello World ���� ���
		try {
			//indexOf subText�� �ִ� null ���� ������ ���ڿ� �˻�
			int length = subtext.length();
			System.out.println(length);
		} catch (NullPointerException a) {
			System.out.println("NullPointerException ���� �߻�" + a.getMessage());
		}
	}
	
	public void NumFormatException() {
		try {
			String text = "123.45";
			int number = Integer.parseInt(text); 
			//�������� ������ ���ڿ��� ������ ��ȯ
			System.out.println(number);
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	} 
}
