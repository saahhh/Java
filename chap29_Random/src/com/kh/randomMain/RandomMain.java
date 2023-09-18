package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/*
 Random : ������ �����ϱ� ���� ���Ǵ� Ŭ����
    ���� : �������� ������� ��
*/
public class RandomMain {

	public static void main(String[] args) {
		//�ζ� ��ȣ ������
		RandomMain rm = new RandomMain();
		rm.Lotto();
		
	}
	public void Lotto() {
		//���� ��ü ����
		Random rd = new Random(); 
		
		//ArrayList �� ����ؼ� ��ٱ��Ϸ� ���
		List<Integer> lottoNum = new ArrayList<>();
		
		//�ߺ��� ���ϱ� ���� set�� ����� �� ����
		//�������� ���ڸ� �� ��
		int six = 6; //�ζ� ��ȣ � ���� ������ ���� �Ǵ� int six=6; �����ʰ� six�ڸ��� 6�� �ᵵ ����
		while(lottoNum.size() < six) { //�ε����� 0,1,2,3,4,5 
			// 1~45 ������ �����ؼ� ���� ����
			int ranNumber = rd.nextInt(45)+1; //0~44�ڸ��� �������� ��ȣ 
			
			//�����ϴ���, �ߺ����� ����
			//�ߺ��� ���� list�� ����� �� ����
			if(!lottoNum.contains(ranNumber)) { // !�� ������� ���� �����Ҷ��� list�� ����Ǵ� ���̱� ������ ���ѷ���
				lottoNum.add(ranNumber);
			}
		}
		System.out.println("�ζ� ��ȣ : " + lottoNum);
	}
	public void RandomExam() {
		Random rd = new Random(); //���� ��ü ����
		
		//1.���� ���� ������ ������ ������ �����߰ڴ�.
		int ranInt = rd.nextInt(100); //0~99���̿��� 1���� ��
		System.out.println(ranInt);
		
		//2.�Ǽ� ���� ������ ������ ������ �����߰ڴ�.
		double ranD = rd.nextDouble(); //�Ǽ��� 0.0 ~ 1.0
		System.out.println(ranD);	
		
		//3.boolean �Ҹ��� �� �������� ����
		boolean ranB = rd.nextBoolean();
		System.out.println(ranB);
	}
	
}
