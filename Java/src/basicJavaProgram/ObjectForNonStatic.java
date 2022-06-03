package basicJavaProgram;

public class ObjectForNonStatic 
{

	static int x = 10;
    int y = 20;
    int z = 30;
    static int v = 40;
    
public static void main(String[] args) 
{
	System.out.println(" static variable"  +x);    //direcyly call or with  classname call
//	System.out.println(ObjectForNonStatic.z);
	
	ObjectForNonStatic r = new ObjectForNonStatic(); // when NonStaic method call that time object will be created
	System.out.println("first object non static "+r.y);
	
	ObjectForNonStatic p = new ObjectForNonStatic();
	System.out.println("second object non static "+p.z);
	
	System.out.println(" static variable" +v);
//	System.out.println(ObjectForNonStatic.v);
	
//	//values change
	x = 11;
	System.out.println("new value for static "+x);
	
	r.y =21;
	System.out.println("new value for non-static with first object "+r.y);
	
	
	p.z = 41;
	System.out.println("second object non static with second object "+p.z);
}
}
  