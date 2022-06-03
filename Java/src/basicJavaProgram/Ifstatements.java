package basicJavaProgram;

public class Ifstatements 
{
	
// if statement - single condition
	
	public static void main(String[] args)
	{
		int marks = 41;		
		if(marks>=40)
		{
			System.out.println("Student is Passed");
		}	
		
	 	System.out.println("----End of program---");
		

		
	//if-else statements
	
			int marks1=70;
			if(marks1>=40)              //true
			{
				System.out.println("student is passed");
			}
			else                         //false
			{
				System.out.println("student is failed");
			}		
				System.out.println("----End of program---");	
		
				
	//if-else statements			

				int i = 14;  
		        if (i>= 15)
		        {
		            System.out.println("i is smaller than 15");
		        }
		        else
		        {
		        	System.out.println("i is greater than 15");
		        }
		 	
		            System.out.println("----End of program---");

		            
		  //OddEvenCheck 
		            
		            
		            int j = 20;            //assignment operator	    		
		    		
	//if remainder is zero then that number is divisible by 2 and that number is even
		    		
		    		if(j % 2 == 0)             // equal sign
		    		{
		    			System.out.println("even");
		    		}
		    		else
		    		{
		    			System.out.println("odd");
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
		    		    
		    		    
//	Nested -if statements			
		    			
		    			int age = 21;
		    			int weight  = 55;
		    			
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
