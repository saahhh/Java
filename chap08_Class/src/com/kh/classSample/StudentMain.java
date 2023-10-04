package com.kh.classSample;
import com.kh.classSample.Student;

public class StudentMain {

	public static void main(String[] args) {
		//학생의 객체 생성
		Student student1 = new Student("kh학생",20,"1학년");				
		//학생 정보 출력
		student1.displayInfo();
		
		/*
		 학생을 3명 만들어서 3명 출력하기
		 student2, student3, student4
		 각각의 이름과 나이와 학년을 displayInfo();를 사용해서 출력하세요.
		*/
	
		Student student2 = new Student("kh학생",20,"2학년");
		student2.displayInfo();
		
		Student student3 = new Student("kh학생",23,"3학년");
		student3.displayInfo();
		
		Student student4 = new Student("kh학생",25,"1학년");
		student4.displayInfo();
		
		
	}

}
