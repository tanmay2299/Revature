//Find all prime numbers in an array
package prime_numbers;
import java.util.Scanner;
public class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int N=sc.nextInt();
		int[] arr=new int[N];
		System.out.println("Enter the elements of the array: ");  
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Prime numbers from the array are:");
	    for (int i = 0; i < N; i++) 
	    {
	        int j = 2;
	        int p = 1;
	        while (j < arr[i]) 
	        {
	           if (arr[i] % j == 0) 
	                {
	                    p = 0;
	                    break;
	                }
	                j++;
	        }
	        if (p == 1) 
	        {
	           System.out.print(" " + arr[i]);
	        }
	     }
	}
}
