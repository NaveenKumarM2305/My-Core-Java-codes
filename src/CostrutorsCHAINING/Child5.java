package CostrutorsCHAINING;

class Child5 extends SuperClass{
	Child5(){
		
		System.out.println("No argument Constructor of Child5");
	}
	Child5(int a){
		System.out.println("One argument Constructor of Child5");
	}
	public static void main(String[] args) {
//		
		
		new Child5();
		// When you create the Object of the sub-Class
		// implicitly the zero parameterized constructor of the 
		// superClass is invoked.
		
		// If we want parameterized superClass constructor to be 
		// called then inside the zero parameterized child constructor
		// we must call super(10,20) in the first line.
		
	}
	
	
}

