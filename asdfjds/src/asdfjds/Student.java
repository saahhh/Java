package asdfjds;

public class Student {
	//�̸� 
	String name;
	//����
	int age;
	//��
	int index;
	//��ȣ
	int number;
	//�б�
	int schoolName;
	//���
	
	//����
	String food;
	//���� �������(�����˰��������)
	
	//�л��鿡���� ������ ������ ���� ����������
					//�Ű����� = �Žð����� �ʿ��� ������ ����
	public Student(String name,int age,int index,int number,String food/*����������*/ /*= �Ű�����*/) {
		this.name = name; //������
		this.age = age;
		this.index = index;
		this.number = number;
		this.food = food;
	}
	
	//�б� 1�г� ��ǥ ����
					//������� ������ �Ű�����
	public Student(String name,int age,int index,int number) {
		
	}
	//1�г�1�ݼ��� (�����̿��� �г� �� ���̴� �ʿ����)
	public Student(String name,int number,String food) {
		
	}

	
	//�츮�л��鿡 ���� ������ ������� ���� ����
	public void /*���弱������ �ʿ��� ����������()*/ PInfo() { //�޼���
		System.out.println("�̸�,����,��,��ȣ,����");
		
	}
	public void /*���弱������ �ʿ��� ����������*/ BInfo() {
		System.out.println("�̸�,��,��ȣ");
	}
	public void /*1�г�1�ݼ������� �ʿ��� ����������()*/ TInfo() {
		System.out.println("�̸�,��ȣ,����");
	}
}