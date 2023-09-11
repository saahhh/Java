package com.kh.todoList;

public class TodoListMain {

	public static void main(String[] args) {
						//public TodoListModel(String text)
		TodoListModel tdmodel = new TodoListModel("¾ÆÄ§¸Ô±â");
		TodoListView tdView = new TodoListView();
		
		System.out.println(tdmodel);
		tdView.displayTodoList(tdmodel.getItem());
	}
	

}
