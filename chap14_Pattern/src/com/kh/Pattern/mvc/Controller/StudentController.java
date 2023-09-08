package com.kh.Pattern.mvc.Controller;

import com.kh.Pattern.mvc.Model.StudentModel;
import com.kh.Pattern.mvc.View.StudentView;

/*
 �𵨰� �並 �����ϴ� ��
 ����� �Է��� ó���ϴ� ��
 */
public class StudentController {
	//StudentModel
	//StudentView
	
	private StudentModel studentmodel;
	private StudentView studentview;
	
	public StudentController(StudentModel studentmodel,StudentView studentview) {
		this.studentmodel = studentmodel;
		this.studentview = studentview;
	}
	public void stestudentName(String name) {
		studentmodel.setName(name);
	}
	public void setStudentAge(int Age) {
		studentmodel.setAge(Age);
		
	}
	public String getStudentName() {
		return studentmodel.getName();		
	}
	public int getStudentAge() {
		return studentmodel.getAge();
		
	}
	public void updateView() {
		//DB�� ����� �� �߰�
		studentview.displayInfor(studentmodel.getName(), studentmodel.getAge());
	}
}
	
