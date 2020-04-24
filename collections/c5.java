package collections;
import java.util.*;
public class c5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set=new TreeSet<String>();
		set.add("ishaan");
		set.add("raman");
		set.add("");
		for(String obj:set)
		{
			System.out.println(obj);
		}
		System.out.println("highest value"+set.pollLast());
		System.out.println("lowest value"+set.pollFirst());
		System.out.println("reverse order of set:"+set.descendingSet());
		System.out.println("Descending order");
		Iterator itr=set.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		

	}

}
