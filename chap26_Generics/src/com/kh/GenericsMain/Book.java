package com.kh.GenericsMain;

//���ʸ� Ŭ���� ����
// T Type �� ���� t��� �ְ���� �ڸ����� �־ ��
public class Book<T> { //int,double�� ���� Ÿ���� ���� �ʾƵ� �Ǵ� ���� ���ʸ��̴�.
	T content;
	
	public void put(T item) {
		this.content = item;
	}
	
	public T get() {
		return content;
	}
}