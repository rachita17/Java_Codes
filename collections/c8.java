package collections;
import java.util.*;

public class c8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		Collections.copy(list1, list);
		Collections.max(list);
		ArrayList<String> list2 =new ArrayList<String>();
		list2.add("ram");
		list2.add("ishika");
		list2.add("anku");
		Collections.sort(list2,Collections.reverseOrder());
		
		
		

	}

}
