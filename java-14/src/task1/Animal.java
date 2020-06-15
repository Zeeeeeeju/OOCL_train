package task1;

public class Animal {
	
	private String name;
	private int age;
	
	public Animal() {
	}
	
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}

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

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object animal) {
		return ((Animal) animal).getAge()==this.age && ((Animal) animal).getName().equals(this.name);
	}
	
}
