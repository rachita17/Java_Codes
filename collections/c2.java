package collections;
import java.util.*;

public class c2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al =new ArrayList<String>();
		System.out.println("is array empty:"+al.isEmpty());
		al.add("Ravi");
		al.add("ram");
		al.add(1,"rachita");
		al.remove(0);
	
		Iterator itr1=al.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("is array empty:"+al.isEmpty());
		ArrayList<String> a2 =new ArrayList<String>();
		a2.addAll(al);
		a2.add("ishaan");
		a2.add("rama");
		
		a2.retainAll(al);
		
		System.out.println("printing the common elements");
		Iterator itr=a2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
