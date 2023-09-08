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
		
		controller.run(); //클라이언트 

	}
		
}
