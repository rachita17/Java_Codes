package collections;
import java.util.*;
public class prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("rachita");
		list.add("shruti");
		list.add("jayant");
		HashSet<String> set=new HashSet<String>();
		set.add("anku");
		set.addAll(list);
		System.out.println("values copied from different collection in hash set are:");
		for(String str:set)
		{
			System.out.println(str);
		}
		set.clear();
		System.out.println("removed all values from set.");
	    System.out.println("search if shruti is there in set? "+set.contains("shruti"));
	    set.add("shruti");
	    System.out.println("search if shruti is there in set? "+set.contains("shruti"));
	}

}
