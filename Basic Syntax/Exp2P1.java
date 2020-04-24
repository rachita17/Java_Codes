import java.util.Scanner;
public class Exp2P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("enter number:");
		int a=s1.nextInt();
		System.out.println("enter second number:");
		int b=s1.nextInt();
		System.out.println("enter third number:");
		int c=s1.nextInt();
		
		if(a>b&&a>c)
		{
			System.out.println("greatest is"+a);
		}
		if(b>a&&b>c)
		{
			System.out.println("greatest is"+b);
		}
		if(c>a&&c>b)
		{
			System.out.println("greatest is"+c);
		}

	}

}
