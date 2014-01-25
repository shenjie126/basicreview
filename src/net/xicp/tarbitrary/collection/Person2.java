package net.xicp.tarbitrary.collection;

class Person2 implements Comparable {
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

	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		Person2 p = (Person2) o;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Person2 other = (Person2) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName() + " " + this.getAge();
	}
	
	
}
