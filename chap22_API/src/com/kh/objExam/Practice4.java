package com.kh.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {
	
	Date currentDate = new Date();
	
	public static void main(String[] args) {
		Practice4 p = new Practice4();
		p.practice1();
		p.practice2();
		p.practice3();
		p.practice4();
		p.practice5();

	}
	
	public void practice1() {
		//����� yyyy-MM-dd
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
		
	}
	public void practice2() {
		//�ú��� HH:mm:ss
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}
	public void practice3() {
		//���� MM-dd
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}
	public void practice4() {
		//����-�ð� yyyy-HH
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}
	public void practice5() {
		//��¥-���� yyyy-MM-dd(E)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
		
	}
	
}
