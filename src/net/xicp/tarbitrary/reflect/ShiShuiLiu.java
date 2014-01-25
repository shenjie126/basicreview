package net.xicp.tarbitrary.reflect;

public class ShiShuiLiu{
	private int age;
	private String name;
	
	public String tel;

	public int getAge() {
		return age;
	}

	public ShiShuiLiu(int age, String name, String tel) {
		this.age = age;
		this.name = name;
		this.tel = tel;
	}

	public ShiShuiLiu() {
		super();
		this.setAge(88);
		this.setName("逝水流");
		this.setTel("123456789");
	}

	public void setAge(int age) {
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " " + this.age + " " + this.tel;
	}
	
	
	
}