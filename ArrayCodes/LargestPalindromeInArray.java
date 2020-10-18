package ArrayCodes;

import java.util.Arrays;
import java.util.Scanner;

public class LargestPalindromeInArray {
	static void largestPalindrome(int[] array)
	{
		Arrays.sort(array);
		int len=array.length;
		for(int i=len-1;i<=0;--i)
		{
			if(checkPalindrome(array[i]))
			{
				System.out.println(array[i]);
			}
		}
	}

	private static boolean checkPalindrome(int n) {
		// TODO Auto-generated method stub
		int r;
		while(n!=0)
		{
			r=n%10;
			
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=s1.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]= s1.nextInt();
		}
		
	}

}
