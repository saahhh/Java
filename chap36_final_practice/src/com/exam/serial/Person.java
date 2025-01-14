package com.exam.serial;

import java.io.Serializable;

/*
 Serializable
 	인터페이스
 	클래스의 객체는 직렬화 또는 역직렬화를 지원한다
 	직렬화 : 객체를 바이트 스트림으로 변환하는 프로세스
 	역직렬화 : 바이트 스트림에서 객체로 변환하는 프로세스
 	객체를 파일에 저장하거나 네트워크를 통해 전송하는 등의 작업을 수행할 수 있다
 	객체의 상태를 보존하고 복원할 때 유용하게 쓰임
 	
 * */
public class Person implements Serializable {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + age;
	}
}
