package primitiveTypecasting;

public class Explicite1 
   {
	float a=35;
	public void add()
	{
		int b=(int)a;
		System.out.println("b");
	//}
	
	//public void add2()
	//{
		short c=(short)b;
		System.out.println("int argument");
	}
	
	 public void add3()
		{
		double p= 54.65d;
		float q=(float)p;
		System.out.println("float arg");
	}
	
	public static void main(String args[])
	{
		Explicite1 t=new Explicite1();
		t.add();
		//t.add2();
		t.add3();
	}

}
