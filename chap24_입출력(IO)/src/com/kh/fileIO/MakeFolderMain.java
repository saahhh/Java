package com.kh.fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFolderMain {

	
	public static void main(String[] args) {
		
	/*	MakeFolderMain MFmain = new MakeFolderMain();
		MFmain.practice1(); */
		
		// ������ ������ ��� ����
		String folderPath = "C:\\Users\\user1\\Desktop\\image";//���ϴ� ��� ����
		// ���� �����
		File folder = new File(folderPath);
		// exists �̹� �����ϴ��� Ȯ���ϴ� ��
		if (!folder.exists()) {
		folder.mkdir();
		// mkdir
		//=make directory(������ �з��ϴ� �̸� ����(ī�װ�,����)) //�ڹٿ����� ���̴°� �ƴ϶� ������,������������ ���̴� ��ǻ�� ��ɾ�
		System.out.println("������ ���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\image\\UserInfo.txt");
			w.write("User ������ ��� ���Դϴ�.");
			w.write("KH �л�");
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	/*
	 * public void practice1() { //��μ����ؼ� ���� �����
	 
		String folderPath2 = ("C:\\Users\\user1\\Desktop\\NewFolder2");
		File folder2 = new File(folderPath2);
		if(!folder2.exists()) {
			folder2.mkdir();
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ �̹� �����մϴ�.");
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
		//������ ����� ���� �ȿ� ������ �����
		//���� �ȿ� ���� �ۼ��ϱ�
		// window : \
		// Linux or MacOs : /
		// File.separator 
	}
}

*/