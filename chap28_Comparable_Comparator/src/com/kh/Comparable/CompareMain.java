package com.kh.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareMain {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("학생1",78));
		people.add(new Person("학생2",79));
		people.add(new Person("학생3",71));
		
		//나이를 기준으로 정렬
		Collections.sort(people); //출력이 나이순으로 정렬됨
		for(Person person : people) {
			System.out.println(person);
		}

	}

}
