package net.xicp.tarbitrary.enums;

/**
 * enum里面可以有构造方法，但构造方法不能是public, 其实每一个enum都是以其名字命名的一个特殊类，
 * 其中的每一个元素都是类的一个实例。枚举类可以实现接口，　里面可以定义抽象方法，以及其它的方法 具体定义如下：
 * 
 * @author tuqiang
 * 
 */
public enum Week3 implements WeekInterface {
	MON(1) {
		@Override
		public void info() {
			System.out.println("今天是星期一");
		}

		public void say() {
			System.out.println("hello world");
		}
	},
	TUE(3) {
		@Override
		public void info() {
			System.out.println("今天是星期一");
		}

		public void say() {
			System.out.println("hello world");
		}

	},
	WED(2) {
		@Override
		public void info() {
			System.out.println("今天是星期一");
		}

		public void say() {
			System.out.println("hello world");
		}
	},
	THU(4) {
		@Override
		public void info() {
			System.out.println("今天是星期一");
		}

		public void say() {
			System.out.println("hello world");
		}
	},
	FRI(6) {
		@Override
		public void info() {
			System.out.println("今天是星期一");
		}

		public void say() {
			System.out.println("hello world");
		}
	},
	SAT(7) {
		@Override
		public void info() {
			System.out.println("今天是星期一");
		}

		public void say() {
			System.out.println("hello world");
		}
	},
	SUN(8) {
		@Override
		public void info() {
			System.out.println("今天是星期一");
		}

		public void say() {
			System.out.println("hello world");
		}
	};

	private int temp;

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	private Week3(int temp) {
		this.temp = temp;
	}

	public abstract void info();
}
