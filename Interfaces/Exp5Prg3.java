package project3;
import java.util.Scanner;
interface Shape
{
	final double PI=3.14;
}
class Circle implements Shape

{
	double Area(int r)
	{
		return PI*r*r;	
	} 
}
	
class Exp5Prg3{
	public static void main(String[] args) {
		Circle c1=new Circle();
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the radius");
		int n= input.nextInt();
		System.out.println("Area of Circle is"+c1.Area(n));
	}
	
}

