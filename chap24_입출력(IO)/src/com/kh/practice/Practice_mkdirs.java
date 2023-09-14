package com.kh.practice;

import java.io.File;

public class Practice_mkdirs {

	public static void main(String[] args) {
		Practice_mkdirs pm = new Practice_mkdirs();
		//pm.practice1();
		//pm.practice2();
		pm.practice3();

	}
	public void practice1() {
		//폴더 연속으로 2개 만들기 C:\Users\ user1\Desktop\이름1\이름2
		//폴더 연속으로 3개 만들기 C:\Users\ user1\Java_Workspace\chap25_
		//폴더 연속으로 5개 만들기C:\Users\ user1\Documents\myPlace\Music\Korean\kPop\Group
	
		String dirPath = "C:\\Users\\user1\\Desktop\\java\\hardjava";
		
		File dir = new File(dirPath);
		
		boolean success = dir.mkdirs();
			if(success) {
				System.out.println("폴더 생성 성공");
			} else {
				System.out.println("폴더 생성 실패");
		}
	}
	public void practice2() {
		String dirPath2 = "C:\\Users\\user1\\Java_Workspace\\chap25_";
		File dir2 = new File(dirPath2);
		boolean success2 = dir2.mkdirs();
			if(success2) {
				System.out.println("폴더 생성 성공");
			} else {
				System.out.println("폴더 생성 실패");
				
			}
		}
		public void practice3() {
			String dirPath3 = "C:\\Users\\user1\\Documents\\myplace\\Music\\kPop\\NewJeans";
			File dir3 = new File(dirPath3);
			boolean success2 = dir3.mkdirs();
				if(success2) {
					System.out.println("폴더 생성 성공");
				} else {
					System.out.println("폴더 생성 실패");
					
				}
			}
		}
	

