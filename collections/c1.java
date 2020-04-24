package collections;
import java.util.ArrayList;
import java.util.Iterator;

public class c1 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("rachita");
		list1.add("ishaan");
		list1.add("raj");
		for(String obj:list1)
		{
			System.out.println(obj);
		}
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("raman");
		list2.add("ram");
		list2.add("rama");
		Iterator itr=list2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
