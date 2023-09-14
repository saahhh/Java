package com.kh.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Main_2 {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("abcde.txt"); //생성 하나 해놓은 것 뿐, 어떤 기능도 하지 않음
			writer.write("파일 덮어 써지는지 테스트"); //파일 쓰기
			writer.close(); //파일 안의 내용을 다 쓰면 닫기
			
			FileReader reader = new FileReader("abcde.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) !=null) {
				System.out.println(line);
			}
			bufferedReader.close(); //파일을 다 읽으면 닫아주기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
