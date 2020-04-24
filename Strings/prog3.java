import java.util.Scanner;
public class prog3 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		String t1="";
		System.out.println("Enter word:");
		Scanner s1=new Scanner(System.in);
		String str =s1.nextLine();
		String strArr[]=str.split(" ");
		int count[]=new int[strArr.length];
		System.out.println(" Enter Key:");
		int k=s1.nextInt();
	    char count1[] = new char[50];
		for (int i=0;i<strArr.length;i++)
		{
			String st=strArr[i].toLowerCase();
			char charArr[] = st.toCharArray();
			for(int j=0;j<charArr.length;j++)
			{
				temp=charArr[j];
				if(temp>=97&&temp<=122)
				{
					temp=temp+k;
					if(temp>122)
					{
						temp=temp-26;
					}
				}
				
			 count1[j]= (char) temp;
			t1=t1+count1[j];
			}
			
		}
		System.out.println(t1);
	
		
	}

	}


