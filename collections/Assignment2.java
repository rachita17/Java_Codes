package collections;
import java.util.*;
import java.util.Scanner;
class counting
{	
  void frequencycountinger(ArrayList<String> l)
     {
        HashSet<String> h1 = new HashSet<String>();
        h1.addAll(l);
        int counting =0;
        Iterator<String> itr = h1.iterator();
        while(itr.hasNext())
        {
        	counting =0;
  	        String s2 = itr.next();
  	        for(int j =0;j<l.size();j++)
  	        {
  	        	if(l.get(j).equals(s2))
  		        {
  	        		counting++; 
  		        }
  	     }
  	    System.out.println(s2+" "+counting);          }
	 }
}
public class Assignment2 {
		
		public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	      System.out.println("Enter first paragraph");
	      String s1 = in.nextLine().toLowerCase();
	      System.out.println("Enter Second paragraph");
	      String s2 = in.nextLine().toLowerCase();
	      ArrayList<String> l1 = new ArrayList<String>(Arrays.asList(s1.split(" ")));
	      ArrayList<String> l2 = new ArrayList<String>(Arrays.asList(s2.split(" ")));
	      counting c1 = new counting();
	      System.out.println("Words frequency in the first paragraph");
	      c1.frequencycountinger(l1);
	      System.out.println("Words frequency in the Second paragraph");
	      c1.frequencycountinger(l2);
	      l1.retainAll(l2);
	      if(l1.isEmpty())
	      {
	    	  System.out.println("No words in comman");
	      }
	      else 
	      {
	    	  System.out.println("Common words from both the  paragraph: "+ l2);
	      }
	}
}
