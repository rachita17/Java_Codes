package collections;
import java.util.*;

public class prog1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	    ArrayList<String> list1=new ArrayList<String>();
        list1.add("rachita");
        list1.add("shruti");
        list1.add("anku");
        Iterator itr=list1.iterator();
        System.out.println("printing values of array list 1:");
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        ArrayList list2=(ArrayList) list1.clone();
        list2.add("raman");
        System.out.println("printing values of duplicate arraylist:");
        Iterator itr1=list2.iterator();
        while(itr1.hasNext())
        {
        	System.out.println(itr1.next());
        }
       Collections.reverse(list1);
       System.out.println("after reversing:");
      for(String str:list1)
      {
    	  System.out.println(str);
      }
        
 
 
 }

}
