package Static_Method;

public class A1 {	
String m1(String x){
 System.out.println("One");
 return "ABC";
}
String m1(String y,String a){
 System.out.println("Two");	
 return "PQR";
}
public static void main(String[] args){
 A1 a = new A1();
 a.m1("ABC");
 }
}
