package com.kh.finalSample;

import java.io.FileWriter;

public class FileIOMain {
	public static void main(String[] args) {
		try {
			FileWriter fw = null;
										   //2��° ������ ���� boolean true�� �����Ǹ� �ش� ���Ͽ� �̾�Ⱑ �ȴ�.
			fw = new FileWriter("file.txt",true); //true�� ���� ���� �̾�Ⱑ �����ϴٴ� ���̴�. //��� ������ �Ǵ°��� ����Ʈ ���� true�̱� ���������� Ʈ����ĳġ��������
			fw.write(1000);
			fw.write(10000);
//			fw.close();
//			System.out.println("���ϻ���");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}