// �̳У���д
package part1;

class ExtendTest {
	protected boolean openSpeaker(String sp) {  // ����Ϊprotectedֻ�������ܼ̳�
		return true;
	}

}

class MyExtendTest extends ExtendTest{  // �̳�
	protected boolean openSpeaker(String sp) {  // ��д,����Ϊprotected��public
		return false;
	}

}




