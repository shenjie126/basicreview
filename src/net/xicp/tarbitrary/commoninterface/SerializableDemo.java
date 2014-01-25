package net.xicp.tarbitrary.commoninterface;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URLDecoder;

public class SerializableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String st = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String path = null;
		try {
			String myPath = URLDecoder.decode(st,"utf-8");
			path = myPath.replace("/bin/", "/src/");
			System.out.println(path);
			path = path + "testserializalbe.txt";
		} catch (Exception e) {
			e.printStackTrace();
		}
		Person student = new Person("涂强", 22);
		try {
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream(path));
			oos.writeObject(student);
			oos.close();
			
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream(path));
			Person p =(Person) ois.readObject();
			System.out.println(p);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

/**
 * 一个类实现了Serializable的序列化接口后它的实例对象就可以
 * 被ObjectOutputStream写在硬盘上保存对象的状态。此过程叫作
 * 对象的序列化。当一个序列化的文件被ObjectInputStream流读入
 * java程序取得序列化对象的实例，此过程就叫作对象的反序列化。
 * 如果一个类中有某些成员变量不想被序列化，　则可以在不想被序列化
 * 的对象字段上加上transient关键字。　则此成员变量的值则不会被保存
 * @author tuqiang
 *
 */
class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private  transient String name;
	private int age;
	
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

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "姓名：" + name + " 年龄：" + age;
	}
	
}