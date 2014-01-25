package net.xicp.tarbitrary.block;

public class StaticBlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Block();
	}

}
class Block {
	static {
		System.out.println("hello world");
	}
	
	Block() {
		System.out.println("hello qiangge");
	}
}

