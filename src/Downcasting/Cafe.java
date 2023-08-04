package Downcasting;

public class Cafe extends Coffee
{
  public void test1()
  {
	  System.out.println("test 1 method");
  }
  public void test2()
  {
	  System.out.println("test 2 method");
  }
  public void test3()
  {
	  System.out.println("test 3 method");
  }
  
  public static void main(String args[])
  {
  Cafe c= new Cafe();
  
  Coffee f = new Cafe();
  
  Cafe d = (Cafe)f;
   d.test1();
   d.test2();
   d.test3();
   d.demo1();
   d.demo2();
  }
   
}

