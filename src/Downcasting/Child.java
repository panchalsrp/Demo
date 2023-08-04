package Downcasting;

public class Child extends Parent
{
 //public static void example()
 //{
	//  System.out.println("THis is static method");
 //}
 
 public void example1()
 {
	 System.out.println("This is 1st example");
	 
 }
 
  public void example2()
  {
	  System.out.println("this is  example 2");
  }
  
  public static void main(String args[])
  {
	  Child c= new Child();
	  Parent p=c;
	  Child a= (Child)p;
	  a.example1();
	  a.example2();
	  a.test();
	  a.test2();	
	  
  }
}
