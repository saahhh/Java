package com.kh.Practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		//Map<String,Integer>
		//	�̸�,����
		//contains
		Map<String,Integer> userSalary = new HashMap<>();
		
		userSalary.put("ȫ�浿", 200);
		userSalary.put("��ö��", 300);
		userSalary.put("�質��", 500);
		
		String userName = "�質��";
		
		if(userSalary.containsKey(userName)) {
			int salary = userSalary.get(userName);
			System.out.println(userName + "�� �޿� : " + salary);
		} else {
			System.out.println(userName + "�� �޿��� ã�� �� �����ϴ�.");
		}

	}

}
