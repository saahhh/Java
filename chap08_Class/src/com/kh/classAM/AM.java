package com.kh.classAM;

public class AM {
	public 	  int pNum = 10;
	protected int pNum2 = 20;
	int pNum3 = 30; //접근 제한자를 명시하지 않으면 자동으로 default가 에러가 난다 (=defalut 제한이 적용된다)
	private int pNum4 = 40; //접근제한자 'private'는 다른 클래스에서 쓰이지 못하게 보호하는 것
	
	//호출 메소드 작성해서 각각 호출하기
	
	public void publicMethod() {
		System.out.println("어떤 클래스에서든 접근이 가능 / public Method() 호출됨");
		
	}
	protected void protectedMethod() {
		System.out.println("같은 패키지 내에서는 접근 가능 / protected Method() 호출됨");
		
	}
	void defalutMethod() { //default는 앞에 접근제한자를 작성해주지 않으면 기본으로 적용이 됨 = 디폴트를 적지 않아도된다.
		System.out.println("같은 패키지 내에서만 접근 가능 / default Method() 호출됨");
		
	}
	private void privateMethod() {
		System.out.println("같은 클래스 내에서만 접근 가능 / private Method() 호출됨");
		
	}
}
