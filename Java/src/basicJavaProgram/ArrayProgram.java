package basicJavaProgram;

public class ArrayProgram 
{
	public static void main(String[] args) 
 {

		int a [] = {1,2,3,4,5,6,7,8,9,10};
		int b [] = new int [50];
		
		System.out.println("Size of a:"+a.length);
		System.out.println("Size of a:"+b.length);
	 
// program 1 element at index position
		
		int a1 [] = {1, 2, 3, 4, 5};
		
		for(int i=0; i<a1.length; i++)
		{
			System.out.println("elemnts of array are: "+a1[i]);
			
			System.out.println("element at index position "+i+" is "+a1[i]);
		}
	 
		
//program 1 practice
		
		int b1 [] = {5, 4, 3, 2, 1};
		 
		for (int k=0; k<b1.length;k++)
		{
			System.out.println("elements of array are:"+b1[k]);
			
			System.out.println("element at index postion "+k+" is "+b1[k]);
		}	
	
// program 2 reverse order
		
		int x [] = {1, 2, 3, 4, 5};
		for(int i=x.length-1; i>=0; i--)
		{
			System.out.println(x[i]);
		}
		
// program 2 practice
		int y [] = {10,9,8,7,6};
		for (int i=y.length-1; i>=0; i--)
		{
			System.out.println(y[i]);
		}
		
// program 3 even position elements
		
		int v [] = {1, 2, 3, 4, 5};
		//          0  1  2  3  4
		
		System.out.println("even position elements");
		
		for(int i=0; i<v.length; i=i+2)			//i=0
		{
			System.out.println(v[i]);
		}

//Program 4 odd position elements

		System.out.println("odd position elements");
		
		for(int i=1; i<v.length; i=i+2)       //i=1
		{
			System.out.println(v[i]);
		}  
			System.out.println();
 
// program 5 - largest number in an array
		
	   int d[] = {1, 2, 3, 4, 5};
				
		System.out.println("size is "+d.length);		
				 
		for ( int i=0; i<d.length; i++)
		{
					System.out.println(a[i]);
		}
				
		int max;
				
		//lets assume max number in an array is at position 0
		max = a[0];
				
				for (int i=0; i<d.length; i++)
				{
					if(d[i]>d[0])
					{
						max =d[i];
					}	
				}
				
				System.out.println("max number is: "+max);
				
				// for loop - > i=0 --> if i=0 -- >false --- out of if 
				
				// for loop - > i=1 --> if i=1 -- >true --- max=a[1]
				
				// for loop - > i=2 --> if i=2 -- >true --- max=a[2]
				
				// for loop - > i=3 --> if i=3 -- >true --- max=a[3]
				
				// for loop - > i=4 --> if i=4 -- >true --- max=a[4]
				
				// for loop - > i=5 --> out of for loop
				
				//print statement run
 
 } 
	 

}

