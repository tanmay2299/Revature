package operators_in_java;

public class LogicalOpeators 
{

	public static void main(String[] args) 
	{
		int a = 10;
        System.out.println(a<10 & a<20);
        
        System.out.println(a<10 || a<20);
        
        System.out.println(!(a<10 &  a<20));
	}

}
