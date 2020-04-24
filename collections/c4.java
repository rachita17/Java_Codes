package collections;
import java.util.*;
public class c4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//diiferent types of collections
		HashSet<String> set=new HashSet();
		set.add("ram");
		set.add("ratz");
		set.add("ishaan");
		System.out.println("before:");
		for(String obj:set)
		{
			System.out.println(obj);
		}
		ArrayList<String> set1=new ArrayList();
		set1.add("ram");
		set1.add("rishabh");
		set1.add("harsh");
		set.addAll(set1);
		System.out.println("after");
		for(String obj:set)
		{
			System.out.println(obj);
		}
	}

}
