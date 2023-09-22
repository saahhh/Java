package chap37_TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class TodoListHashMap {

	private Map<Integer,String> tasks;
	private int nextId = 1;
	
	public TodoListHashMap() {
		tasks = new HashMap<>();
		nextId = 1;
	}
	
	public void addTask(String task) {
		tasks.put(nextId, task);
		nextId++;

	}
	public void removetask(int Id) {
		if(tasks.containsKey(Id)) {
			tasks.remove(Id);
		} else {
				System.out.println("유효하지 않음");
		}
	}
	
	public void displayTasks() {
		System.out.println("My TodoList");
		for(Map.Entry<Integer, String> entry : tasks.entrySet()) {
		
			
		}
	}
	public static void main(String[] args) {
	
	}
}

	
		
		

			
			
		/*Map<String, Integer> TodoList = new HashMap<>();
		
		TodoList.put("밥먹기",1);
		TodoList.put("카페가기",2);
		TodoList.put("운동하기",3);
		
		System.out.println(TodoList.containsValue(1));
		System.out.println(TodoList.containsKey("밥먹기"));
		
		for(Entry<String,Integer> entry : TodoList.entrySet()) {
			String list = entry.getKey();
			int num = entry.getValue();
			System.out.println(num + " : "+ list);
		}
		
		String listUpdate = "운동하기";
		int newnum = 4;
		TodoList.put(listUpdate, newnum);
		System.out.println(listUpdate + "의 할일을 " + newnum + "로 수정했습니다.");
	
		String removeTodoList = "카페가기";
		TodoList.remove(removeTodoList);
		System.out.println(removeTodoList + "의 할일을 삭제했습니다.");
		
		System.out.println("최종 TodoList : ");
			for(Entry<String,Integer> entry : TodoList.entrySet()) {
				String list = entry.getKey();
				int num = entry.getValue();
				System.out.println(num + " : " + list);
			}
	
		}
	}*/
