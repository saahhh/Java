package com.kh.Practice;

import java.util.ArrayList;
import java.util.List;

public class CompareUserMain {

	public static void main(String[] args) {
		List<User> people = new ArrayList<>();
		people.add(new User("�����1",30));
		people.add(new User("�����2",20));
		people.add(new User("�����3",17));
		
		for(User user : people) {
			System.out.println(user);
		}

	}

}
