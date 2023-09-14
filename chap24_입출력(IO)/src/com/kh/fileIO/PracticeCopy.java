package com.kh.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeCopy {

	public static void main(String[] args) {
		PracticeCopy pc = new PracticeCopy();
		pc.practice1();
	}
		public void practice1() {
			String inputFile = "C:\\Users\\user1\\Desktop\\love.png";
			String outputFile = "C:\\Users\\user1\\Desktop\\Reallove.jpg";
		
		try (FileInputStream fis = new FileInputStream(inputFile);
			 FileOutputStream fos = new FileOutputStream(outputFile)) {
			byte[] buffer = new byte[1024];
			int byteRead;
		
			while((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteRead);
			}
				System.out.println("������ ����Ǿ����ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		/*
		// �̹������� jpg �Ǵ� png������ ����ȭ�鿡 ������ �� 
		// ����ȭ�鿡�ٰ� ������ ����
		// ���� �ȿ� ������ �̹��� �����ϱ�
		
		String inputFile = "C:\\Users\\user1\\Desktop\\cute.png";
		String newFolder = "C:\\Users\\user1\\Desktop\\image";
		newFolder.mkdir();
		String outputFile = newFolder + "\\" + "cute.png";
		*/
	}

}
