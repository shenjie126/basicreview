package net.xicp.tarbitrary.commoninterface;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Teacher st1 = new Teacher("张三", 22, 99);
		Teacher st2 = new Teacher("李四", 23, 99);
		Teacher st3 = new Teacher("王五", 23, 99);
		Teacher st4 = new Teacher("赵六", 21, 97);
		Teacher st5 = new Teacher("赵六", 23, 97);
		Teacher st6 = new Teacher("马七", 23, 93);
		
		Teacher[] students = { st1, st2, st3, st4, st5, st6};
		
		Arrays.sort(students, new ComparatorImpl());
		
		for (Teacher st : students) {
			System.out.println(st);
		}
		

	}

}

class ComparatorImpl implements Comparator<Teacher> {

	@Override
	public int compare(Teacher t1, Teacher t2) {
		if (t1.getScore() > t2.getScore()) {
			return -1;
		} else if (t1.getScore() < t2.getScore()){
			return 1;
		} else {
			if(t1.getName().compareToIgnoreCase(t2.getName())==1) {
				return -1;
			} else if (t1.getName().compareToIgnoreCase(t2.getName())==-1) {
				return 1;
			} else {
				if (t1.getAge() > t2.getAge()) {
					return 1;
				} else if (t1.getAge() < t2.getAge()){
					return -1;
				} else {
					return 0;
				}
			}
		}
		
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.equals(obj);
	}
	
	
}

class Teacher {
	private String name;
	private int age;
	private int score;

	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}


	/**
	 * Student类的构造方法， 如果要实例化Student类， 则可以调用此方法。
	 * @param name 学生姓名
	 * @param age  学生年龄
	 * @param score 学生分数
	 * @author tuqiang
	 * @return no return;
	 * @since tarbitrarydk1.0
	 */
	public Teacher(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj instanceof Student) {
			Student s  = (Student)obj;
			if (s.getAge()==this.getAge() && s.getName().equals(this.getName()) 
					&&s.getScore()==this.getScore()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	
	
	@Override
	public String toString() {
		return this.name + " " + this.age  + " 分数:" + this.score;
	}
	
}