package ArrayCodes;
import java.util.*;

public class LeadersInArray {
	static void leaderInArray(int[] array) 
	{
		int len=array.length;
		int max=array[len-1];
		System.out.println("Leader elements in array are:");
		System.out.println(max);
		for(int i=len-2;i<=0;i--)
		{
			if(array[i]>max)
			{
				System.out.println(array[i]);
				max=array[i];
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
		leaderInArray(arr);

	}

}
