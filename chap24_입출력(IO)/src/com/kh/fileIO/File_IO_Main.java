package com.kh.fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Main {

	public static void main(String[] args) {
		//���࿡ ��¥�� ���� ��¥�� ������ ���� ��
		//������ �����
		//mk�� �̿��ؼ�
		
		String filepath = "���� �ۼ���/�����IO.txt"; //���� ��ġ
//		FileWriter fWriter = new FileWriter(filePath, true);
		//true : ���� ���� �̾��
		//false : ���� �����
//		File f = new File("��μ���","newFile.txt");
//		File f = new File("C:\\Users\\user1\\Desktop","newFile.txt");
		File f = new File("new.txt");
		try {
			if (f.createNewFile()) {
				System.out.println("������ �����߽��ϴ�.");
				System.out.println("������ ��� ��������ϴ�.");
			} else { System.out.println("������ �̹� �����մϴ�.");
			
			}
//			FileWriter fw = new FileWriter(f);
		} catch (IOException e) { //�������� ������ �߻����� ��
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�����ϴ� �����Դϴ�.");
		}
		String fileName = f.getName();
//		FileReader fReader = new FileReader(f,true);

	}

}
