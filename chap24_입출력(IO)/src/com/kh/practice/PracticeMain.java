package com.kh.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		
		PracticeMain p = new PracticeMain();
		p.practice1();

}	public void practice1() { //��μ����ؼ� ���� �����
		final String wpath = "C:\\Users\\user1\\Desktop\\NewFile.txt"; //���� ��� �����ϴ� ��
	
		try {
			// C:\Users\ user1\Desktop
			// C:/Users/user1/Desktop �� �� ����
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\NewFile.txt");
			w.write("���� ����������� �׽�Ʈ�׽�Ʈ"); //���� ����
			w.close();						  //���� �ݱ�
												//��� ������ ��ΰ� Ȯ���� ��� : ������
			FileReader reader = new FileReader("C:\\Users\\user1\\Desktop\\NewFile.txt");
			//ó�� ������ ���ϰ��(������ ����ȭ�� �Ʒ�(���� ��� ���� NewFile.txt�� �����)���� ��Ŭ���� ���� ���)�� �޶� reader�� ���� ���ϰ� ������ �� ��.
			
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
