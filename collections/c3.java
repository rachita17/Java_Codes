package collections;

import java.util.*;

public class c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s1=new HashSet();
		System.out.println(s1.isEmpty());
		s1.add("raman");
		s1.add("rahul");
		s1.add("ratz");
		s1.add("raman");
		s1.add("ishaan");
	    for(String obj:s1)
		{
			System.out.println(obj+" hascode:"+obj.hashCode());
		}
		System.out.println(s1.isEmpty());
		s1.remove("ratz");
		System.out.println("after removing:");
		for(String obj:s1)
		{
			System.out.println(obj);
		}

	}

}
