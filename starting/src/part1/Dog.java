package part1;  // ������

public class Dog {
	int dogAge;  // ��Ա����
public Dog(String name) { // �����������췽��������ʽ����Ҳ�ɲ�����,Ĭ�ϴ�����������python��__init__������
	System.out.println("name is:"+name);
}
public void setAge(int age) {  // voidû�з���ֵ�ķ��� ��int����
	dogAge = age;
}
public int getAge() {  // int����ֵΪ���͵ķ���
	System.out.println("age is :"+ dogAge);
	return dogAge;
}

public static void main(String[] args) {  // ���main����
	Dog myDog = new Dog("sam");  // ��������
	
	myDog.setAge(3);  // ���÷���
	
	myDog.getAge();
	
	System.out.println("����ֵ:"+ myDog.dogAge);  // ���ʳ�Ա����
	
	
}

}