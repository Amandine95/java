// 修饰符
package part1;

public class Logger {
	private String format;  // 私有属性，只能被所属类的公有方法访问，外部类通过该方法访问私有属性
	
	public String getFormat() {
		return this.format;
	}
	
	public void setFormat(String format) {
		this.format = format;
	}
	

}
