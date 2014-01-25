package net.xicp.tarbitrary.runtimeandsystem;

public class RunTimeTest2 {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("虚拟机总内存" + rt.totalMemory());
		System.out.println("虚拟机使用的最大内存" + rt.maxMemory());
		System.out.println("虚拟机空闲内存" + rt.freeMemory());
	}
}
