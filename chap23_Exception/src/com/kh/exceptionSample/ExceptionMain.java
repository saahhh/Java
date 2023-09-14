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
			int result = 10/0; //0���� ������ �õ�
			System.out.println("Result : " + result);

		} catch (ArithmeticException e) {
			/*
			 ArithmeticException �������� ��� �������� �߻��ϴ� ����
			 ArithmeticException e : e�� �츮�� ������ ������ (���Ƿ� ���� ��)
			 e�� ������ ������ �޼����� getMessage()�� ���޹޴´�.
			*/
			
			System.out.println("��� �������� ���� �߻��� ����!!" +e.getMessage());			
		}
	
	}	

	public void ExceptionN() {
		try {
			String text = null;
			int length = text.length(); //������ ���µ� text�� ���� ���ڿ��� ���̸� ���
			System.out.println("���ڿ��� ���� : " + length);
		} catch (NullPointerException abc) {
			System.out.println("���Դϴ�. ��ȣ�� �ʼ��� �Է��ϼ���.");
			System.out.println("�� ����!!" + abc.getMessage());
			
		}
			
		/*Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "text" is null
		at com.kh.exceptionSample.ExceptionMain.ExceptionN(ExceptionMain.java:28)
		at com.kh.exceptionSample.ExceptionMain.main(ExceptionMain.java:8)*/
	} 

	public void ExceptionF() {
		try {
			String juminNumber = "������904";
			int number = Integer.parseInt(juminNumber); //���ڿ��� ������ ��ȯ �õ�
			System.out.println("���� : " + number); //�ȿ� String�� ����ֱ� ������ ������ ���� �ʴ´�.
		} catch (NumberFormatException format) {
			System.out.println("���ڸ� �־��ּ���.");
			System.out.println("NumberFormatException �߻� : " + format.getMessage());
		}

	
		/*Exception in thread "main" java.lang.NumberFormatException: For input string: "�ȿ���904"
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
			int index = 7; //��ȿ���� ���� �ε��� �ѹ�
			int result = numbers[index]; //�迭 ��ҿ� ����
			System.out.println("Result : " + result);
		} catch(ArrayIndexOutOfBoundsException e) { //ArrayIndexOutOfBoundsException e �� �������� ���� �ؿ� catch �ѹ� �� ���°� ����
			//�迭 �ε����� ������ ����� �� �߻��ϴ� ���� ó��
			System.out.println("�迭 �ε��� ������ ��� ���ܰ� �߻�!!");
		} catch(Exception e) {
			//�ٸ� ���ܸ� ó���� �� �ִ� ���� ó��
			System.out.println("�迭 �ε��� ������ ��� ���ܰ� �ƴ� �Ϲ����� �ٸ� ���� �߻�");
		
		} finally { //finally�� ���(��Ȳ)�� ���� �־ �ȳ־ ����
			//�׻� ����Ǵ� ���
			System.out.println("Finally ����!");
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
