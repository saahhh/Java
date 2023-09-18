package com.kh.ItertorMain;

import java.util.ArrayList;
import java.util.Iterator;

public class ItertorMain {
/*
 Iterator
 	�÷���(������ �׷�)�� �ݺ�(iterate)�ϸ鼭 ��ҿ� �����ϴµ� ���Ǵ� �������̽�
 	�پ��� �÷��� ����(ArrayList, HashSet ��)�� ����� �� ����
 	�÷����� ��Ҹ� �а� �����ϴµ� ���
 	�÷����� ũ�⳪ ���α����� ������� ��ҿ� ���� �Ҽ� �ִ�.
 */
	public static void main(String[] args) {
		
		//ArrayList ���� �� ��� �߰�
		ArrayList<String> music = new ArrayList<>();
		music.add("�߶��");
		music.add("��");
		music.add("Ʈ��Ʈ");
		
		//Iterator ����
		Iterator<String> iter = music.iterator();
		
		//Iterator�� ����Ͽ� ��� �ݺ�
		while(iter.hasNext()) {
			String msc = iter.next(); //msc�� �����Ǵϱ� music�� �̸��� �ٲ㼭 �� //msc�� ��������
			System.out.println(msc);
		}
		
		//Iterator�� ����Ͽ� ��� ����
		iter = music.iterator(); //�ٽ� Iterator �ʱ�ȭ
		while(iter.hasNext()) {
			String msc = iter.next(); //������������ �ٽ� ��������
			//���࿡ Ʈ��Ʈ�� ������ �����ϱ� ����
			if(msc.equals("Ʈ��Ʈ")) {
				iter.remove(); //���� ��� ����
			} System.out.println(msc);
		}
		//���� �� ArrayLsit ���
		System.out.println("���� �� ��� : ");
		for (String a : music) {
			System.out.println(a);
		}

	}

}

/*
���� for��

for �ݺ� �۾��� �� �� ���Ǵ� ���� ����
Ư�� ������ ���� ���� �Ǵ� ����Ʈ, �迭 ���� �÷��� ��Ҹ� �ϳ��� ó���� �� ���

�ڵ� ����
for(����ǵ�����Ÿ�� ������ : ArrayList������) {
	//ó�� ��� �ڵ�
}
*/