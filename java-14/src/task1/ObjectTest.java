package task1;

public class ObjectTest {

	public static void main(String[] args) {
		// toString
		Animal animal = new Animal("tiger", 20);
		System.out.println(animal.toString());
		
		//equals
		Animal animal2 = new Animal("tiger",20);
		Animal animal3 = new Animal("man",20);
		System.out.println(animal.equals(animal2));
		System.out.println(animal.equals(animal3));
		
		//hashcode
		System.out.println(animal.hashCode());
		
	}

}
