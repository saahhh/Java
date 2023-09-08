package com.kh.Pattern.mvc.Client;

import com.kh.Pattern.mvc.Controller.StudentController;
import com.kh.Pattern.mvc.Model.StudentModel;
import com.kh.Pattern.mvc.View.StudentView;

public class StudentClient {

	public static void main(String[] args) {
		//�� ��ü ���� Model
		StudentModel model = new StudentModel("���л�",17);
		//�� ��ü ���� View
		StudentView view = new StudentView();		
		//��Ʈ�ѷ� ��ü ����Controller(�� �� ����)
		StudentController controller = new StudentController(model, view);
		//�л� ������ ������Ʈ�ؼ� ���
		controller.updateView();
		//�л� ���� ������Ʈ�� ����!
		controller.stestudentName("������Ʈ");
		controller.setStudentAge(18);
		//������Ʈ �� �л� ������ ���
		controller.updateView();
	}
	
}
