package Super_Keyword;

/*
 *  super is used to invoke parent class constructor.
*   The super keyword can also be used to invoke the parent class constructor. 
*   Let's see a simple example:
 */
class Animal2{  
Animal2(){System.out.println("animal is created");}  
}  
class Dog2 extends Animal2{  
Dog2(){  
super();  
System.out.println("dog is created");  
}  
}  
class TestSuper3{  
public static void main(String args[]){  
Dog2 d=new Dog2();  
}}  