package com.kh.classAM;

public class AM {
	public 	  int pNum = 10;
	protected int pNum2 = 20;
	int pNum3 = 30; //���� �����ڸ� ������� ������ �ڵ����� default�� ������ ���� (=defalut ������ ����ȴ�)
	private int pNum4 = 40; //���������� 'private'�� �ٸ� Ŭ�������� ������ ���ϰ� ��ȣ�ϴ� ��
	
	//ȣ�� �޼ҵ� �ۼ��ؼ� ���� ȣ���ϱ�
	
	public void publicMethod() {
		System.out.println("� Ŭ���������� ������ ���� / public Method() ȣ���");
		
	}
	protected void protectedMethod() {
		System.out.println("���� ��Ű�� �������� ���� ���� / protected Method() ȣ���");
		
	}
	void defalutMethod() { //default�� �տ� ���������ڸ� �ۼ������� ������ �⺻���� ������ �� = ����Ʈ�� ���� �ʾƵ��ȴ�.
		System.out.println("���� ��Ű�� �������� ���� ���� / default Method() ȣ���");
		
	}
	private void privateMethod() {
		System.out.println("���� Ŭ���� �������� ���� ���� / private Method() ȣ���");
		
	}
}
