package com.kh.thisSample;
/*
this ��ü(=�ν��Ͻ�) �ڽ��� ����Ű�� �������� ��ü(=�ν��Ͻ�)�� �ּҰ� ����Ǿ� ����
���������� ���������� ���� ���� ����
this() ���� Ŭ������ �ٸ� �����ڸ� ȣ���ϴµ� ���

	int x = 10; //���� x�� 10�̶�� ���� �Ҵ�
	int y = x; //�������� y�� x�� ����Ų��.
	
	x = 20;
	System.out.println("y :" + y);// y���� �ֱ� �ʾұ� ������ 10�� ����
	
	x=20;
	y=x;
	System.out.println("y : " + y);//20�� ����
	
	int[] list1 = {1,2,3};
	int[] list2 = list1; //list2  list1	
*/
/*
�ν��Ͻ��� ��ü
��ü = �ν��Ͻ�, �Ȱ��� ���ε� �޸𸮰������� ���� �ٸ�
��ü Ŭ������ �ν��Ͻ�	
*/


class MyClass{
	int myField; //myField�� this.myfield�� �̹� ���ִ� ��
	
	//ù ��° ������
	MyClass() {
		//this.myField=0; // this() ����ؼ� �ٸ� ������ ȣ��
		this(0);
	}
	//�� ��° ������
	MyClass(int value) { //MyClass�� �ν��Ͻ� ����
		this.myField = value;
		
	}
	void printValue() {
		System.out.println("myField�� �� : " + this.myField);
	}
}

public class ThisMain {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(); //ù ��° ������ ȣ��
		MyClass obj2 = new MyClass(10); //�� ��° ������ ȣ��
		
		obj1.printValue();
		obj2.printValue();
	}

}

