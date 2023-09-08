package com.kh.Pattern.mvc.Client;

import com.kh.Pattern.mvc.Controller.UserController;
import com.kh.Pattern.mvc.Model.UserModel;
import com.kh.Pattern.mvc.View.UserView;

public class UserClient {

	public static void main(String[] args) {// MVC�� �̿��� Ŭ���̾�Ʈ main�޼��� �����Ͽ� ����ϴ� ��
		/*MVC������ ����ؼ� �л������� �ٷ�� ��*
		 */
		
		//�� ��ü ����
		UserModel user = new UserModel("ȫ�浿",20);
		
		//�� ��ü ����
		UserView view = new UserView();
		
		//��Ʈ�ѷ� ��ü ���� ��                                �� �� ����
		UserController controller = new UserController(user, view);
	
		//�л� ������ ������Ʈ�ؼ� ���
//		controller.updateView();

		//�л� ���� ������Ʈ
//		controller.setUsermodel("�̼���")
	}
	
}
