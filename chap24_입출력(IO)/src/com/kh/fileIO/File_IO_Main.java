package com.kh.fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Main {

	public static void main(String[] args) {
		//만약에 날짜가 오늘 날짜인 폴더가 없을 때
		//폴더를 만들고
		//mk를 이용해서
		
		String filepath = "설명 작성란/입출력IO.txt"; //파일 위치
//		FileWriter fWriter = new FileWriter(filePath, true);
		//true : 파일 끝에 이어쓰기
		//false : 파일 덮어쓰기
//		File f = new File("경로설정","newFile.txt");
//		File f = new File("C:\\Users\\user1\\Desktop","newFile.txt");
		File f = new File("new.txt");
		try {
			if (f.createNewFile()) {
				System.out.println("파일을 생성했습니다.");
				System.out.println("파일이 없어서 만들었습니다.");
			} else { System.out.println("파일이 이미 존재합니다.");
			
			}
//			FileWriter fw = new FileWriter(f);
		} catch (IOException e) { //예외적인 오류가 발생헀던 것
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("존재하는 파일입니다.");
		}
		String fileName = f.getName();
//		FileReader fReader = new FileReader(f,true);

	}

}
