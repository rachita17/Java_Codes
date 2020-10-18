package ArrayCodes;import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array=new String[10];
		ArrayList<String> list1= new ArrayList<String>(Arrays.asList(array));
		ArrayList<Integer> list2= new ArrayList<Integer>();
		list2.add(1);
		list2.add(16);
		list2.add(71);
		Integer[] arr=new Integer[list2.size()];
		list2.toArray(arr);
		for(int value: arr)
		{
			System.out.print(value+" ");
		}

	}

}
