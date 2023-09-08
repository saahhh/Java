package com.kh.Pattern.mvc.Controller;

import com.kh.Pattern.mvc.Model.UserModel;
import com.kh.Pattern.mvc.View.UserView;

public class UserController { //내 정보를 불러오고 수정도 가능, 수정헤준 것 전달받는 곳(mvc의핵심)

		/*
		 모델과 뷰를 연결하는 곳
		 사용자 입력을 처리하는 곳
		 */
	
		private UserModel usermodel;
		private UserModel userview;
		
		public UserModel getUsermodel() {
			return usermodel;
		}
		public UserModel getUserview() {
			return userview;
		}

		public void setUsermodel(UserModel usermodel) {
			this.usermodel = usermodel;
		}
		public void setUserview(UserModel userview) {
			this.userview = userview;
		}

		public UserController(UserModel model, UserView view) {
			this.usermodel = usermodel;
			this.userview = userview;
		
	}	
//		public void updateView() {
//			UserView.displayInfo()
		}


