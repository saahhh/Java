package com.kh.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyMain {

	public static void main(String[] args) {
//		String mainPath = "C:\\Users\\user1\\Desktop\\cute.png";
		String inputFile = "C:\\Users\\user1\\Desktop\\cute.png";
		String outputFile = "C:\\Users\\user1\\Desktop\\Realcute.jpg";
		
		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)) {
			byte[] buffer = new byte[1024]; //1024 ����Ʈ ũ���� ����
			int byteRead; //
			//int byteRead : fis.read(buffer)�޼��带 ȣ���Ͽ� ���۷� �о���� ����Ʈ ���� �����ϴ� ���� ����
			
			
			//������ �а� �����ϴ� ���� ����
			//fis.read(buffer)���Ͽ��� �����͸� �о���̰�
			//fos.write(buffer,0,byteRead); �о���� �����͸� �����
			//������ ���� �����ϸ� -1�� ��ȯ�ϸ鼭 while�� ����!
			while((byteRead = fis.read(buffer)) != -1) { //while�� : �а� �����ϴ� ������ ��� 
														//inputStream���� ���� ������ ������ -1�� ��ȯ�ϱ����
				fos.write(buffer,0,byteRead);
			}
				System.out.println("������ ����Ǿ����ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
