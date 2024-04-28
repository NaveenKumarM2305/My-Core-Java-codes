package Abstraction_In_Java;

abstract class Demo1 {
	Demo1(){
		System.out.println("This is abstract class Constructor");
	}
	
	protected abstract void run();
	public static void main(String[] args) {
		
		System.out.println("This is main method");
	}
}
