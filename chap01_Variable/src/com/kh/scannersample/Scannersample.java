//import java.util.Scanner;

package com.kh.scannersample;
import java.util.Scanner;

public class Scannersample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해 주세요 : ");
		int age = sc.nextInt(); //정수만 받는 next
		System.out.println("내 나이는 " + age + " 입니다.");
		
		
		String name;
		int phoneNumber;
		
		System.out.print("당신의 이름을 입력하세요 : ");
		name = sc.next();
		System.out.print("당신의 전화번호를 입력하세요 : ");
		phoneNumber = sc.nextInt(); // -(하이픈)넣지않기 //0을 시작하는 번호를 표기하고 싶으면 String phoneNumber로 표기		
		System.out.println("당신의 이름은 " + name + " 입니다.");
		System.out.println("당신의 전화번호는 " + phoneNumber + " 입니다.");
		
		//내 취미와 내가 좋아하는 음식과 내 주소 1개 출력하기
		
		String hobby;
		String food;
		String adress;
		
		System.out.print("당신의 취미를 입력하세요 : ");
		hobby = sc.next(); //sc.next(); ->공백을 받지 않음 붙여쓰는것만 가능
		System.out.print("당신이 좋아하는 음식을 입력하세요 : ");
		food = sc.next();
		System.out.print("당신의 주소를 입력하세요 : ");
		adress = sc.next();
		System.out.println("당신의 취미는 " + hobby + "입니다.");
		System.out.println("당신이 좋아하는 음식은 " + food + "입니다.");
		System.out.println("당신의 주소는 " + adress + "입니다.");
		
		
	}
}
