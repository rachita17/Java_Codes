package ArrayCodes;
import java.util.*;
public class SumSameElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter sum");
		int sum=s1.nextInt();
		System.out.println("Enter array values");
		int array1[]= new int[10];
		for(int i=0;i<10;i++) {
			array1[i]=s1.nextInt();
		}
		for(int i=0;i<array1.length;i++) {
			for(int j=i+1;j<array1.length;j++)
			{
				if(array1[i]+array1[j]==sum) {
					System.out.println(array1[i]+","+array1[j]);
				}
					
			}
		}

	}

}
