package com.kh.classBM;

import com.kh.classAM.AM;

public class BM extends AM {
	//public static void main(String[] args) {
	//자바 프로그램의 시작점
	
		//A생성자를 classBM에서 만들고 싶어!
		public void main() {
			
		publicMethod();
		protectedMethod(); //에러, 패키지 안에 무언가를 해야지만 사용 가능 =//public class BM extends AM 설정후
		//main 메서드에서 직접 호출을 하거나 뭔가를 통해 호출을 해야됨			//생성자를 public void am() { 로 바꿔주면 쓸 수 있음
		//접근 제한자를 가지고 있어서 같은 패키지 내에서 호출을 extends를 사용해서 호출을 한다.
		
		//defalutMethod(); //같은 패키지 안에서 사용이 가능함, 다른 패키지 이므로 사용이 안됨
	}
}
