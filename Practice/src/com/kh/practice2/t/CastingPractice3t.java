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
			 
			System.out.println( iNum1 / iNum2 ); // 2 �������� �������� ���ϴ� ����
			System.out.println( (int)dNum ); // 2 int�� �ٿ� ������ ����� ����
			 
			System.out.println( (double)iNum2 * dNum ); // 10.0 int�� double�� �ٲ㼭 �Ǽ��� ������ ����
			System.out.println( (double)iNum1 ); // 10.0 
			 
			System.out.println( (double)iNum1 / iNum2 ); // 2.5
			System.out.println( (float)dNum ); // 2.5 //�׳� dNum���� ����ص� ������ (float)�� �ٿ��൵ �ȴ�. (GarbageCollector����) 
			 
			System.out.println( (int)fNum ); // 3
			System.out.println( iNum1 / (int)fNum ); // 3 ������ �Ǽ��� ������ 3�� ������ ���
			System.out.println( iNum1 / fNum );// 3.3333333 ������ �Ǽ��� ������ 3.33333�� float �� �̿��� �Ǽ��� ���
			System.out.println( (double)iNum1 / fNum ); // 3.3333333333333335 ������ �Ǽ��� ������ 3.33333335�� double�� �̿��� �Ǽ��� ���
			 
			System.out.println( ch ); // 'A' char ��� ����
			System.out.println( (int)ch ); // 65 unicode�� ���
			System.out.println( (int)ch + iNum1 ); // 75 int�� ch�� ���� �� ���ϱ�
			System.out.println( ((char)(int)ch + iNum1) ); // 'K' 75�� ���� int�� ch�� ����
			 
			}
		}
	}
}
