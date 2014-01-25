package net.xicp.tarbitrary.collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet会对里面的元素进行排序，如果一个类没有实现Comparable接口的话，则这个类加入TreeSet后会
 * 报异常。解决异常的办法就是让其实现comparable接口即可。并且一般要重写hashcode与equals方法。
 * 如果在HashSet中想真正做到去除重复元素，即姓名作者售价字段都相等的对象，则必须覆写hashCode()与
 * equals方法。
 * @author tuqiang
 *
 */
public class TreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("tuqiang");
		set1.add("lihao");
		set1.add("tarbitrary");
		set1.add("abc");
		System.out.println(set1);
		set1.comparator();
		System.out.println(set1);
		TreeSet<Book> set2 = new TreeSet<Book>();
		Book book1 = new Book("java编程思想", "bruce", 88.0f);
		Book book2 = new Book("java核心技术", "sun", 98.0f);
		Book book3 = new Book("EJB3.0经典技术", "feio", 108.0f);
		Book book4 = new Book("EJB3.0经典技术", "feio", 108.0f);
		set2.add(book1);
		set2.add(book2);
		set2.add(book3);
		set2.add(book4);
		
		System.out.println(set2);
		System.out.println(book4);
		System.out.println("******************");
		System.out.println(book3);
		System.out.println("******************");
		System.out.println(set2.size());
		for(Book book : set2) {
			System.out.println(book);
		}
//		set2.comparator();

		
	}

}

class Book implements Comparable{
	public String name;
	public String author;
	public float prices;
	
	public Book(String name, String author, float prices) {
		this.name = name;
		this.author = author;
		this.prices = prices;
	}

	@Override
	public int compareTo(Object o) {
		Book b = (Book)o;
		
		if (this.name.compareTo(b.name)==0) {
			if (this.author.compareTo(b.author)==0) {
				if (this.prices > b.prices) {
					return 1;
				} else if (this.prices < b.prices) {
					return -1;
				} else {
					return 0;
				}
			} else {
				return this.author.compareTo(b.author);
			}
		} else {
			return this.name.compareTo(b.name);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(prices);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(prices) != Float.floatToIntBits(other.prices))
			return false;
		return true;
	}
	
	
	
	
}
