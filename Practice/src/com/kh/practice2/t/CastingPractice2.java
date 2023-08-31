package com.kh.practice2.t;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		/*
			실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
			이 때 총점과 평균은 정수형으로 처리하세요. 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 : ");
		double kor = sc.nextDouble();
		
		System.out.println("영어점수 : ");
		double eng = sc.nextDouble();
		
		System.out.println("수학점수 : ");
		double math = sc.nextDouble();
		
		// 총점과 평균은 정수형
		int averageScore = (int) (kor + eng + math);
		int totalScore = (averageScore / 3);
		
		System.out.println("국어점수="+kor+" 영어점수="+eng+" 수학점수="+math+" 총점="+averageScore+"평균점수="+totalScore);

	}

}