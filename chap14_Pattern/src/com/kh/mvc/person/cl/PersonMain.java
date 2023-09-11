package com.kh.mvc.person.cl;

import com.kh.mvc.person.co.PersonController;
import com.kh.mvc.person.mo.PersonModel;
import com.kh.mvc.person.vo.PersonView;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonModel model = new PersonModel();
		
		PersonView view = new PersonView();
		
		PersonController controller = new PersonController(model, view);
		
		controller.run(); //클라이언트가 메인, 컨트롤러 메소드 실행, 이는 컨트롤러에 담겨 있는 모델과 뷰를 실행하는 것.
							//컨트롤러 페이지로 넘어가서 순서대로 실행
	}
		
}
