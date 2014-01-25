package net.xicp.tarbitrary.extend;

public class MyExtends {
	public static void main(String[] args) {
		A a = new B();
		a.fun();
	}
}

class A{
	A(String name) {
		System.out.println(name);
	}
	public void fun() {
		System.out.println("super ");
	}
}

class B extends A {
	B() {
		super("abcde");
		System.out.println("jfeofjeofej");
	}
	@Override
	public void fun() {
		super.fun();
		System.out.println("abcderf");
	}
}
