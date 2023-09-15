package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserMapExam {

	public static void main(String[] args) {
		// HashMap 생성 UserAge
		Map<String, Integer> UserAge = new HashMap<>();
		
		// 유저의 이름과 나이
		UserAge.put("양파쿵야", 15);
		UserAge.put("루피", 17);
		UserAge.put("주먹밥쿵야", 7);
		
		// 특정 유저 검색
		String UserName = "양파쿵야";
		
		// 모든 학생과 성적 출력
		if(UserAge.containsKey(UserName)) {
			int age = UserAge.get(UserName);
			System.out.println(UserName + "의 나이 : " + age);
		} else {
			System.out.println(UserName + "의 나이를 찾을 수 없습니다.");
		}
		
		// 유저의 나이 수정
		String UserUpdate = "주먹밥쿵야";
		int newAge = 20;
		UserAge.put(UserUpdate, newAge);
		System.out.println(UserUpdate + "의 나이를 " + newAge + "로 수정했습니다.");
		
		// 유저 탈퇴(제거)
		String removeUser = "루피";
		UserAge.remove(UserAge);
		
		// 최종 유저 이름 나이 출력
		System.out.println("최종 유저 이름 나이 : ");
			for(Map.Entry<String,Integer> entry : UserAge.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
			}
	}
}
