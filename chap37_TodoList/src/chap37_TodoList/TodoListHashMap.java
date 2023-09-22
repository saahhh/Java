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
		System.out.println(entry.getKey() + " - " + entry.getValue());
			
		}
	}
	public static void main(String[] args) {
		TodoList todoList = new TodoList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("할일 추가 : add, 삭제 : remove, 할일보기 : list, 종료 : exit 를 입력하세요.");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("할 일을 입력하세요.");
				String task = sc.nextLine();
				todoList.addTask(task);
			} else if(choice.equalsIgnoreCase("remove")) {
				System.out.println("삭제할 일 번호 입력하기");
				try {
					int index = Integer.parseInt(sc.nextLine()) -1;
					todoList.removeRemove(index);
				} catch (Exception e) {
					System.out.println("유효하지 않은 입력입니다.");
				}
			} else if (choice.equalsIgnoreCase("list")) {
				todoList.displayTasks();
			} else if (choice.equals("exit") | choice.equals("EXIT")) {
				break;
			} else {
					System.out.println("잘못된 명령입니다.");
			}
		}System.out.println("어플리케이션 종료");
		sc.close();
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
