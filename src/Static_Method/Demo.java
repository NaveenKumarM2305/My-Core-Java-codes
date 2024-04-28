package Static_Method;

public class Demo {
	 static int a =10;
	  public void Demo() {
		System.out.println(a);
	}
	public void test() {
		System.out.println(a);
	}
	public static void test1() {
		System.out.println(new Demo().a);
	}

}
