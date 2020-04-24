package project3;
import java.util.*;


interface A{
	int addition(int a,int b );
	int subtraction(int a,int b );
	int multiplication(int a,int b );
	int division(int a,int b );
	int modulus(int a,int b);
	
}
class B implements A{

	
	public int addition(int a, int b) {
		
		return a+b;
	}

	
	public int subtraction(int a, int b) {
		
		return a-b;
	}


	public int multiplication(int a, int b) {
	
		return a*b;
	}

	
	public int division(int a, int b) {
		
		return a/b;
	}

	
	public int modulus(int a, int b) {
		
		return a%b;
	}
	
}


public class Exp5Prog2 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println(""+"Enter Two Numbers");
		int a=s1.nextInt();
		int b=s1.nextInt();
		B b1=new B();
		int P=b1.addition(a, b);
		int Q=b1.subtraction(a, b);
		int R=b1.division(a, b);
		int S=b1.modulus(a, b);
		
		System.out.println("addition  is "+P+ "\n subtraction is: "+Q+" \n multiplication is:  "+R+" \n division is:"+S);
	}

}
