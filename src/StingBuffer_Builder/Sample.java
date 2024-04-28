package StingBuffer_Builder;

public class Sample {
	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer("hi");
		String name = new String("hello");
		System.out.println(name.hashCode());
		name+="bye";
	
		System.out.println(name);
		System.out.println(name.hashCode());	
		
		
		System.out.println(sbf.hashCode());
		sbf.append("Hellooisdoi");
		System.out.println(sbf.hashCode());
	}

}
