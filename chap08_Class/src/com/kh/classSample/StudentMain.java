package com.kh.classSample;
import com.kh.classSample.Student;

public class StudentMain {

	public static void main(String[] args) {
		//�л��� ��ü ����
		Student student1 = new Student("kh�л�",20,"1�г�");				
		//�л� ���� ���
		student1.displayInfo();
		
		/*
		 �л��� 3�� ���� 3�� ����ϱ�
		 student2, student3, student4
		 ������ �̸��� ���̿� �г��� displayInfo();�� ����ؼ� ����ϼ���.
		*/
	
		Student student2 = new Student("kh�л�",20,"2�г�");
		student2.displayInfo();
		
		Student student3 = new Student("kh�л�",23,"3�г�");
		student3.displayInfo();
		
		Student student4 = new Student("kh�л�",25,"1�г�");
		student4.displayInfo();
		
		
	}

}
