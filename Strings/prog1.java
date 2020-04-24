import java.util.*;
public class prog1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Enter string:");
		Scanner s1=new Scanner(System.in);
		String st=s1.nextLine();
		String strArr[]=st.split(",");
		int count[]=new int[strArr.length];
		for (int i=0;i<strArr.length;i++)
		{
			int sum=0;
			for(int j=0;j<strArr.length;j++)
			{
				if(strArr[i].equals(strArr[j]))
					{
						sum++;
					}
				
				count[i]=sum;
			}
		}
		for(int k=0;k<strArr.length;k++)
		{
			System.out.println(" Frequency of word :"+strArr[k]+" is: "+count[k]);
		}
      
	}

}
