package entity;

public class Animal {
	
	private int age;
	private double weight;
	private boolean running = true;
	private boolean eating = true;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isRunning() {
		return running;
	}
	public void setRunning(boolean running) {
		this.running = running;
	}
	public boolean isEating() {
		return eating;
	}
	public void setEating(boolean eating) {
		this.eating = eating;
	}
	
}
