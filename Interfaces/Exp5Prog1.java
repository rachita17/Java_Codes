package project3;
import java.util.Scanner;
interface test 
{  
    void square(int a); 
} 
  
class Arithmetic implements test 
{ 
    public void square(int a) 
    { 
        System.out.println("Square of Number is"+a*a); 
    } 
}
public class Exp5Prog1 
{
    public static void main(String[] args) 
    { 
        int n;
    	System.out.println("Enter the number:");
        Scanner input= new Scanner(System.in);
        n= input.nextInt();
    	Arithmetic a = new Arithmetic(); 
        a.square(n);  
    } 
}
