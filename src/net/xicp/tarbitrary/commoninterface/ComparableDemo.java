package net.xicp.tarbitrary.commoninterface;

import java.util.Arrays;

public class ComparableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student st1 = new Student("张三", 22, 99);
		Student st2 = new Student("李四", 23, 99);
		Student st3 = new Student("王五", 23, 99);
		Student st4 = new Student("赵六", 21, 97);
		Student st5 = new Student("赵六", 23, 97);
		Student st6 = new Student("马七", 23, 93);
		
		Student[] students = { st1, st2, st3, st4, st5, st6};
		
		Arrays.sort(students);
		
		for (Student st : students) {
			System.out.println(st);
		}
		

	}

}

class Student implements Comparable<Student> {
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
	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	
	/**
	 * 如果想要用Arrys.sort()方法对一个对象数组进行排序， 则些对象类必须实现了comparable接口
	 * 先按照分数降序排列 ， 分数相同则按照姓名升序排列， 姓名相同则按年龄升序排列。
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * @return -1,0或1
	 * @author tuqiang
	 * @param student表示要比较的Student对象
	 * 
	 * 
	
	 */
	@Override
	public int compareTo(Student student) {
		if (this.score > student.getScore()) {
			return -1;
		} else if (this.score < student.getScore()){
			return 1;
		} else {
			if(this.name.compareToIgnoreCase(student.getName())==1) {
				return -1;
			} else if (this.name.compareToIgnoreCase(student.getName())==-1) {
				return 1;
			} else {
				if (this.age > student.age) {
					return 1;
				} else if (this.age < student.age){
					return -1;
				} else {
					return 0;
				}
			}
		}
		
		
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.age  + " 分数:" + this.score;
	}
	
}