package collections;

import java.util.HashMap;
import java.util.Map;

public class prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"rachita");
		hm.put(2,"shruti");
		hm.put(20, "jayant");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
		System.out.println("check if key 20 is present: "+hm.containsKey(20));
		System.out.println("check if key 5 is present:"+hm.containsKey(5));
		System.out.println("check if shruti is present:"+hm.containsValue("shruti"));
		System.out.println("All keys in hash map are:"+hm.keySet());
		System.out.println("all key value pair:"+hm.entrySet());
		
	}

}
