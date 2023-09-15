package com.kh.GenericsMain;

//제너릭 클래스 정의
// T Type 의 약자 t대신 넣고싶은 자리명을 넣어도 됨
public class Book<T> {
	T content;
	
	public void put(T item) {
		this.content = item;
	}
	
	public T get() {
		return content;
	}
}