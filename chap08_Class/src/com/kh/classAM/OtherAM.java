package com.kh.classAM;
//import com.kh.classAM; //자동으로 입력이 된 것, 안됐을 경우 직접 입력해줌
public class OtherAM {
	
	public static void main(String[] args) {
		
		//AM 생성
		AM am = new AM();
		am.publicMethod();
		am.protectedMethod();
		am.defalutMethod();
		//am.privateMethod(); //다른 클래스에 존재하기 때문에 출력이 안됨
	}
	

	
}
