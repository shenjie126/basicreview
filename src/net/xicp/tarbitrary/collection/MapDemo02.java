package net.xicp.tarbitrary.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap中加入类的对象作为key时，此类必须实现了Comparable接口，否则抛出异常
 * 如果要做到所有属性相同的对象不能加入同一个HashMap中时，此map中的key的类必须重写了
 * equals和hashcode方法。
 * @author tuqiang
 *
 */
public class MapDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		Map<Person, String> map2 = new TreeMap<Person, String>();
		Map<Person, String> map3 = new HashMap<Person, String>();
		Map<Person2, String> map4 = new HashMap<Person2, String>();
		Person p = new Person("tarbitrary",22);
		Person2 pe = new Person2("tarbitrary",22);
		Person p2 = new Person("tuqiang",22);
		Person2 pe2 = new Person2("tuqiang",22);
		
		map.put("abc", "hello");
		map.put("def", "world");
		
		map2.put(p, "abc");
		map2.put(p2, "mytreemap");
		map2.put(new Person("tarbitrary",22), "world");
		
		map3.put(p, "abc");
		map3.put(p2, "mytreemap");
		map3.put(new Person("tarbitrary",22), "world");
		
		map4.put(pe, "abc");
		map4.put(pe2, "mytreemap");
		map4.put(new Person2("tarbitrary",22), "world");
		
		System.out.println("用只实现了Comparable接口的类的对象作为key的TreeMap");
		System.out.println(map2);//因为TreeMap中的person在插入时会先调用compare方法进行比较的缘故，所以相同属性的Person对象实例加不进去，并且取的时候只要传入的对象属性相同满足compare方法也就可以取出存进去的value
		System.out.println("***************");
		System.out.println("key对象所在类没有实现hashcode与equals方法");
		System.out.println(map3);//HashMap则需要类的对象实现equals与hashCode方法才能实现同样的功能。如若不然则会出现下面这种情况。
		System.out.println("覆写了hashcode与equals方法的实例对象后的HashMap");
		System.out.println(map4);
		
		System.out.println(map.get("abc"));
		System.out.println(map.get(new String("abc")));
		
		System.out.println("用只实现了Comparable接口的类的对象作为key的TreeMap");
		System.out.println(map2.get(p2));
		System.out.println(map2.get(new Person("tuqiang",22)));
		
		
		System.out.println("key对象所在类没有实现hashcode与equals方法");
		System.out.println(map3.get(p2));
		System.out.println(map3.get(new Person("tuqiang",22)));
		
		System.out.println("覆写了hashcode与equals方法的实例对象后的HashMap");
		System.out.println(map4.get(pe2));
		System.out.println(map4.get(new Person2("tuqiang",22)));
		
		
		
		
	}

}
