package ArrayCodes;
import java.util.*;
public class ContinousSubArray {
	static void subArray(int arr[],int number)
	{
		int sum=arr[0];
		int start=0;
		for(int i=1;i<arr.length;i++)
		{
			sum=sum + arr[i];
			while(sum>number && start<=i-1)
			{
				sum=sum-arr[start];
				start++;
			}	
			if(sum==number)
			{
				System.out.println("continous sub array with sum"+number+"is:");
				for(int j=start;j<=i;j++) {
					System.out.println(arr[j]+" ");
				}
				System.out.println();
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=s1.nextInt();
		System.out.println("Enter array:");
		int a1[]=new int[n];
		for(int i=0;i<a1.length;i++) {
			a1[i]=s1.nextInt();
		}
		System.out.println("Enter sum");
		int s=s1.nextInt();
		subArray(a1,s);
	}
	

}
