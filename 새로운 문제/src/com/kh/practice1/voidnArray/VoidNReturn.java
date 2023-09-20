package com.kh.practice1.voidnArray;

	import java.util.Scanner;
	/*
	 * System.out.println();
	 * void 활용
	 * return 활용
	 * static
	 * */

	public class VoidNReturn {
		public static void main (String[] args) {
			VoidNReturn vr = new VoidNReturn();
//			vr.practice1();
//			vr.practice2();
//			vr.practice3();
//			vr.practice4();
//			vr.practice5();
			vr.practice6();
		}
		public void practice1() {
			//두 수의 합 계산
			 Scanner scanner = new Scanner(System.in);
			 	System.out.println("첫번째 숫자를 입력하세요");
		        int num1 = scanner.nextInt();
		        System.out.println("두번째 숫자를 입력하세요"); 
		        int num2 = scanner.nextInt();
		      
		        int sum = num1 + num2;
		        System.out.println("num1 + num2 = " + sum);
		    }
		
		public void practice2() { //n! : 팩토리얼 - n보다 작거나 같은 모든 양의 정수의 곱
			Scanner scanner = new Scanner(System.in);
	        System.out.println("팩토리얼 구할 숫자는?");
	        int n = scanner.nextInt();

	        int factorial = 1;
	        for (int i = 1; i <= n; i++) {
	            factorial *= i;
	        } 
	        System.out.println(n + "! = " + factorial);   
		}
		
		public void practice3() {
			 Scanner scanner = new Scanner(System.in);
		       System.out.println("문자를 입력하세요.");
		     String input = scanner.nextLine();

		     String reversed = new StringBuilder(input).reverse().toString();
		       System.out.println(reversed);
		}
		
		public void practice4() {
			Scanner scanner = new Scanner(System.in);
	       System.out.println("숫자를 입력하세요.");
	        int size = scanner.nextInt();
	        
	        int[] numbers = new int[size];
	        int sum = 0;

	       
	        for (int i = 0; i < size; i++) {
	            numbers[i] = size;
	            sum += numbers[i];
	        }   
	        System.out.println("sum : " + sum);
		}
	public void practice5() {
		Scanner scanner = new Scanner(System.in);
	       System.out.println("숫자를 입력하세요.");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];

       
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
	        
	        
	}
	
	/*1. 소수(Prime Number)란 무엇인가?
			2, 3, 5, 7, 11, 13, 17....
			약수가 1과 자기 자신 뿐인 수이다. 
	  2. 소수를 어떻게 구할까? (알고리즘)
		 약수가 1과 자신뿐인 것을 확인해야한다.
		 즉, 자기 자신보다 작은 수들을 나누어봐서, 하나라도 나누어지면 소수가 아닌 것이다.
		 (어떤 수의 배수이면 안된다는 것)
	*/
	public void practice6() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int num = scanner.nextInt();
        
        boolean isPrime = true;
        		//isPrimeNumber(num);
        
        if (isPrime) {
        
        } else {
          
        }
    }
    
    public boolean isPrimeNumber(int num) {
        if (num <= 1) {
            
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
               
            }
        }
       //자바에 내장되어있는 Math.sqrt함수를 통해서 2부터 루트n까지의 범위에서 소수를 체크판별해주는 함수다.
        //범위가 2부터 루트n까지인 이유는 소수는 1과 자기 자신으로만 나누어지는 숫자이기때문이다.
        
	}
    
    public void practice7() {
    	/*계산기 만들기 (연산 결과 반환):

    	메서드 이름: calculate

    	매개변수: 두 개의 실수(double 타입) num1과 num2, 그리고 연산자(String 타입) operator
    	기능: num1과 num2를 operator에 따라 더하기, 빼기, 곱하기, 나누기 연산을 수행하고 결과를 반환함.
    
    */

    }
    public void practice8() {
    	/*
    	단어 개수 세기:

    	메서드 이름: countWords

    	매개변수: 문자열(String 타입) text
    	기능: 입력된 문자열에서 공백을 기준으로 단어의 개수를 세고 결과를 출력함(void 리턴 타입).
    	
    */

    }
    public void practice9() {
    	/*
    	삼각형 별 출력:

    	메서드 이름: printTriangle

    	매개변수: 양의 정수(int 타입) height
    	기능: 높이가 height인 삼각형 모양의 별을 출력함(void 리턴 타입).
    	
    */

    }
    public void practice10() {
    	/*
    	로또 번호 생성기:
    	Random
    	메서드 이름: generateLottoNumbers

    	매개변수: 로또 번호의 개수(int 타입) count
    	기능: 중복되지 않는 무작위 로또 번호를 count만큼 생성하여 출력함(void 리턴 타입).
    */

    }
}
