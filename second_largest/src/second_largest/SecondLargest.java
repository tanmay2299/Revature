package second_largest;

import java.util.Arrays;

public class SecondLargest 
{
	public static void main(String[] args) 
	{
		int arr[] = {2,6,9,3,6,8,4,1,10,10,10};
		Arrays.sort(arr);
		int n=arr.length;	
		int secondLargest =0;
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) 
		{
		    System.out.print(arr[i]+"\t");
		}
		
		if(arr[n-1]==arr[n-2])
		{	
			while(arr[n-1]==arr[n-2])
			{
				
					secondLargest=arr[n-3];
				
				n--;	
			}
		
		System.out.println("\nSecond largest number is:" + secondLargest);	
		}
		else
		{
			System.out.println("\nSecond largest number is:" + arr[n-2]);
		}
	}
}

