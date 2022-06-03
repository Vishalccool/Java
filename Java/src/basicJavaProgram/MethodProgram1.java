package basicJavaProgram;

public class MethodProgram1
{
	
	// private static final char[] demo2 = null;

	public static void patternMethod()
	{
     for (int i=1; i<=2; i++)
	
     {
    	 System.out.println(i); 
     }
	}
// public static void main(String[] args)	
// 
// {
//	 patternMethod();
//	 System.out.println("Vishal");
//	 
//	 patternMethod();
//	 System.out.println("Sudhakar");
//	 
//	 patternMethod();
//	 System.out.println("Chavan");
//	 
//	 
// }


 public static void demo1()
	{
		System.out.println("demo1 method -no-return type method");
	}
	
 public static void demo2(int a)
 {
	 System.out.println("demo2 method with the parenthesis");
 }

 public static int demo6(int c, int d)
	{
		int x = c - d ;
		return x;
	}


 public static void demo7(int c, char d)
	{
		System.out.println("demo7 method");
	}
	

	public static void main(String[] args) {
		MethodProgram1.demo1();

		MethodProgram1.demo2(100);

		MethodProgram1.demo6(20, 20);
		System.out.println(MethodProgram1.demo6(20, 20));

		int y = MethodProgram1.demo6(100, 100);
		System.out.println(y);

		y = MethodProgram1.demo6(300, 150);
		System.out.println(y);

		y = MethodProgram1.demo6(11, 10);
		System.out.println(y);

		MethodProgram1.demo7(90, 'v');

	}

}


