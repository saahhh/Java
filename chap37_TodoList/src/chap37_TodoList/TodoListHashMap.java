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
		System.out.println(entry.getKey() + " - " + entry.getValue());
			
		}
	}
	public static void main(String[] args) {
		TodoList todoList = new TodoList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���� �߰� : add, ���� : remove, ���Ϻ��� : list, ���� : exit �� �Է��ϼ���.");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("�� ���� �Է��ϼ���.");
				String task = sc.nextLine();
				todoList.addTask(task);
			} else if(choice.equalsIgnoreCase("remove")) {
				System.out.println("������ �� ��ȣ �Է��ϱ�");
				try {
					int index = Integer.parseInt(sc.nextLine()) -1;
					todoList.removeRemove(index);
				} catch (Exception e) {
					System.out.println("��ȿ���� ���� �Է��Դϴ�.");
				}
			} else if (choice.equalsIgnoreCase("list")) {
				todoList.displayTasks();
			} else if (choice.equals("exit") | choice.equals("EXIT")) {
				break;
			} else {
					System.out.println("�߸��� ����Դϴ�.");
			}
		}System.out.println("���ø����̼� ����");
		sc.close();
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
