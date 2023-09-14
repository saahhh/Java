package com.kh.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		
		PracticeMain p = new PracticeMain();
		p.practice1();

}	public void practice1() { //경로설정해서 파일 만들기
		final String wpath = "C:\\Users\\user1\\Desktop\\NewFile.txt"; //파일 경로 관리하는 것
	
		try {
			// C:\Users\ user1\Desktop
			// C:/Users/user1/Desktop 둘 다 가능
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\NewFile.txt");
			w.write("파일 만들어지는지 테스트테스트"); //파일 쓰기
			w.close();						  //파일 닫기
												//어디서 보던지 경로가 확실한 경로 : 절대경로
			FileReader reader = new FileReader("C:\\Users\\user1\\Desktop\\NewFile.txt");
			//처음 설정한 파일경로(위에는 바탕화면 아래(파일 경로 없이 NewFile.txt만 써놔서)에는 이클립스 내의 경로)가 달라서 reader가 읽지 못하고 오류가 난 것.
			
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) !=null) {
				System.out.println(line);			
			}
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
