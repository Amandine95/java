// static�����෽���������
package part1;

public class InstanceCounter {
	private static int numInstances = 0;  // �����=��̬����
	protected static int getCount() {  // ��̬����ֻ��ʹ�þ�̬����
		return numInstances;
	}
	
	private static void addInstance() {
		numInstances++;
	}
	
	InstanceCounter(){  // Ĭ�����η� ���췽��
		InstanceCounter.addInstance();  // ����.������ ���þ�̬����
	}
	
	public static void main(String[] args) {
		System.out.println("starting with"+InstanceCounter.getCount()+"instances");
		for (int i = 0;i<500;i++) {
			new InstanceCounter(); // �������󼴵��ù��췽��
		}
		System.out.println("created"+InstanceCounter.getCount()+"instances");
	}

	
}
