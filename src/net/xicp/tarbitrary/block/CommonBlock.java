package net.xicp.tarbitrary.block;

public class CommonBlock {
	int i = 30;
	/**
	 * @param args 
	 * 普通代码块就是在方法里面用一对花括号包起来的一部分
	 * 对程序的顺序执行没什么影响
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CommonBlock().fun();
	}
	
	public  void fun() {
		abc: 
		for (int j = 0; j < 5; j ++) {
			for (int k = 0; k <5; k ++)
			System.out.println("my label");
			break abc;
		}
			System.out.println("fjeoifje");
		{
			int i = 10;
			System.out.println("hello tuqiang" + i +" " +  this.i);
		}
		int i = 40;
		System.out.println("----------------------------");
		
		System.out.println("----------------------------");
		System.out.println("hello tuqiang" + i);
	}

}
