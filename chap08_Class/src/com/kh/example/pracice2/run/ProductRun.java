package com.kh.example.pracice2.run;
//import�� ���� 1ȸ�� �� ���� �ۼ�
import com.kh.example.pracice2.model.vo.Product;

public class ProductRun {

	public static void main(String[] args) {
		// product ���� 3���ϰ�
		// ���� ��ǰ��,����,�귣��� ����ϱ�
		
//		String name;
//		int price;
//		String brand;
		
		// 1. ���δ�Ʈ�� ��ü ����
		Product product1 = new Product("����",7900,"CJ");
		product1.information();
		Product product2 = new Product("����",3000,"BJ");
		product2.information();
		Product product3 = new Product("����",9000,"DJ");
		product3.information();
		
		// 2. ���δ�Ʈ�� �������̼� ���
		System.out.println("Product ���� : ");
		
		
		
	}

}
