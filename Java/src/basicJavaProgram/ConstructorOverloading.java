package basicJavaProgram;

public class ConstructorOverloading
{
	 
	    double x;      
	    double y;             
	    
	    public ConstructorOverloading() //arguments not define
	    {
	    	x =10;
	    	y =20;
	    }
	    
	    public ConstructorOverloading(int a) //arguments are define
	    {
	    	x = 1000;
	    	y = 500;
	    }
	    
	    public ConstructorOverloading(int a, int b) //arguments are define
	    {
	    	x = a;
	    	y = b;
	    }
	    
	    public ConstructorOverloading(double a)
	    {
	    	x = 222.5;
	    	y = 222.5;
	    }
	    
	    public ConstructorOverloading(char a) //arguments are define
	    {
	    	x = 70.0;
	    	y = 20.0;
	    }
	    
	    void addition()
	    {
	    	double z = x + y;
	    	System.out.println(z);
	    }
	    
	    void substract()
	    {
	    	double z = x - y;
	    	System.out.println(z);
	    }
	    
	    void multiply() 
	    {
	    	double z = x * y;
	    	System.out.println(z);
	    }
	    
	    void division()
	    {
	    	double z = x / y;
	    	System.out.println(z);
	    }
	    
	    void modules()
	    {
	    	double z =x % y;
	    	System.out.println(z);
	    }
	    
	   public static void main(String[] args) 
	   {
		
		   //object creation
		   ConstructorOverloading x = new ConstructorOverloading();
		   x.addition();
		   System.out.println();
		   
		   // second object
		   ConstructorOverloading y = new ConstructorOverloading(5);
		   y.substract();
		   System.out.println();
		   
		   //third object
		   ConstructorOverloading z = new ConstructorOverloading(10,5);
		   z.addition();
		   System.out.println();
		   
		   //fourth object
		   ConstructorOverloading v = new ConstructorOverloading (5.0);
		   v.addition();
		   System.out.println();
		   
		   //fifth object
		   ConstructorOverloading p = new ConstructorOverloading('a');
		   p.addition();
		   p.substract();
		   p.multiply();
		   p.division();
		   p.modules();
	   }   
	
	
}
