package com.kh.example.practice4.model.vo;

	public class Student {
		
		/* 
		 1.������� 
		- grade : int
		- classroom : int
		- name : String
		- height : double
		- gender : char
		 2.������
		+ Student()
		 3.��� �޼ҵ�
		+ information() : void 
	
		����������
		������ ������ �����ϰ� �� ���ΰ�!
		- private
		int String => 
		
	
		*/

		int grade;
		int classroom;
		String name;
		double height;
		char gender;
		
		//2. 2.������  + Student()
		public Student () {
			//�ʱ�ȭ ���� �̿��� �� �ʵ� �ʱ�ȭ, �ʱ�ȭ��{}
			this.grade = 1; //grade�� 1�� �ʱ�ȭ
			this.classroom = 2; //classroom�� 2�� �ʱ�ȭ
			this.name = "�����"; //name �̸� �ʱ�ȭ
			this.height = 180.5; //Ű �ʱ�ȭ
			this.gender = '��'; //���� '��'���� �ʱ�ȭ
		}
			
		//3.��¸޼ҵ� + information():void
		 public void information() {
			System.out.println("�г� : " + grade);
			System.out.println("�� : " + classroom);
			System.out.println("�̸� : " + name);
			System.out.println("Ű : " + height);
			System.out.println("���� : " + gender);
					
		}
		
	}



	/*//2. 2.������  + Student()
	public Student (int grade, int classroom, String name, double height, char gender) {
		this.grade = grade; //grade�� 1�� �ʱ�ȭ
		this.classroom = classroom; //classroom�� 2�� �ʱ�ȭ
		this.name = name; //name �̸� �ʱ�ȭ
		this.height = height; //Ű �ʱ�ȭ
		this.gender = gender; //���� '��'���� �ʱ�ȭ 
		
	
	���� �� �� �� ó�� ����, ���� �� ���� this.grade = 1;ó�� ����(��쿡����)
		*/
