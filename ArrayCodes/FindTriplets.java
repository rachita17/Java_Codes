package ArrayCodes;

import java.util.Arrays;
import java.util.Scanner;

public class FindTriplets {
	static void findTriplets(int arr[],int sum,int n)
	{
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++)
		{
			int l=i+1;
			int r=n-1;
			int x=arr[i];
			while(l<r)
			{
				if(x+arr[l]+arr[r]==sum)
				{
					System.out.println("sum is"+sum);
					l++;
					r--;
				}
				else if(x+arr[l]+arr[r]<sum)
				{
					l++;
				}
				else {
					r--;
				}
			}
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
        int len=arr.length;
        int sum=-2;
        findTriplets(arr,sum,len);
	}

}
