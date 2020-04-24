package collections;

import java.util.*;

public class c7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashSet<String> set=new HashSet<String>();
       set.add("raman");
       set.add("rahul");
       set.add("raj");
       System.out.println("enter name of student to check:");
       Scanner s1=new Scanner(System.in);
       String name=s1.nextLine();
       if(set.contains(name))
       {
    	   System.out.println(name+" found");
       }
       else
    	   System.out.println(name+" not found");
       
	}

}
