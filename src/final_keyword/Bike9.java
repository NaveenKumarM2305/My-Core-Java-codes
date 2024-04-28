package final_keyword;
/*
 * 
 * 1. final variable
If you make any variable as final, you cannot change the value of final variable(It will be constant).

Example of final variable
There is a final variable speedlimit, we are going to change the value of this variable,
 but It can't be changed because final variable once assigned a value can never be changed.
 */
class Bike9{  
	 final int speedlimit=90;//final variable  
	 void run(){  
	//  speedlimit=400; CTE
	 }  
	 public static void main(String args[]){  
	 Bike9 obj=new  Bike9();  
	 obj.run();  
	 }  
	}//end of class  