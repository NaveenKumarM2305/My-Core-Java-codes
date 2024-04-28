package Abstraction_In_Java;

public class Demo2  extends Demo1{

	public void run() {
		System.out.println("running");
	}
	public static void main(String[] args) {
		
		new Demo2().run();
		Demo1.main(args);
	}
	
}
