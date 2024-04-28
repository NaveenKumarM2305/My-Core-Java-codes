package NonPrimitiveTypeCasting;

public class Test {
	public static void main(String[] args) {
		 Food f=new Gobi();
		 f.whoAreYou();  // I am food
		 System.out.println(f.dish);;
		 Gobi g = (Gobi)f;
		 System.out.println(f.dish);// food
		 System.out.println(g.dish); // gobi
		
		 g.whoAreYou();  // I am gobi
	}

}
