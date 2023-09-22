package chap37_TodoList;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
	private ArrayList<String> tasks;
	
	public TodoList() {
		tasks = new ArrayList<>();
	}
	public void addTask(String task) { 
		tasks.add(task); //뭔가를저장해주겠다
	}
	public void removeRemove(int index) {
		if(index >= 0 && index < tasks.size()) {
			tasks.remove(index);
		} else {
			System.out.println("잘못된 인덱스입니다.");
		}
	}
	public void displayTasks() {
		System.out.println("my TodoList");
		for(int i=0; i<tasks.size(); i++) {
			System.out.println((i+1)+ "." + tasks.get(i));	
		}
		
	}
	
	public static void main(String[] args) {
		TodoList todoList = new TodoList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("할일 추가 : add, 삭제 : remove, 할일보기 : list, 종료 : exit 를 입력하세요");
			
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("add")) {/*문자 대문자 소문자인지 상관하지 않고 보겠다*/ 
				System.out.println("할 일을 입력하세요.");
				String task = sc.nextLine();
				todoList.addTask(task);
			} else if (choice.equals("remove") || choice.equalsIgnoreCase("remove")) {/* 또는 choice.equals("REMOVE)*/
				System.out.println("삭제할 일의 번호를 입력하세요.");
				try {
					int index = Integer.parseInt(sc.nextLine()) -1;
					todoList.removeRemove(index);
				} catch (Exception e) {
					System.out.println("유효하지않은 입력입니다.");
				}
									
			} else if (choice.equals("list") || choice.equalsIgnoreCase("list")) {
				todoList.displayTasks();
			} else if (choice.equals("exit") || choice.equalsIgnoreCase("exit")) {
				break;
			} else {
				System.out.println("잘못된 명령입니다.");
			}
		}
		System.out.println("어플리케이션 종료");
		sc.close();
	}

}
