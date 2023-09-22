package asdfjds;

public class User { //내가 필요한 정보 멤버변수
	String name;
	int age;
	int grade;
	int height;
	int weight;
	String food;
	
	//cInfo를 바라보는 생성자
	public User (String name, int age, int grade) {
		this.name = name; //생성자
		this.age = age;
		this.grade = grade;	
	} 
	//cInfo2를 바라보는 생성자
	public User (String name, int height, String food) {
		this.name = name;
		this.height = height;
		this.food = food;
	}
	//cInfo3를 바라보는 생성자
	public User(int age, int grade, String food) {
		this.age = age;
		this.grade = grade;
		this.food = food;
	}

}
