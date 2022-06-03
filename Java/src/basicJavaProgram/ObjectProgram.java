package basicJavaProgram;

public class ObjectProgram 
{
	// Object in Java Program


		 static void print()         //class name-static m
		    {
		    	System.out.println("static method -HI");
		    }
		    
		    void print1()                  //object non-static
		    {
		    	System.out.println("non-static-Hello");
		    }
		 
		    void add(int a, int b)
		    {
		    	int c = a + b;
		    	System.out.println(c);
		    }
		    
		    
		    public static void main(String[] args) 
		    {
		    	
		    	//static method
		    	ObjectProgram.print();
		    	
		    	
		    	// object creation for non static elements
		    	
		    	ObjectProgram  x = new ObjectProgram ();
		    	
		    	//non-static method
		    	x.print1();
		    	
		    	
		    	//second non static method
		    	x.add(100, 200);
		    	
		    	x.add(400, 100);
		    	
		    	
		    	ObjectProgram y = new ObjectProgram ();
		    	
		    	y.print1();
		    	y.add(1, 2);
		    	
		    	
				
			}

	
}
