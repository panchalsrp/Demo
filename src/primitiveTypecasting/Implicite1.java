package primitiveTypecasting;

public class Implicite1 
{
	byte p=42;
  public void sub()
  {
	  short q=p;
	  System.out.println("Q");
    
	  int r=q;
	  System.out.println("r");
	  
  }
  
  public void sub2()
  {
	  float d=p;
	  System.out.println("d");
  }
   public static void main (String args[])
   {
	   Implicite1 i=new Implicite1();
			   i.sub();
			   i.sub2();
   }
}
