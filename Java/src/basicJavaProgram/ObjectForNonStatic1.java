package basicJavaProgram;

public class ObjectForNonStatic1 
{

	static int a = 10;
		   int b = 20;
    static int c = 30;
		   int d = 40;		   
    static int e = 50;
		   int f = 60;
 
		  
		  
	  public static void main (String []args)
 
 {
	 System.out.println("Value of a"+a); // static method calling
	 
	 ObjectForNonStatic1 b = new ObjectForNonStatic1(); // non static method
	 System.out.println("Value of b"+b.b);
	 
	 System.out.println("Value of c"+c);
	 
	 ObjectForNonStatic1 d = new ObjectForNonStatic1();
	 System.out.println("Value of d"+d.d);
	 
	 System.out.println("Value of e"+e);
	 
	 ObjectForNonStatic1 f = new ObjectForNonStatic1 ();
	 System.out.println("Value of f"+f.f);
	 
 }
}