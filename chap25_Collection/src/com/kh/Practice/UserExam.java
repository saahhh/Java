package com.kh.Practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		//Map<String,Integer>
		//	이름,나이
		//contains
		Map<String,Integer> userSalary = new HashMap<>();
		
		userSalary.put("홍길동", 200);
		userSalary.put("김철수", 300);
		userSalary.put("김나나", 500);
		
		String userName = "김나나";
		
		if(userSalary.containsKey(userName)) {
			int salary = userSalary.get(userName);
			System.out.println(userName + "의 급여 : " + salary);
		} else {
			System.out.println(userName + "의 급여를 찾을 수 없습니다.");
		}

	}

}
