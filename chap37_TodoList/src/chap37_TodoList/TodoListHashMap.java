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
				System.out.println("��ȿ���� ����");
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
		
		TodoList.put("��Ա�",1);
		TodoList.put("ī�䰡��",2);
		TodoList.put("��ϱ�",3);
		
		System.out.println(TodoList.containsValue(1));
		System.out.println(TodoList.containsKey("��Ա�"));
		
		for(Entry<String,Integer> entry : TodoList.entrySet()) {
			String list = entry.getKey();
			int num = entry.getValue();
			System.out.println(num + " : "+ list);
		}
		
		String listUpdate = "��ϱ�";
		int newnum = 4;
		TodoList.put(listUpdate, newnum);
		System.out.println(listUpdate + "�� ������ " + newnum + "�� �����߽��ϴ�.");
	
		String removeTodoList = "ī�䰡��";
		TodoList.remove(removeTodoList);
		System.out.println(removeTodoList + "�� ������ �����߽��ϴ�.");
		
		System.out.println("���� TodoList : ");
			for(Entry<String,Integer> entry : TodoList.entrySet()) {
				String list = entry.getKey();
				int num = entry.getValue();
				System.out.println(num + " : " + list);
			}
	
		}
	}*/
