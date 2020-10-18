package ArrayCodes;
import java.util.*;
public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=s1.nextInt();
		String temp="";
		String str[]= new String[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			str[i]= s1.next();
		}
		System.out.println("Elements in array are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(""+str[i]);
		}
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j])&& i!=j)
				{
					temp=temp+str[i];
				}
			}
		}
		System.out.println("Duplicate elements are \t"+temp);
		
		
		
		

	}

}
