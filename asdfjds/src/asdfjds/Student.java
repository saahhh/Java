package asdfjds;

public class Student {
	//이름 
	String name;
	//나이
	int age;
	//반
	int index;
	//번호
	int number;
	//학교
	int schoolName;
	//취미
	
	//음식
	String food;
	//위는 멤버변수(내가알고싶은변수)
	
	//학생들에대한 정보를 교장인 내가 모으려고함
					//매개변수 = 매시간마다 필요한 변수의 갯수
	public Student(String name,int age,int index,int number,String food/*얻고싶은정보*/ /*= 매개변수*/) {
		this.name = name; //생성자
		this.age = age;
		this.index = index;
		this.number = number;
		this.food = food;
	}
	
	//학교 1학년 대표 부장
					//부장님이 얻고싶은 매개변수
	public Student(String name,int age,int index,int number) {
		
	}
	//1학년1반선생 (담임이여서 학년 반 나이는 필요없음)
	public Student(String name,int number,String food) {
		
	}

	
	//우리학생들에 대해 정보를 얻었으니 직접 보자
	public void /*교장선생님이 필요한 정보를보자()*/ PInfo() { //메서드
		System.out.println("이름,나이,반,번호,음식");
		
	}
	public void /*부장선생님이 필요한 정보를보자*/ BInfo() {
		System.out.println("이름,반,번호");
	}
	public void /*1학년1반선생님이 필요한 정보를보자()*/ TInfo() {
		System.out.println("이름,번호,음식");
	}
}