package com.kh.fileIO;

import java.io.File;

public class File_delete_Main {

	public static void main(String[] args) {
		String mainPath = "C:\\Users\\user1\\Desktop\\";
		String originFile = mainPath + "cute.jpg";
		
		//���� ��ü ����
		File fileToDelete = new File(originFile);
		
		//���� ���� (�������� ��ġ�� �ʰ� ��������)
		boolean deleted = fileToDelete.delete();
			if (deleted) {
				System.out.println("������ ���������� �����Ǿ����ϴ�.");
			} else {
				System.out.println("������ �����ϴµ� �����߽��ϴ�.");
			}
	}
}
