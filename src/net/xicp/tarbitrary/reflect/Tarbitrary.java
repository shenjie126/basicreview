package net.xicp.tarbitrary.reflect;

public class Tarbitrary{
	private int age;
	String name;
	
	public String tel;
	
	protected String nickName;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getAge() {
		System.out.println("调用得到年龄方法");
		return age;
	}

	public void setAge(int age) {
		System.out.println("调用设置年龄方法，年龄为："+ age);
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	private String diy() {
		return "hello world";
	}
	
	public  static void say() {
		System.out.println("你好，涂强");
	}
	
	private static int myAge() {
		return 4;
	}
	
	
}