package Static_Block;


/*
 * Q) Can we execute a program without main() method?
 * Ans) No, one of the ways was the static block, but it was possible till JDK 1.6. 
 * Since JDK 1.7, it is not possible to execute a Java class without the main method.
 * 
 */
class A3{  
	  static{  
	  System.out.println("static block is invoked");  
	  System.exit(0);  
	  }  
	}  
// The program will not be executed