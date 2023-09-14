package com.kh.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Main_2 {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("abcde.txt"); //���� �ϳ� �س��� �� ��, � ��ɵ� ���� ����
			writer.write("���� ���� �������� �׽�Ʈ"); //���� ����
			writer.close(); //���� ���� ������ �� ���� �ݱ�
			
			FileReader reader = new FileReader("abcde.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) !=null) {
				System.out.println(line);
			}
			bufferedReader.close(); //������ �� ������ �ݾ��ֱ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
