package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PracticeResize {

	public static void main(String[] args) {
		// �̹��� �ϳ� �ҷ�����
		// ����ȭ�鿡 ���ο� ���� ����� mkdir (���߿� �ٽ� �߰��ϱ�)
		// ���� ���������� �̹����� ����ȭ�鿡 ���� ���� �����ȿ� �����ϱ�
		
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path + "socute.png";
		String outputImg = path + "resizesocute.jpg";
		
		int width = 1024;
		int height = 1024;
		
		try {
			BufferedImage bufImg = ImageIO.read(new File(inputImg));
			
			Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			
			BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			bufResizeImg.getGraphics().drawImage(resizeImg,0,0,null);
			
			ImageIO.write(bufResizeImg,"jpg",new File(outputImg));
			
			System.out.println("�̹��� �������� �Ϸ�");	
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("�̹��� �������� �� �����߻�" + e.getMessage());
		}

	}

}
