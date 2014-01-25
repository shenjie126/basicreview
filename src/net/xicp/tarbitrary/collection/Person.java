package net.xicp.tarbitrary.collection;

class Person implements Comparable {
	public String name;
	public int age;

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
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;
		int i = this.getName().compareTo(p.getName());
		if ( i == 0) {
			if (this.getAge() > p.getAge()) {
				return 1;
			} else if (this.getAge() < p.getAge()) {
				return -1;
			} else {
				return 0;
			}
				
		} else {
			return i;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName() + " " + this.getAge();
	}
	
	
}
