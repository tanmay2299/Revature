package prime_index_position;

public class PrimeIndexPosition 
{
	public static void main(String[] args) 
	{
		int count=0;
		String str = "Tanmay eis a good buoy";
		str = str.replaceAll("\\s", "").toUpperCase();
		char[] z = str.toCharArray();
		for (int i = 2;i <= z.length;i++)
	    {    
	        count = 0;
	        for (int j = 2;j <= z.length;j++)
	        {
	            if (i % j == 0)
	            {
	                count++;
	            }
	        }
	        if (count == 1)
	        {
	           System.out.print(z[i - 1]);
	        }
	    }
	}
}
