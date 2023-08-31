package com.kh.practice2.t;

public class CastingPractice3t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class CastingPractice3 {
			public void method() {
			int iNum1 = 10;
			int iNum2 = 4;
			 
			float fNum = 3.0f;
			 
			double dNum = 2.5;
			 
			char ch = 'A';
			 
			System.out.println( iNum1 / iNum2 ); // 2 나누기의 나머지를 구하는 문제
			System.out.println( (int)dNum ); // 2 int를 붙여 정수로 만드는 문제
			 
			System.out.println( (double)iNum2 * dNum ); // 10.0 int를 double로 바꿔서 실수로 나오는 문제
			System.out.println( (double)iNum1 ); // 10.0 
			 
			System.out.println( (double)iNum1 / iNum2 ); // 2.5
			System.out.println( (float)dNum ); // 2.5 //그냥 dNum으로 출력해도 되지만 (float)을 붙여줘도 된다. (GarbageCollector관련) 
			 
			System.out.println( (int)fNum ); // 3
			System.out.println( iNum1 / (int)fNum ); // 3 정수와 실수를 나눠서 3인 정수로 출력
			System.out.println( iNum1 / fNum );// 3.3333333 정수와 실수를 나눠서 3.33333인 float 을 이용한 실수로 출력
			System.out.println( (double)iNum1 / fNum ); // 3.3333333333333335 정수와 실수를 나눠서 3.33333335인 double을 이용한 실수로 출력
			 
			System.out.println( ch ); // 'A' char 출력 문제
			System.out.println( (int)ch ); // 65 unicode로 출력
			System.out.println( (int)ch + iNum1 ); // 75 int로 ch를 변경 후 더하기
			System.out.println( ((char)(int)ch + iNum1) ); // 'K' 75로 나온 int를 ch로 변경
			 
			}
		}
	}
}
