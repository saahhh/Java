package com.kh.finalSample;

import java.io.FileWriter;

public class FileIOMain {
	public static void main(String[] args) {
		try {
			FileWriter fw = null;
										   //2번째 인자의 값이 boolean true가 지정되면 해당 파일에 이어쓰기가 된다.
			fw = new FileWriter("file.txt",true); //true를 쓰는 것은 이어쓰기가 가능하다는 뜻이다. //없어도 실행이 되는것은 디폴트 값이 true이기 때문이지만 트라이캐치구문에선
			fw.write(1000);
			fw.write(10000);
//			fw.close();
//			System.out.println("파일생성");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}