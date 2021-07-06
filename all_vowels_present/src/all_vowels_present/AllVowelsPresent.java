package all_vowels_present;

public class AllVowelsPresent 
{
	public static void main(String[] args) 
	{
		int ac=0,ec=0,ic=0,oc=0,uc=0;  
	    String str =" Tanmay eis a good buoy" ;  
	    str = str.toLowerCase();
	    char[] z = str.toCharArray();
	    for(int i = 0; i < z.length; i++) 
	    {
	    	if(z[i]== 'a' )  
	    	{
	    		ac++;	
	    	}
	    	else if(z[i]=='e' )
	    	{
	    		ec++;
	    	}
	    	else if( z[i]=='i' )
	    	{
	    		ic++;
	    	}
	    	else if( z[i]=='o' )
	    	{
	    		oc++;
	    	}
	    	else if(z[i]=='u' )
	    	{
	    		uc++;
	    	}
	    }   
	    
	    if(ac>0 && ec>0 && ic>0 && oc>0 && uc>0)
	    {
	    	System.out.println("All vowels are present ");
	    }
	    else 
	    {
	    	System.out.println("All vowels are not present ");
	    }
	}  
}




