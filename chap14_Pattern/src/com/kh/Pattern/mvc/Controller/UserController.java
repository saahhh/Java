package com.kh.Pattern.mvc.Controller;

import com.kh.Pattern.mvc.Model.UserModel;
import com.kh.Pattern.mvc.View.UserView;

public class UserController { //�� ������ �ҷ����� ������ ����, �������� �� ���޹޴� ��(mvc���ٽ�)

		/*
		 �𵨰� �並 �����ϴ� ��
		 ����� �Է��� ó���ϴ� ��
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


