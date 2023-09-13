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
		//년월일 yyyy-MM-dd
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
		
	}
	public void practice2() {
		//시분초 HH:mm:ss
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}
	public void practice3() {
		//월일 MM-dd
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}
	public void practice4() {
		//연도-시간 yyyy-HH
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}
	public void practice5() {
		//날짜-요일 yyyy-MM-dd(E)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
		
	}
	
}
