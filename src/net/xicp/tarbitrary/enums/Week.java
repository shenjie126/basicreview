package net.xicp.tarbitrary.enums;

/**
 * enum里面可以有构造方法，但构造方法不能是public, 其实每一个enum都是以其名字命名的一个特殊类，
 * 其中的每一个元素都是类的一个实例。枚举类可以实现接口，　里面可以定义抽象方法，以及其它的方法
 * 具体定义如下：
 * @author tuqiang
 *
 */
public enum Week {
	MON(1), TUE(3), WED(2), THU(4), FRI(6), SAT(7), SUN(8);
	
	private int temp;
	
	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	private Week(int temp) {
		this.temp = temp;
	}
}
