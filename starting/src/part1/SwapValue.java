// ����
package part1;

public class SwapValue {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		System.out.println("����ǰnum1:"+num1+"num2:"+num2);
		swap(num1,num2); // ����
		System.out.println("������num1:"+num1+"num2"+num2);
	}
	
	public static void swap(int n1,int n2) {  // ��������
		System.out.println("����swap");
		System.out.println("����ǰn1:"+n1+"n2:"+n2);
		
		int temp = n1;
		n1 = n2;
		n2 = temp;  // �ı��βΣ�ʵ�β���
		
		System.out.println("������n1:"+n1+"n2:"+n2);
		
		
	}


}