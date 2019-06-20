package part1;  // 包声明

public class Dog {
	int dogAge;  // 成员变量
public Dog(String name) { // 构造器（构造方法，可显式声明也可不声明,默认创建，类似于python的__init__方法）
	System.out.println("name is:"+name);
}
public void setAge(int age) {  // void没有返回值的方法 ，int参数
	dogAge = age;
}
public int getAge() {  // int返回值为整型的方法
	System.out.println("age is :"+ dogAge);
	return dogAge;
}

public static void main(String[] args) {  // 入口main方法
	Dog myDog = new Dog("sam");  // 创建对象
	
	myDog.setAge(3);  // 调用方法
	
	myDog.getAge();
	
	System.out.println("变量值:"+ myDog.dogAge);  // 访问成员变量
	
	
}

}
