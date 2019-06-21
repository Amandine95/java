// 继承，重写
package part1;

class ExtendTest {
	protected boolean openSpeaker(String sp) {  // 声明为protected只有子类能继承
		return true;
	}

}

class MyExtendTest extends ExtendTest{  // 继承
	protected boolean openSpeaker(String sp) {  // 重写,声明为protected或public
		return false;
	}

}




