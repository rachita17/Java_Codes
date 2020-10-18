package ArrayCodes;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1= {"Ram","r","ra"};

		String[] arr2= {"r","rajat","ram","rask"};
		HashSet<String> hs1=new HashSet<String>(Arrays.asList(arr1));
		HashSet<String> hs2 =new HashSet<String>(Arrays.asList(arr2));
		hs1.retainAll(hs2);
		System.out.println(hs1);
		

	}

}
