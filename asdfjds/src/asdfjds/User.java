package asdfjds;

public class User { //���� �ʿ��� ���� �������
	String name;
	int age;
	int grade;
	int height;
	int weight;
	String food;
	
	//cInfo�� �ٶ󺸴� ������
	public User (String name, int age, int grade) {
		this.name = name; //������
		this.age = age;
		this.grade = grade;	
	} 
	//cInfo2�� �ٶ󺸴� ������
	public User (String name, int height, String food) {
		this.name = name;
		this.height = height;
		this.food = food;
	}
	//cInfo3�� �ٶ󺸴� ������
	public User(int age, int grade, String food) {
		this.age = age;
		this.grade = grade;
		this.food = food;
	}

}
