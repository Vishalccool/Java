package basicJavaProgram;

public class FirstBasicProgram
{	
	// arithmatic operatorions 
	
	public static void main(String[] args) 
	{
		int x1=100;
		int y1=200;
		System.out.println("Start the program");
		
		System.out.println("Addition of two numbers = "+(x1+y1));
		System.out.println("Substraction of two numbers = "+(x1-y1));
		System.out.println("Multiply of two numbers = "+(x1*y1));
		System.out.println("Division of two numbers = "+(x1/y1));
		System.out.println("Modules of two numbers = "+(x1%y1));
		
		System.out.println("End of program");
	
        // if -statement -single condition
		
	    int marks = 41;		
		if(marks>=40)
		{
			System.out.println("Student is Passed");
		}	
		
		System.out.println("----End of program---");
		
		
		
		
		//if-else statements
		
		int marks1 =70;
		if(marks1>=40)              //true
		{
			System.out.println("student is passed");
		}
		else                         //false
		{
		System.out.println("student is failed");
		}		
		System.out.println("----End of program---");
		
		
		
		//if-elseif ladder statements
		int number = -20;
		
		if(number>0)
		{
			System.out.println("positive number");
		}
		else if(number<0)
		{
		    System.out.println("negative number");	
		}
		else
		{
			System.out.println("number is zero");
		}
		
		System.out.println("----End of program---");
		
		
		
		
		//Nested -if statements
		
		int age = 21;
		int weight  = 51;
		
		if(age>20)
		{
			System.out.println("check ur weight now");
			if (weight >50)
			{
				System.out.println("eligible for blood donation");
			}
			
		}
		
		
		System.out.println("----End of program---");
		
	
	
	}
	
	
}
