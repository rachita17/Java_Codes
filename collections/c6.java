package collections;
import java.util.*;
import java.util.Map.Entry;
public class c6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Rachita");
		hm.put(2,"anku");
		hm.put(3,"nonu");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
		hm.putIfAbsent(4,"Ram");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
		}
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	map.putAll(hm);

}
