package net.xicp.tarbitrary.interfacetest;

public class InterfaceDemo1 {
	public static void main(String[] args) {
		I i = new Impl();
		i.print();
		i.printInfo();
	}
}
