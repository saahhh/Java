package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
			
		PracticeMain2 p = new PracticeMain2();
		p.practice1();
		p.practice2();
		p.practice3();
		p.practice4();
		p.practice5();
		p.practice6();
		
	}	
	public void practice1() {
		
		StringBuffer sb = new StringBuffer();
		//���ڿ� �����̱� ��� append ,append�� ���� �ڿ� �����̴°�, ������ �ƴ�
//		StringBuffer sb = new StringBuffer(); //���⼭ sb�� ��� ���ڸ� �����ߴٰ� �����صа�, 
		sb.append("���� ");//������ ������
		sb.append("������ ������");
		System.out.println(sb.toString());
	}
	
	public void practice2() {
		
		StringBuffer sb = new StringBuffer();
		
		//���ڿ� ������ ���� ������ ������ reverse
		String str = "���� ������ ������";
		sb.append(str);
		sb.reverse();
		System.out.println(sb.toString());
	}
	
	public void practice3() {
		//���ڿ� ���� insert ? ����
		StringBuffer sb = new StringBuffer();
		String str = "���� ������ ������";
		sb.append(str);
		sb.insert(10, "? ����");
		System.out.println(sb.toString());
	}
	
	public void practice4() {
		//���ڿ� ��ü replace(,,);
		StringBuffer sb = new StringBuffer();
		String str = "���� ������ ������";
		sb.append(str);
		sb.replace(0,2,"����");
		System.out.println(sb.toString());
	}
	
	public void practice5() {
		//���ڿ� ���� delete(,,);
		StringBuffer sb = new StringBuffer();
		String str = "���� ������ ������";
		sb.append(str);
		sb.delete(0,2);
		System.out.println(sb.toString());
	}

	
	
	public void practice6() { // 2~5���� �� ����� ����
		//���ڿ� ���� insert ? ����
		String str = "���� ������ ������";
		StringBuffer sb = new StringBuffer(str); //new StringBuffer() �� ��ȣ�� str �־ ����
		sb.insert(10, "? ����");
		System.out.println(sb.toString());
	}
}
	
