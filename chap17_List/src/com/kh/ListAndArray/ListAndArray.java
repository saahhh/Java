package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {
			
	public static void main(String[] args) {
//		ListArray1(); //static�� �߰��� �� ����
//		ListArray2();
		
//		or
		
		ListAndArray LAA = new ListAndArray();
		LAA.ListArray1();
		LAA.ListArray2();
	}
		
		//ListArray1();
	public static void ListArray1() {
		// Array ����
		int[] intArray = new int[2]; //ũ�Ⱑ 2�� ���� �迭 ����
		intArray[0] = 1;
		intArray[1] = 2;

		// Array ���
		System.out.println("Array ��� : ");
		for(int a=0; a < intArray.length; a++) {
			System.out.print(intArray[a] + " ");
		}
		System.out.println(); // ���๮�� ���Ե��־� enter���� ������ ���ش�.
		
		// List ����
			//Integer = int			//�� �迭 ����Ʈ ����
		List<Integer> intList = new ArrayList<>(); //����Ʈ�� ��̸���Ʈ ����Ʈ���ֱ�
									//integer ��ü�� �����ϴ� ArrayList ����
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		// List ���
		System.out.println("List ��� : ");
		for(int num : intList) { //ArrayList �� ����for���� ����Ѵ�.
			System.out.print(num + " ");
		}
	}
	
	public static void ListArray2() { //static�� ������ ������ �ŷ����̶�� �����ϸ� �ȴ�, static�� �־�� ������ �ϼ��Ǵ°�
		//String���� ���� �� Array�� List ����غ���
		String[] strArray = new String[2];
		strArray[0] = "����";
		strArray[1] = "�ٳ���";
		
		System.out.println("Array ��� : ");
		 for(int i=0; i<strArray.length; i++) {
			 System.out.print(strArray[i] + " ");
		 }
		 System.out.println();
		 
		 List<String> strList = new ArrayList<>();
		 strList.add(0, "���"); //���� �ε�����ȣ�� �� �ʿ䰡 ����, List�� ������ ���� �ƴϱ� ����
		 strList.add(1, "Ű��");
		 strList.add(2, "ü��");
		 strList.add(2, "���ξ���");
		 
		 System.out.println("List ��� : ");
		 for(String str : strList) {
			 System.out.println(str);
		 }
	}
	
	
	
	

}


		//List�� �������� ����� ���� ��ü�� Object��� �Ѵ�. �켱�� ��������� ������.
		//ArrayList<>(); �� �� �迭 ����Ʈ ����
		//Array�� ���뼺�� ����, �ݸ鿡 List�� ���뼺�� �ִ�. (���߿� �޸𸮿� ���õ�)
