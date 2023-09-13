package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
  Date : ��¥�� �ð� ������ ��Ÿ���µ� ���
  		 java1.1 ���ķδ� ������� ����
  		 	java.time ��Ű������ LocalDate LocalTime LocalDateTime�� ���
  		 					Local�� ���� ������
 */
	public static void main(String[] args) {
		// import java.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥ : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("���� �ð� : " + currentTime);
		
		LocalDateTime currentLDt = LocalDateTime.now();
		System.out.println("���� ��¥�� �ð� : " + currentLDt);
		
		//��¥ ���
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7); //���Ҷ�plus ����minus
		System.out.println("7�� �� ��¥ : " + futureDate);
		
		//minus plus �̿��ؼ� �� 2���� ������
		LocalDate today1 = LocalDate.now();
		LocalDate futureDate1 = today.plusWeeks(2);
		System.out.println("2�� �� ��¥ : " + futureDate1);
		
		LocalDate today2 = LocalDate.now();
		LocalDate pastDate2 = today.minusMonths(5);
		System.out.println("5�� �� ��¥ : " + pastDate2);
				
		LocalDate today3 = LocalDate.now();
		LocalDate pastDate3 = today.minusYears(10);
		System.out.println("10�� �� ��¥ : " + pastDate3);
		
		LocalDate today4 = LocalDate.now();
		LocalDate futureDate4 = today.plusYears(5);
		System.out.println("5�� �� ��¥ : " + futureDate4);
		
		
		LocalTime nowTime = LocalTime.now();
		LocalTime laterTime = nowTime.plusHours(3);
		System.out.println("3�ð� �� �ð� : " + laterTime);
		 
		
		//Ư�� ��¥�� �ð� �����ϱ�
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2023, 9, 18);
		//date1.isBefore(date2)
		//date1.isAfter(date2)
		//��¥ ��
		if (date1.isBefore(date2)) {
			System.out.println(date1 + " �� " + date2 + "�����Դϴ�.");
		} else if (date1.isAfter(date2)) {
			System.out.println(date1 + " �� " + date2 + "�����Դϴ�.");
		} else {
			System.out.println(date1 + " �� " + date2 + "�� ���� ��¥ �Դϴ�.");
		}
	}

}
