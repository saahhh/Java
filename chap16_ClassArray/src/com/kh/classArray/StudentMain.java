package com.kh.classArray;

public class StudentMain {

	public static void main(String[] args) {
		// Student ��ü�� �����ϴ� �迭 ����
		Student[] student = new Student[3];
		
		// �迭�� Student ��ü�� �߰�
		// [0] �ε��� 0��° �л����� �ε���[2]�л����� �߰� �����ϱ�
		student[0] = new Student("ȫ�浿",17);
		student[1] = new Student("�踶��",18);
		student[2] = new Student("�����",19);
		
		//�� ���̸� ���ϰ� ������ length
		//ù ��° �л��� �̸� student[0].name
		//ù ��° �л��� ���� student[0].age
		
		System.out.println("�� �л� �� : " + student.length);
		System.out.println("ù ��° �л��� �̸� : " + student[0].name);
		System.out.println("ù ��° �л��� ���� : " + student[0].age);
		
		//�� ��° �л��� �̸��� ���� ���
		System.out.println("�� ��° �л��� �̸� : " + student[1].name);
		System.out.println("�� ��° �л��� ���� : " + student[1].age);
		//�� ��° �л��� �̸��� ���� ���
		System.out.println("�� ��° �л��� �̸� : " + student[2].name);
		System.out.println("�� ��° �л��� �̸� : " + student[2].age);
		//for���� �̿��ؼ� ù ��° ~ ���� ° �л����� ����ϱ�
//		for(�ε���ù�ڸ�����; �ε���<�л�����������;������) {
//			System.out.println(i�� Ȱ���ؼ� ����ϱ�);
		for(int i = 0; i < student.length; i++) { //for�� �ʱ���� int i�� �����ؾ��Ѵ�. 
			System.out.println(i+1+ "." + student[i].name);
			System.out.println(student[i].age);
		}
			

	}

}
