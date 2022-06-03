package basicJavaProgram;

import java.nio.file.spi.FileSystemProvider;

public class StringProgram {

	public static void main(String[] args) 
	{
	
		
		String  x = "Vishal";              //String Literal
		String  y = "Vishal Mob no : 9011159154"; 
		String  z = "Vishalccool@gamil.com"; 
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		String p = new String("Vishal Chavan");   //String with a new Keyword
		System.out.println(p);
		
		String q = "Vishal S Chavan";      //String Literal
		System.out.println(q);
		
		//length of string
	      int d1 = q.length();
		System.out.println("length of string: "+q.length());
		
		//charAt
		System.out.println(q.charAt(3));
		 char c1 = q.charAt(3);
		
		 
		 //concat method
		 System.out.println(q.concat(" Pune"));
		 
		 String a1 = "Vishal";
		 String b1 = " Chavan";
		 
		 System.out.println(a1.concat(b1));
		
		 //upper case & lower case
		 String n = "Vishal S Chavan";
		 System.out.println(n.toUpperCase());
		 System.out.println(n.toLowerCase());
		
		 //start with ends with
		 System.out.println(n.startsWith("Vis"));
         System.out.println(n.endsWith("van"));

	     //Equals
         String x1 = " Vishal S Chavan";
	     System.out.println(x1.equals(" Vishal S Chavan"));
	     String x2 = " Vishal S Chavan";
	     System.out.println(x1.equals(x2));
	     
	     //Equals ignore case
	     System.out.println(x1.equalsIgnoreCase(x2));
	     
	     //substring index
	     System.out.println(x1.substring(7));
	     
	     //starting with ending with index
	     System.out.println(x1.substring(7,7));
	     
	     //trim method
	     String y1 = " Vishal S Chavan";
	     String y2 = "  Vishal S Chavan";
	     System.out.println(y1);
	     System.out.println(y2.trim());
	
	
	}

}
