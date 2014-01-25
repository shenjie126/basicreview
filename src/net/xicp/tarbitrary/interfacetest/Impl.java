package net.xicp.tarbitrary.interfacetest;

public class Impl implements I {

	@Override
	public void print() {
		System.out.println("print方法");
	}

	@Override
	public void printInfo() {
		System.out.println("打印信息方法。");
	}

}
