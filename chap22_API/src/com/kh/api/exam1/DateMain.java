package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
  Date : 날짜와 시간 정보를 나타내는데 사용
  		 java1.1 이후로는 권장되지 않음
  		 	java.time 패키지에서 LocalDate LocalTime LocalDateTime로 사용
  		 					Local이 붙은 이유는
 */
	public static void main(String[] args) {
		// import java.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜 : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시간 : " + currentTime);
		
		LocalDateTime currentLDt = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 : " + currentLDt);
		
		//날짜 계산
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7); //더할땐plus 뺄땐minus
		System.out.println("7일 후 날짜 : " + futureDate);
		
		//minus plus 이용해서 각 2개씩 만들어보기
		LocalDate today1 = LocalDate.now();
		LocalDate futureDate1 = today.plusWeeks(2);
		System.out.println("2주 후 날짜 : " + futureDate1);
		
		LocalDate today2 = LocalDate.now();
		LocalDate pastDate2 = today.minusMonths(5);
		System.out.println("5달 전 날짜 : " + pastDate2);
				
		LocalDate today3 = LocalDate.now();
		LocalDate pastDate3 = today.minusYears(10);
		System.out.println("10년 전 날짜 : " + pastDate3);
		
		LocalDate today4 = LocalDate.now();
		LocalDate futureDate4 = today.plusYears(5);
		System.out.println("5년 후 날짜 : " + futureDate4);
		
		
		LocalTime nowTime = LocalTime.now();
		LocalTime laterTime = nowTime.plusHours(3);
		System.out.println("3시간 후 시간 : " + laterTime);
		 
		
		//특정 날짜와 시간 생성하기
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2023, 9, 18);
		//date1.isBefore(date2)
		//date1.isAfter(date2)
		//날짜 비교
		if (date1.isBefore(date2)) {
			System.out.println(date1 + " 은 " + date2 + "이전입니다.");
		} else if (date1.isAfter(date2)) {
			System.out.println(date1 + " 은 " + date2 + "이후입니다.");
		} else {
			System.out.println(date1 + " 와 " + date2 + "은 같은 날짜 입니다.");
		}
	}

}
