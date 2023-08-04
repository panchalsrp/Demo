package primitiveTypecasting;

public class ImpliciteCasting 
{
	public static void main(String args[])
	{
	 byte a= 10;
	 System.out.println("byte arg");
	 
	 short b =a;
	 System.out.println("short arg");
	 
	 int c = b; 
		System.out.println("int arg");
		
		long d= c;
		System.out.println("long args");
		
		float e=d;
		System.out. println("Float arg");
		
		double f=e;
		System.out.println("double arg");
		
		ImpliciteCasting t=new ImpliciteCasting();
		t.mod();
	}
	
	public void mod() 
	{
		byte a =30;
		System.out.println("byte args");
		
		int b= a;
		System.out.println("int arg");
	}
}

