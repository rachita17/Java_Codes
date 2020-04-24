import java.util.*;
public class Exp2P4 {

	public static void main(String[] arr) {
		// TODO Auto-generated method stub
	    int r=0;
       int a=  Integer.parseInt(arr[0]);
       int b=  Integer.parseInt(arr[1]);
       Scanner s1 = new Scanner(System.in);
       System.out.println("enter operation to be performed:");
       String op= s1.next();
       if(op=="*") {
    	   r=a*b;
       }
       if(op=="+") {
    	   r= a+b;
       }
       if(op=="-") {
    	   r = a-b;
       }
       if(op=="/") {
    	   r = a/b;
       }
       System.out.println("result is:"+r);
       
       }
	}


