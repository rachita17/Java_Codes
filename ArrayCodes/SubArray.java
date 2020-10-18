package ArrayCodes;
import java.util.*;
public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int arr[]=new int[4];
		int len=arr.length;
		System.out.println("Enter array");
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=s1.nextInt();
		}
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(arr[k]+" ");
					
				}
			}
		}

	}

}
