package task2;

public class ColorPrinter extends Printer{
	
	public ColorPrinter() {
		this.color = "different colors";
	}
	
	@Override
	public void print() {
		System.out.println("使用"+this.color+"打印纸张");
	}
	
}
