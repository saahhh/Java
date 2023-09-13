package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
			
		PracticeMain2 p = new PracticeMain2();
		p.practice1();
		p.practice2();
		p.practice3();
		p.practice4();
		p.practice5();
		p.practice6();
		
	}	
	public void practice1() {
		
		StringBuffer sb = new StringBuffer();
		//문자열 덧붙이기 출력 append ,append는 문자 뒤에 덧붙이는것, 삽입이 아님
//		StringBuffer sb = new StringBuffer(); //여기서 sb에 모든 글자를 저장했다고 선언해둔것, 
		sb.append("오늘 ");//저녁은 뭐먹지
		sb.append("저녁은 뭐먹지");
		System.out.println(sb.toString());
	}
	
	public void practice2() {
		
		StringBuffer sb = new StringBuffer();
		
		//문자열 뒤집기 오늘 저녁은 뭐먹지 reverse
		String str = "오늘 저녁은 뭐먹지";
		sb.append(str);
		sb.reverse();
		System.out.println(sb.toString());
	}
	
	public void practice3() {
		//문자열 삽입 insert ? ㅎㅎ
		StringBuffer sb = new StringBuffer();
		String str = "오늘 저녁은 뭐먹지";
		sb.append(str);
		sb.insert(10, "? ㅎㅎ");
		System.out.println(sb.toString());
	}
	
	public void practice4() {
		//문자열 대체 replace(,,);
		StringBuffer sb = new StringBuffer();
		String str = "오늘 저녁은 뭐먹지";
		sb.append(str);
		sb.replace(0,2,"내일");
		System.out.println(sb.toString());
	}
	
	public void practice5() {
		//문자열 삭제 delete(,,);
		StringBuffer sb = new StringBuffer();
		String str = "오늘 저녁은 뭐먹지";
		sb.append(str);
		sb.delete(0,2);
		System.out.println(sb.toString());
	}

	
	
	public void practice6() { // 2~5까지 이 방법도 가능
		//문자열 삽입 insert ? ㅎㅎ
		String str = "오늘 저녁은 뭐먹지";
		StringBuffer sb = new StringBuffer(str); //new StringBuffer() 의 괄호에 str 넣어도 가능
		sb.insert(10, "? ㅎㅎ");
		System.out.println(sb.toString());
	}
}
	
