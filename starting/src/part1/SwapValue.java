// 方法
package part1;

public class SwapValue {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		System.out.println("交换前num1:"+num1+"num2:"+num2);
		swap(num1,num2); // 调用
		System.out.println("交换后num1:"+num1+"num2"+num2);
	}
	
	public static void swap(int n1,int n2) {  // 交换变量
		System.out.println("进入swap");
		System.out.println("交换前n1:"+n1+"n2:"+n2);
		
		int temp = n1;
		n1 = n2;
		n2 = temp;  // 改变形参，实参不变
		
		System.out.println("交换后n1:"+n1+"n2:"+n2);
		
		
	}


}
