package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

		public static void main(String[] args) {
			 
		    /* 초기화 블럭을 이용해 각 필드 초기화
			 실행용 메소드로 기본 생성자를 통해 Student 
			 객체 생성 후 information()으로 정보 출력
			*/
			
			//기본 생성자를 통해 Student 객체 생성
			Student student = new Student();
			
			//정보 출력
			student.information();
			
//			Student student1 = new Student(3,3,"kh학생",160.5,'여');
//			student1.information();
//				
//			Student student2 = new Student(2,7,"kh학생",185.6,'남');
//			student2.information();
//			
			}

		}
