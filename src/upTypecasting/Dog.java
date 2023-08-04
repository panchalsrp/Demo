package upTypecasting;

public class Dog extends Cat
{
	public void eat()
	{
		System.out.println("dog are eating");
	}

	public void bone()
	{
		System.out.println("Dog eat bones");
	}
	
	public static void main(String args[])
	{
	Cat c=new Dog();
	c.dance();
	c.milk();
	
	}
}
