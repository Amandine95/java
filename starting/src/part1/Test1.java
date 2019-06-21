// 循环语句
package part1;

public class Test1 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5}; // 整型数组
		for(int i : arr) {
//			System.out.println(i);  // 独占一行println
			System.out.print(i);
			System.out.print(",");
		}
		
		System.out.print("\n");
		String [] names = {"ac","cc","bc"};  // 字符串数组
		for(String n : names) {
//			System.out.println(n);
			System.out.print(n);
			System.out.print(",");
		}


	}

}
