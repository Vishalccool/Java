package basicJavaProgram;

public class VariablesTypesInJava 
{
	static int a =10;              //global v
    int b =20 ;             //global v
//    int b =100;      //not possible
    
    
public VariablesTypesInJava ()
{
	int a =75;            //local v
	int b =85;            //local v
	
	int e =70;                  //local v
	int f= 80;                  //local v
//	int e = 90;        //not possible
}

public VariablesTypesInJava (int a)
{
	int e =170;                  //local v
	int f= 180;                  //local v
}

public static void main(String[] args) 
{
	System.out.println(a);      // class V/ Static V
	
	VariablesTypesInJava  x = new VariablesTypesInJava ();
	System.out.println(x.b);        //Instance V/ Non-static/object
	
	int c = 100;            //local v
	int d = 200;           //local v
	System.out.println(c);
	System.out.println(d);
}

}
