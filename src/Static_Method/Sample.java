package Static_Method;

public class Sample {
	
	static void eat() {
		System.out.println("Eating");
//		this();
		// We cannot use this() and super() in static context/method
	}
	Sample(){
		System.out.println("HI");
	}
	public static void main() {
	new Sample();	
	}
	

}
