package com.kh.staticVar;

public class StudentMain {
	public static void main(String[] args) {
		StaticVar stkim = new StaticVar();
		stkim.setStudentName("kh");
		//System.out.println(stkim.serialNum);
		//�б����� �л� ȸ������
		//�ϴ� �츮 �б� �л��� �´��� Ȯ��
		//�츮�б� �л� ����Ű;
		//�ø���ѹ��� �����ؼ� -> 20
		//kh�л�1 20
		//kh�л�2 20 //20���� ���ϵǰ� �� �� static���
		System.out.println("kh�л�1");
		stkim.serialNum++;
		
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("KH 2�л�");
		System.out.print("KH stkim : ");
		System.out.println(stkim.serialNum);
		System.out.print("KH 2�л� : ");
		System.out.println(khLee.serialNum);
		
		
	}
}
