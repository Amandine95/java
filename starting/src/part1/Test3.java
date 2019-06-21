// 控制台读取字符
package part1;

import java.io.*; // Java.io 包几乎包含了所有操作输入、输出需要的类。所有这些流类代表了输入源和输出目标

public class Test3 {
	public static void main(String[] args) throws IOException{
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 使用 System.in 创建 BufferedReader
		System.out.println("输入字符，按下q退出");
		
		do {
			c = (char) br.read();  // 读取字符
			System.out.println(c);
			
		}while (c != 'q');  // java中字符单引号，字符串双引号
		
	}

}
