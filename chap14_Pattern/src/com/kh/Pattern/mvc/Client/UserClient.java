package com.kh.Pattern.mvc.Client;

import com.kh.Pattern.mvc.Controller.UserController;
import com.kh.Pattern.mvc.Model.UserModel;
import com.kh.Pattern.mvc.View.UserView;

public class UserClient {

	public static void main(String[] args) {// MVC를 이용한 클라이언트 main메서드 실행하여 출력하는 곳
		/*MVC패턴을 사용해서 학생정보를 다루는 곳*
		 */
		
		//모델 객체 생성
		UserModel user = new UserModel("홍길동",20);
		
		//뷰 객체 생성
		UserView view = new UserView();
		
		//컨트롤러 객체 생성 및                                모델 뷰 설정
		UserController controller = new UserController(user, view);
	
		//학생 정보를 업데이트해서 출력
//		controller.updateView();

		//학생 정보 업데이트
//		controller.setUsermodel("이순신")
	}
	
}
