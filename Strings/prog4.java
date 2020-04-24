import java.util.Scanner;
public class prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		System.out.println(" Enter  string:");
		Scanner s1=new Scanner(System.in);
		String str=s1.nextLine();
		String strArray[]=str.split(", ");
		int i=0;
		int j=strArray.length-1;
		while(i<=j)
		{
			if(!strArray[i].equalsIgnoreCase(strArray[j]))
				break;
			i++;
			j--;
		}
		if(i>j)
			System.out.println("palidrome");
		else
			System.out.println("not palindrome");
			}
}

	
