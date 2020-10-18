package ArrayCodes;

import java.util.Arrays;
import java.util.Scanner;

public class ZerosAtEnd {
	static void moveZeroAtEnd(int[] array)
	{
		int counter=0;
		int len= array.length;
		for(int i=0;i<len;i++)
		{
			if(array[i]!=0)
			{
				array[counter]=array[i];
				counter++;
			}
		}
		while(counter<len)
		{
			array[counter]=0;
			counter++;
		}
		System.out.println(Arrays.toString(array));
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
		moveZeroAtEnd(arr);

	}

}
