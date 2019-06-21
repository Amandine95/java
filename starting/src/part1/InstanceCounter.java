// static修饰类方法，类变量
package part1;

public class InstanceCounter {
	private static int numInstances = 0;  // 类变量=静态变量
	protected static int getCount() {  // 静态方法只能使用静态变量
		return numInstances;
	}
	
	private static void addInstance() {
		numInstances++;
	}
	
	InstanceCounter(){  // 默认修饰符 构造方法
		InstanceCounter.addInstance();  // 类名.方法名 调用静态方法
	}
	
	public static void main(String[] args) {
		System.out.println("starting with"+InstanceCounter.getCount()+"instances");
		for (int i = 0;i<500;i++) {
			new InstanceCounter(); // 创建对象即调用构造方法
		}
		System.out.println("created"+InstanceCounter.getCount()+"instances");
	}

	
}
