package com.kh.fileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutStreamMain {
/*
 FileOutputStream
 	���� �����͸� ���Ͽ� ���� ���� ���
 	����� �۾��� ó���ϱ� ���� Ŭ����
 */
	public static void main(String[] args) {
		//���Ͽ� �� ��θ� ����
		String filePath = "ex.txt";
		try {
			//������ ������ ������� FileOutputStream ����
			FileOutputStream fos = new FileOutputStream(filePath);
			
			//���Ͽ� ���� ������
			String data = "�ȳ��ϼ���!!!!";
			
			//���ڿ��� ����Ʈ �迭�� ��ȯ�ϰ� ���Ͽ� ����
			byte[] bArray = data.getBytes(); //getBytes() �޼��带 ����ؼ� ����Ʈ�� ��ȯ
			try {
				
				fos.write(bArray);

				//FileOutputStream �ݾ� ����
				fos.close();
				System.out.println("�����Ͱ� ���Ͽ� ���������ϴ�.");	
			} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
}
