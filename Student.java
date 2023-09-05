package com.kh.example.practice4.model.vo;

	public class Student {
		
		/* 
		 1.멤버변수 
		- grade : int
		- classroom : int
		- name : String
		- height : double
		- gender : char
		 2.생성자
		+ Student()
		 3.출력 메소드
		+ information() : void 
	
		접근제한자
		접근을 어디까지 가능하게 할 것인가!
		- private
		int String => 
		
	
		*/

		int grade;
		int classroom;
		String name;
		double height;
		char gender;
		
		//2. 2.생성자  + Student()
		public Student () {
			//초기화 블럭을 이용해 각 필드 초기화, 초기화블럭{}
			this.grade = 1; //grade를 1로 초기화
			this.classroom = 2; //classroom을 2로 초기화
			this.name = "손흥민"; //name 이름 초기화
			this.height = 180.5; //키 초기화
			this.gender = '남'; //성별 '남'으로 초기화
		}
			
		//3.출력메소드 + information():void
		 public void information() {
			System.out.println("학년 : " + grade);
			System.out.println("반 : " + classroom);
			System.out.println("이름 : " + name);
			System.out.println("키 : " + height);
			System.out.println("성별 : " + gender);
					
		}
		
	}



	/*//2. 2.생성자  + Student()
	public Student (int grade, int classroom, String name, double height, char gender) {
		this.grade = grade; //grade를 1로 초기화
		this.classroom = classroom; //classroom을 2로 초기화
		this.name = name; //name 이름 초기화
		this.height = height; //키 초기화
		this.gender = gender; //성별 '남'으로 초기화 
		
	
	값을 모를 땐 위 처럼 쓰고, 값을 알 때는 this.grade = 1;처럼 쓰임(경우에따라)
		*/
