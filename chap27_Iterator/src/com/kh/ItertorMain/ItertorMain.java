package com.kh.ItertorMain;

import java.util.ArrayList;
import java.util.Iterator;

public class ItertorMain {
/*
 Iterator
 	컬렉션(데이터 그룹)을 반복(iterate)하면서 요소에 접근하는데 사용되는 인터페이스
 	다양한 컬렉션 유형(ArrayList, HashSet 등)에 사용할 수 있음
 	컬렉션의 요소를 읽고 삭제하는데 사용
 	컬렉션의 크기나 내부구조에 관계없이 요소에 접근 할수 있다.
 */
	public static void main(String[] args) {
		
		//ArrayList 생성 및 요소 추가
		ArrayList<String> music = new ArrayList<>();
		music.add("발라드");
		music.add("댄스");
		music.add("트로트");
		
		//Iterator 생성
		Iterator<String> iter = music.iterator();
		
		//Iterator를 사용하여 요소 반복
		while(iter.hasNext()) {
			String msc = iter.next(); //msc는 재정의니까 music의 이름을 바꿔서 씀 //msc는 지역변수
			System.out.println(msc);
		}
		
		//Iterator를 사용하여 요소 삭제
		iter = music.iterator(); //다시 Iterator 초기화
		while(iter.hasNext()) {
			String msc = iter.next(); //지역변수여서 다시 쓸수있음
			//만약에 트로트가 들어오면 삭제하길 원함
			if(msc.equals("트로트")) {
				iter.remove(); //현재 요소 삭제
			} System.out.println(msc);
		}
		//삭제 후 ArrayLsit 출력
		System.out.println("삭제 후 출력 : ");
		for (String a : music) {
			System.out.println(a);
		}

	}

}

/*
향상된 for문

for 반복 작업을 할 때 사용되는 제어 구조
특정 조건이 참인 동안 또는 리스트, 배열 등의 컬렉션 요소를 하나씩 처리할 때 사용

코드 구조
for(요소의데이터타입 변수명 : ArrayList변수명) {
	//처리 요소 코드
}
*/