package com.kh.api.exam1;

public class ObjdectMain {

	public static void main(String[] args) {
		// Object Ŭ������ ����
		
		// ��ü ����
		Object obj = new Object();
		Object obj2 = new Object();
		
		//equals() �޼ҵ带 ����ؼ� �� ��ü ��
		boolean isEqual = obj.equals(obj2);
		System.out.println("obj�� obj2�� ������? : " + isEqual);
		
		//hashCode() �޼ҵ带 ����Ͽ� ��ü�� �ؽ� �ڵ� ���
		int hashCode1 = obj.hashCode();
		int hashCode2 = obj2.hashCode();
		System.out.println("obj�� �ؽ��ڵ� : " + hashCode1);
		System.out.println("obj2�� �ؽ��ڵ� : " + hashCode2);
		
		//toString() �޼ҵ带 ����Ͽ� ��ü�� ���ڿ��� ǥ��
		String objString = obj.toString();
		String obj2String = obj2.toString();
		System.out.println("obj�� ���ڿ� ǥ�� : " + objString);
		System.out.println("obj2�� ���ڿ� ǥ�� : " + obj2String);
		
		//getClass() �޼ҵ带 ����Ͽ� ��ü�� Ŭ���� ���� ���
		Class<?> classofObj1 = obj.getClass();
		Class<?> classofObj2 = obj.getClass();
		System.out.println("obj Ŭ���� : " + classofObj1.getName());
		System.out.println("obj2 Ŭ���� : " + classofObj2.getName());

	}

}
