package Downcasting;

public class Eat extends Food
{
   public void health()
   {
	   System.out.println("Always use healthy food ");
   }
   
   public void walk()
   {
	   System.out.println("After eating walk is important");
	   
   }
   
   public static void main(String args[])
   {
	   Eat e= new Eat();
	   Food f=e;
	   Eat x=(Eat)f;
	   x.mumbai();
	   x.kolahpur();
	   x.health();
	   x.walk();
   }
}
