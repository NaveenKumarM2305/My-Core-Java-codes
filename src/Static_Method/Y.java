package Static_Method;

public class Y extends X {
int a =1;
	public static void main(String[] args) {
		X x = new Y();
		Y y =(Y)x;
		y.test();
		x.test();
		System.out.println(y.a);;
		System.out.println(x.a);
	}
	void test() {
		System.out.println("From Y");
	}
}
