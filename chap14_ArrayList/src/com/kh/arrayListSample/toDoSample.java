package com.kh.arrayListSample;

import java.util.ArrayList;

public class toDoSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ToDo = new ArrayList<>();
		System.out.println("ToDo : " + ToDo);
		
		ToDo.add("��Ա�");
		System.out.println("�� �Ա� : " + ToDo);
		ToDo.add("ī�䰡��");
		System.out.println("ī�䰡�� : " + ToDo);
		ToDo.add("���ڱ�");
		System.out.println("���ڱ� : " + ToDo);
		
		int size = ToDo.size();
		System.out.println("���� ����� ũ�� : " + size);
		
		String firstToDo = ToDo.get(0);
		System.out.println("ù ��° ���� : " + firstToDo);
		
		ToDo.set(1,"��ϱ�");
		System.out.println("����üũ : " + ToDo);
		
		ToDo.remove(2);
		System.out.println("ī�䰡�� ����Ȯ�� : " + ToDo);
		
		//AarryList ��ȸ�ؼ� ������
		for(String aaaaa : ToDo) {
			System.out.println(ToDo);
		}
		
		ToDo.clear();
		System.out.println("��� ���� ���� : " + ToDo);
	}

}


/* ����
ToDo : []
�� �Ա� : [��Ա�]
ī�䰡�� : [��Ա�, ī�䰡��]
���� : [��Ա�, ī�䰡��, ����]
���� ����� ũ�� : 3
ù ��° ���� : [��Ա�, ī�䰡��, ����]
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
	at java.base/java.util.Objects.checkIndex(Objects.java:359)
	at java.base/java.util.ArrayList.set(ArrayList.java:441)
	at com.kh.arrayListSample.toDoSample.main(toDoSample.java:25)

*/