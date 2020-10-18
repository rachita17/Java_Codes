package ArrayCodes;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	static void reverseArray(int[] array)
	{
		System.out.println("Before Reversing array is:"+Arrays.toString(array));
		int len=array.length;
		int temp;
		for(int i=0;i<len/2;i++)
		{
			temp=array[i];
			array[i]=array[len-1-i];
			array[len-1-i]=temp;
		}
		System.out.println("After Reversing array is:"+Arrays.toString(array));
		
			
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
		reverseArray(arr);

	}

}
