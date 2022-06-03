package basicJavaProgram;

public class LoopsInJava 
{

	public static void main(String[] args)
	{
		// for loop example 1
		
		for(int x=5; x<=10; x++)     
		{
			System.out.println("hello");    //hello, hello,hello,hello
		}
		
		System.out.println("end of program");
		
		
		//while loop example
		
		int i =0;
		
		while(i<=10)
		{
		  System.out.println(i);
		  i++;
		}
		
		System.out.println("end of program");
		
// do while loop - -WAP  to print numbers from 1-10
		
		int j=0;
		do
		{
			System.out.println(j);
			j++;
		}
		while(j<=10);
		
		System.out.println("end of program");
		
		
		
		//And Or Operators
		int x=50;
		
		if(x>=10 && x<=50)
		{
			System.out.println("hi");
		}
		
			
	}	


}
