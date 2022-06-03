package basicJavaProgram;

public class ConstrctorProgram {
	
	//Constructor Concept and Programs

		 int a;
		 int b;
		 
		 // program -- compilation + execution
		 
		 public ConstrctorProgram()       //1st without argument
		 {
			 a =10;
			 b =20;		  
		 }
		
		 public ConstrctorProgram(int c)     //1st with argument
		 {
			 a =50;
			 b =11;		 
		 }
		 
		 public ConstrctorProgram(double b)     //1st with argument- not possible
		 {
			 a =130;
			 b =120;		 
		 }
		 
		 public ConstrctorProgram(char k)     //2nd with argument
		 {
			 a =100;
			 b =300;		 
		 }
		 
		 public ConstrctorProgram(int c, int d, int e)     //3rd with argument
		 {
			 a =c;
			 b =d;		 
		 }

		  void addition()
		    {
		    	int z = a + b;
		    	System.out.println(z);
		    }
		 
		 void addition1()
		    {
		    	int z = a + b;
		    	System.out.println(z);
		    }
		 
		 void multiply()
		    {
		    	int z = a * b;
		    	System.out.println(z);
		    }
		 
		 public static void main(String[] args)
		 {
			 ConstrctorProgram z = new ConstrctorProgram();
			  z.addition();
			  
			 ConstrctorProgram x = new ConstrctorProgram(5);
			  x.addition1();
			 
			 ConstrctorProgram y = new ConstrctorProgram('a');
			 y.multiply();
			  
	
		 }
		 
	

	}
