package final_keyword;
/*
 * If you make any method as final, you cannot override it.
 */
class Bike3{  
	  final void run(){
		  System.out.println("running");
		  }  
	}  
	     
	class Honda extends Bike3{  
//	   void run(){           //Cannot be overriden
//		   System.out.println("running safely with 100kmph");
//		   }  
	     
	   public static void main(String args[]){  
	   Honda honda= new Honda();  
	   honda.run();  
	   }  
	}  
