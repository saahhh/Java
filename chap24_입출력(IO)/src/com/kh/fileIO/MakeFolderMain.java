package com.kh.fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFolderMain {

	
	public static void main(String[] args) {
		
	/*	MakeFolderMain MFmain = new MakeFolderMain();
		MFmain.practice1(); */
		
		// 폴더를 생성할 경로 지정
		String folderPath = "C:\\Users\\user1\\Desktop\\image";//원하는 경로 설정
		// 폴더 만들기
		File folder = new File(folderPath);
		// exists 이미 존재하는지 확인하는 것
		if (!folder.exists()) {
		folder.mkdir();
		// mkdir
		//=make directory(파일을 분류하는 이름 공간(카테고리,폴더)) //자바에서만 쓰이는게 아니라 윈도우,리눅스에서도 쓰이는 컴퓨터 명령어
		System.out.println("폴더가 성공적으로 생성되었습니다.");
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\image\\UserInfo.txt");
			w.write("User 정보를 담는 곳입니다.");
			w.write("KH 학생");
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	/*
	 * public void practice1() { //경로설정해서 파일 만들기
	 
		String folderPath2 = ("C:\\Users\\user1\\Desktop\\NewFolder2");
		File folder2 = new File(folderPath2);
		if(!folder2.exists()) {
			folder2.mkdir();
			System.out.println("폴더가 성공적으로 생성되었습니다.");
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\NewFolder2\\Info.txt");
			w.write("asdf");
			w.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void practice2() {
		//폴더를 만들고 폴더 안에 파일을 만들기
		//파일 안에 내용 작성하기
		// window : \
		// Linux or MacOs : /
		// File.separator 
	}
}

*/