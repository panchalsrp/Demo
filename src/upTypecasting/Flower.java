package upTypecasting;

public class Flower extends UpCasting1 
{
  public void laptop()
  {
	  System.out.println("Child having laptop");
  }
  
  public void bike()
  {
	  System.out.println("child having bike");
  }
  
  public static void main(String args[])
  {
	 // Flower a= new Flower();
	  //UpCasting1 x=new UpCasting1();
	  UpCasting1 p = new Flower();
	 p.car();
	 p.farm();
	 
  }
  
}
