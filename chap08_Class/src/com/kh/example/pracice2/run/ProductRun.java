package com.kh.example.pracice2.run;
//import는 최초 1회만 맨 위에 작성
import com.kh.example.pracice2.model.vo.Product;

public class ProductRun {

	public static void main(String[] args) {
		// product 생성 3개하고
		// 각각 상품명,가격,브랜드명 출력하기
		
//		String name;
//		int price;
//		String brand;
		
		// 1. 프로덕트의 객체 생성
		Product product1 = new Product("비비고",7900,"CJ");
		product1.information();
		Product product2 = new Product("배배고",3000,"BJ");
		product2.information();
		Product product3 = new Product("브브고",9000,"DJ");
		product3.information();
		
		// 2. 프로덕트의 인포메이션 출력
		System.out.println("Product 정보 : ");
		
		
		
	}

}
