// ����̨��ȡ�ַ�
package part1;

import java.io.*; // Java.io ���������������в������롢�����Ҫ���ࡣ������Щ�������������Դ�����Ŀ��

public class Test3 {
	public static void main(String[] args) throws IOException{
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ʹ�� System.in ���� BufferedReader
		System.out.println("�����ַ�������q�˳�");
		
		do {
			c = (char) br.read();  // ��ȡ�ַ�
			System.out.println(c);
			
		}while (c != 'q');  // java���ַ������ţ��ַ���˫����
		
	}

}
