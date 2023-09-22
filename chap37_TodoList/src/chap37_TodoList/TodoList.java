package chap37_TodoList;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
	private ArrayList<String> tasks;
	
	public TodoList() {
		tasks = new ArrayList<>();
	}
	public void addTask(String task) { 
		tasks.add(task); //�������������ְڴ�
	}
	public void removeRemove(int index) {
		if(index >= 0 && index < tasks.size()) {
			tasks.remove(index);
		} else {
			System.out.println("�߸��� �ε����Դϴ�.");
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
			System.out.println("���� �߰� : add, ���� : remove, ���Ϻ��� : list, ���� : exit �� �Է��ϼ���");
			
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("add")) {/*���� �빮�� �ҹ������� ������� �ʰ� ���ڴ�*/ 
				System.out.println("�� ���� �Է��ϼ���.");
				String task = sc.nextLine();
				todoList.addTask(task);
			} else if (choice.equals("remove") || choice.equalsIgnoreCase("remove")) {/* �Ǵ� choice.equals("REMOVE)*/
				System.out.println("������ ���� ��ȣ�� �Է��ϼ���.");
				try {
					int index = Integer.parseInt(sc.nextLine()) -1;
					todoList.removeRemove(index);
				} catch (Exception e) {
					System.out.println("��ȿ�������� �Է��Դϴ�.");
				}
									
			} else if (choice.equals("list") || choice.equalsIgnoreCase("list")) {
				todoList.displayTasks();
			} else if (choice.equals("exit") || choice.equalsIgnoreCase("exit")) {
				break;
			} else {
				System.out.println("�߸��� ����Դϴ�.");
			}
		}
		System.out.println("���ø����̼� ����");
		sc.close();
	}

}
