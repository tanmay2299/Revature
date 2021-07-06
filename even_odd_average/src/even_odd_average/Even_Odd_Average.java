//Find average of even and odd numbers in array
package even_odd_average;

import java.util.Scanner;

public class Even_Odd_Average 
{

	public static void main(String[] args) 
	{
		int oddSum=0,oddCount=0,evenSum=0,evenCount=0;
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
		
		
		for(int i=0;i<N;i++)
		{
			
			if(arr[i]%2==0)
			{
				evenSum=evenSum+arr[i];
				evenCount++;
			}
			else
			{
				oddSum=oddSum+arr[i];
				oddCount++;
			}
			
		}
		System.out.println("Average of even numbers from the array are:" +evenSum/evenCount);
		System.out.println("Average of odd numbers from the array are:" +oddSum/oddCount);

	}

}
