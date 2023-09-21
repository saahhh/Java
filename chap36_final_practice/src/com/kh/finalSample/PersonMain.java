package com.kh.finalSample;

public class PersonMain {

	public static void main(String[] args) {
		Person[] pArray = new Person[3]; //Person에대한객체를생성해줘야한다
		
		pArray[0] = new Person("kh");
		
		for(int i=0; i<= pArray.length; i++) {
			System.out.println(pArray[i].getName());
		}

	}

}
