package net.xicp.tarbitrary.array;

public class ArrayDemo1 {
	public static void main(String args[]) {
		//静态初始化和动态初始化开始都指定了数组大小，java也在堆栈空间分配了相应的大小，
		//只是静态初始化开始就指定了值，而动态初始化是在后面指定数组的值，刚开始数组的值都是默认值
		String[] st = new String[10];

		for (String s : st) {
			System.out.println(s);
		}
		
		String[] sr1 = {"abc", "def"};

		
		String[] sr = { new String("abc"), "def" };
		System.out.println("----------------------");
		System.out.println(sr1 == sr);
		System.out.println(sr1[0] == sr[0]);
		System.out.println(sr1[1] == sr[1]);
		System.out.println("----------------------");

		for (String i : sr) {
			System.out.println(i);
		}

		String[] ss = new String[] { "fefefc", "feffeff" };

		for (String i : ss) {
			System.out.println(i);
		}

		String[][] si = new String[][] { new String[] { "abc", "def" },
				new String[] { "fjeif", "fjikffe", "myefe" },
				new String[] { "fjeif", "fjikffe", "fjeoife", "testest" } };

		System.out.println("二维数组的遍历1：");
		for (String[] a : si) {
			for (String i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		String[][] sj = new String[][] { { "abc", "def" },
				{ "fjeif", "fjikffe", "myefe" },
				{ "fjeif", "fjikffe", "fjeoife", "testest" } };

		System.out.println("二维数组的遍历2：");
		for (String[] a : sj) {
			for (String i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		String[][] sk = new String[][] { { "abc", "def" },
				new String[]{ "fjeif", "fjikffe", "myefe" },
				{ "fjeif", "fjikffe", "fjeoife", "testest" } };

		System.out.println("二维数组的遍历3：");
		for (String[] a : sk) {
			for (String i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		String[][] sl = { { "abc", "def" },
				new String[]{ "fjeif", "fjikffe", "myefe" },
				{ "fjeif", "fjikffe", "fjeoife", "testest" } };

		System.out.println("二维数组的遍历4：");
		for (String[] a : sl) {
			for (String i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		String[][] sm = { { "abc", "def" },
				{ "fjeif", "fjikffe", "myefe" },
				{ "fjeif", "fjikffe", "fjeoife", "testest" } };

		System.out.println("二维数组的遍历5：");
		for (String[] a : sm) {
			for (String i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		int[] t = {1, 2, 3};
		int[] t2 =new int[]{1, 2, 3};
		int[] t3 =new int[]{1, 2, 3};
		System.out.println(t == t2);
		System.out.println(t[0] == t2[0]);
		System.out.println(t.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
	}

}
