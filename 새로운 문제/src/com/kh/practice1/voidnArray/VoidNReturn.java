package com.kh.practice1.voidnArray;

	import java.util.Scanner;
	/*
	 * System.out.println();
	 * void Ȱ��
	 * return Ȱ��
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
			//�� ���� �� ���
			 Scanner scanner = new Scanner(System.in);
			 	System.out.println("ù��° ���ڸ� �Է��ϼ���");
		        int num1 = scanner.nextInt();
		        System.out.println("�ι�° ���ڸ� �Է��ϼ���"); 
		        int num2 = scanner.nextInt();
		      
		        int sum = num1 + num2;
		        System.out.println("num1 + num2 = " + sum);
		    }
		
		public void practice2() { //n! : ���丮�� - n���� �۰ų� ���� ��� ���� ������ ��
			Scanner scanner = new Scanner(System.in);
	        System.out.println("���丮�� ���� ���ڴ�?");
	        int n = scanner.nextInt();

	        int factorial = 1;
	        for (int i = 1; i <= n; i++) {
	            factorial *= i;
	        } 
	        System.out.println(n + "! = " + factorial);   
		}
		
		public void practice3() {
			 Scanner scanner = new Scanner(System.in);
		       System.out.println("���ڸ� �Է��ϼ���.");
		     String input = scanner.nextLine();

		     String reversed = new StringBuilder(input).reverse().toString();
		       System.out.println(reversed);
		}
		
		public void practice4() {
			Scanner scanner = new Scanner(System.in);
	       System.out.println("���ڸ� �Է��ϼ���.");
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
	       System.out.println("���ڸ� �Է��ϼ���.");
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
	
	/*1. �Ҽ�(Prime Number)�� �����ΰ�?
			2, 3, 5, 7, 11, 13, 17....
			����� 1�� �ڱ� �ڽ� ���� ���̴�. 
	  2. �Ҽ��� ��� ���ұ�? (�˰���)
		 ����� 1�� �ڽŻ��� ���� Ȯ���ؾ��Ѵ�.
		 ��, �ڱ� �ڽź��� ���� ������ ���������, �ϳ��� ���������� �Ҽ��� �ƴ� ���̴�.
		 (� ���� ����̸� �ȵȴٴ� ��)
	*/
	public void practice6() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("���ڸ� �Է��ϼ���.");
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
       //�ڹٿ� ����Ǿ��ִ� Math.sqrt�Լ��� ���ؼ� 2���� ��Ʈn������ �������� �Ҽ��� üũ�Ǻ����ִ� �Լ���.
        //������ 2���� ��Ʈn������ ������ �Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� �����̱⶧���̴�.
        
	}
    
    public void practice7() {
    	/*���� ����� (���� ��� ��ȯ):

    	�޼��� �̸�: calculate

    	�Ű�����: �� ���� �Ǽ�(double Ÿ��) num1�� num2, �׸��� ������(String Ÿ��) operator
    	���: num1�� num2�� operator�� ���� ���ϱ�, ����, ���ϱ�, ������ ������ �����ϰ� ����� ��ȯ��.
    
    */

    }
    public void practice8() {
    	/*
    	�ܾ� ���� ����:

    	�޼��� �̸�: countWords

    	�Ű�����: ���ڿ�(String Ÿ��) text
    	���: �Էµ� ���ڿ����� ������ �������� �ܾ��� ������ ���� ����� �����(void ���� Ÿ��).
    	
    */

    }
    public void practice9() {
    	/*
    	�ﰢ�� �� ���:

    	�޼��� �̸�: printTriangle

    	�Ű�����: ���� ����(int Ÿ��) height
    	���: ���̰� height�� �ﰢ�� ����� ���� �����(void ���� Ÿ��).
    	
    */

    }
    public void practice10() {
    	/*
    	�ζ� ��ȣ ������:
    	Random
    	�޼��� �̸�: generateLottoNumbers

    	�Ű�����: �ζ� ��ȣ�� ����(int Ÿ��) count
    	���: �ߺ����� �ʴ� ������ �ζ� ��ȣ�� count��ŭ �����Ͽ� �����(void ���� Ÿ��).
    */

    }
}
