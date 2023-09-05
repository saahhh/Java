package com.kh.example.practice1.model.vo;

	public class Member {

		/* com.kh.example.practice1.
		model.vo.Member
		1.멤버변수
		- memberId : String
		- memberPwd : String
		- memberName : String
		- age : int
		- gender : char
		- phone : String
		- email : String
		2.생성자
		+ Member()
		3.메서드
		+ changeName(name:String):void
		+ printName():void
		*/
	
		String memberId;
		String memberPwd;
		String memberName;
		
		int age;
		char gender;
		String phone; //int 와 string의 차이점
		String email;
		
		//public Member(int age, char gender, String phone, String email, int age, char gender, String phone, String email) {
			
			public Member () {
//			this.memberId = memberId;
//			this.memberPwd = memberPwd;
//			this.memberName = memberName;
//			this.age = age;
//			this.gender = gender;
//			this.phone = phone;
//			this.email = email;
			this.memberName = memberName;
		}
		
		public void changeName(String memberName) {
			this.memberName = memberName;
		}
		
		public void printName() {
			System.out.println("이름 : " + memberName);
		}
		
	}
	

