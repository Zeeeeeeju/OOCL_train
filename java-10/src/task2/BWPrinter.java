package task2;

public class BWPrinter extends Printer{
	
	public BWPrinter() {
		this.color = "black";
	}
	
	@Override
	public void print() {
		System.out.println("使用"+this.color+"打印纸张");
	}
	
}
