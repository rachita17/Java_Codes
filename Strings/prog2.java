import java.util.Scanner;
public class prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s1=new Scanner(System.in);
       System.out.println("enter paragraph:");
       String str=s1.nextLine();
       String strArr[] =str.split("");
       int count[] =new int[strArr.length];
       for(int i=0;i<strArr.length;i++) {
    	   
    	   String st=strArr[i].toLowerCase();
    	   char charArray[]=strArr[i].toCharArray();
    	   int sum=0;
    	   for(int k=0;k<charArray.length;k++) {
    		   if(charArray[k]=='a'||charArray[k]=='e'||charArray[k]=='i'||charArray[k]=='o'||
    			charArray[k]=='u')
    			   sum++;
    			   
    	   }
    	   count[i]=sum;
       }
       for(int i=0;i<strArr.length;i++) {
    	   System.out.println(strArr[i]+" "+count[i]);
       }
       
	}

}
