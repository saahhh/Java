package com.kh.api.exam1;

public class ReplaceMain {

	public static void main(String[] args) {
		//replace1();
		ReplaceMain replacemain = new ReplaceMain(); //= ��ü, �� �Ͱ� replacemain.replace1();�� �ٸ� Ŭ�������� ������ �� �� �ִ�
		replacemain.replace1();
		replacemain.replace2();
		replacemain.replace3();
		replacemain.replace4();
		replacemain.replace5();
		replacemain.replaceAll6();
		
	
		String input = "Hello, world";
		String reInput = input.replace(" " , "-");
		System.out.println(reInput);
		String input2 = reInput.replace("-",""); //�ܾ ��ü
		System.out.println("input2 : " + input2);
	}
	
	public void replace1() {
		String input = "Hello, world";
		String reInput = input.replace(" " , "-");
		System.out.println(reInput);
		String input2 = reInput.replace("-",""); 
		System.out.println("input2 : " + input2);
	}
	
	public void replace2() {
		String input = "Hello World!";
		//World�� Java�� ��ü
		String reInput = input.replace("World","Java"); //(�ٲ���ġ�Ǵܾ�,���γ����ܾ�)
		System.out.println("input : " + reInput);
	}
	public void replace3() {
		String originName = "Hello world";
		//o�� ���� �ִ� ���ڿ��� x�� �����ϱ�
		String reoriginName = originName.replace("o", "x");
		System.out.println(reoriginName);
	}
	
	public void replace4() {
		String originString = "The quick brown fox jups over the lazy dog";
		// fox�� cat���� �ٲٱ�
		String reoriginString = originString.replace("fox" , "cat"); //reoriginString�� reStr�ε� ����
		System.out.println(reoriginString);
	}
	
	public void replace5() {
		String originString = "The quick brown fox jups over the lazy dog";
		// ��� ���� �����ϱ�
		String reoriginString = originString.replace(" ", "");
		System.out.println(reoriginString);
		String reAllstr = originString.replace("\\s", "");
		System.out.println(reAllstr);
	}
	
	public void replaceAll6() {
		String originString = "Hello World";
		// replace ��� replaceAll�� �̿��ؼ� ��ҹ��� ���о��� ���ڿ� ġȯ�ϱ�
		String reAllstr = originString.replaceAll("(?i)World", "" );
		System.out.println(reAllstr);
	
	}
}
