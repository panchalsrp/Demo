package Downcasting;

public class A extends B 
{
 public void example1()
 {
	 System.out.println("This is example 1");
 }
 
 public void example2()
 {
	System.out.println("This is example 2"); 
 }
 
 public static void main(String args[])
 {
   A a=new A();
   B b=a;
   A x=(A)b;
	 x.example1();
	 x.example2();
	 x.gita();
	 x.shita();
  }
}