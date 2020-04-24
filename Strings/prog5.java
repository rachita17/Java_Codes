import java.io.*;
public class prog5 {
public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	BufferedReader r1= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("First Paragraph:");
		String str1=r1.readLine();
		System.out.println("Second Paragraph:");
		String str2=r1.readLine();
		String temp;
		String str3=(str1+" "+str2);
		String str4[]=str3.split(" ");
		int len =str4.length;
		for (int i = 0; i < len; i++) 
	    {
	        for (int j = i + 1; j < len; j++) 
	        {
	            if (str4[i].compareTo(str4[j])>0) 
	            {
	                temp = str4[i];
	                str4[i] = str4[j];
	                str4[j] = temp;
	            }
	        }
	    }
	    for (int i = 0; i < str4.length ; i++) 
	    {
	        System.out.print(str4[i] + " ,");
	    }
	   
		
}
}