package net.xicp.tarbitrary.stringbuffer;

public class StringBufferTest {
	public static void main(String[] args) {
		String st = "hello";
		StringBuffer sb = new StringBuffer("world");
		sb.append(st);
		System.out.println(sb);
		sb.insert(0, 't');
		System.out.println(sb);
		sb.delete(0, 3);
		System.out.println(sb);
		System.out.println(sb.reverse());
	}
}
