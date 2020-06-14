package task1;

public class Tiger extends Animal{
	
	//重写
	@Override
	public void say() {
		System.out.println("awooooooooo");
	}
	
	//重载
	public void eat() {
		System.out.println("eat");
	}
	
	public void eat(String food) {
		System.out.println("eat food");
	}
	
}

