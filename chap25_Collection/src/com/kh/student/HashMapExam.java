package com.kh.student;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		// HashMap 생성
		//containsKey,Value
		Map<String, Integer> studentGrades = new HashMap<>();
		
		//학생과 점수를 추가하겠습니다.
		studentGrades.put("KH", 95);
		studentGrades.put("Park", 80);
		studentGrades.put("David", 77);
		studentGrades.put("Bob", 92);
		
		//contains
		System.out.println(studentGrades.containsValue(92));
		System.out.println(studentGrades.containsKey("Bob"));
		//특정 학생의 성적 검색
		//Map 아래에 있는 containsKey : 앱에서 key(키) value(값)이 있는지 확인
		String studentName = "Bob";
		//만약에 학생들 중에서 Bob이 있다면 성적을 보여줘
		if(studentGrades.containsKey(studentName)) { //true false
			int grade = studentGrades.get(studentName);
			System.out.println(studentName + "의 성적 : " + grade);
		} else {
			System.out.println(studentName + "의 성적을 찾을 수 없습니다.");
		}
		
		/*
		Map.Entry 인터페이스와 함께 사용되는 인터페이스
		getKey() : 객체의 키를 반환
		getValue() : 객체의 값을 반환
		*/
		
		//모든 학생과 성적 출력
		for(Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
			
		//학생 성적 수정
		String StudentUpdate = "Bob";
		int newGrade = 98;
		studentGrades.put(StudentUpdate, newGrade);
		System.out.println(StudentUpdate + "의 성적을 " + newGrade + "로 수정했습니다.");

		
		//학생 제거
		String removeStudent = "David";
		studentGrades.remove(removeStudent);
		
		System.out.println(removeStudent + "의 성적을 삭제했습니다.");
			
		//최종 학생 성적 출력
		System.out.println("최종 학생 성적 : ");
			for(Map.Entry<String,Integer> entry : studentGrades.entrySet()) {
				String name = entry.getKey();
				int grade = entry.getValue();
				System.out.println(name + " : " + grade);
				}
	}

}
