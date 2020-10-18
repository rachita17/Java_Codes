package ArrayCodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class OccuranceOfElement {
	static void occuranceOfElements(int[] array)
	{
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(Integer i:array)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
		}
		System.out.println("Input array is "+Arrays.toString(array));
		System.out.println(map);
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
		occuranceOfElements(arr);

	}

}
