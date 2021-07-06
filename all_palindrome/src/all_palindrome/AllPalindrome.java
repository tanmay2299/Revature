package all_palindrome;

public class AllPalindrome 
{
	public static void palindrome(int a)
	{
		int temp=a,b,n=0;
		while(a>0) 
		{
			b=a%10;
			n=n*10+b;
			a=a/10;
		}
		if(temp==n)
		{
			System.out.println(" Yes " +temp+ " is a palindrome. ");
		}
		else
		{
			System.out.println(" Yes " +temp+ " is not a palindrome. ");
		}

	}
	public static void main(String[] args) 
	{
         int arr[]= {141,123321,1432,65456,7688};
         for(int i=0;i<arr.length;i++)
         {
        	 palindrome(arr[i]);
         }
         
	}

}
