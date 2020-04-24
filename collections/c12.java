package collections;
import java.util.*;

class Test
{
	String name;
	int roll;
	Test(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}
}
class rollComparator implements Comparator<Test>
{
	public int compare(Test t1, Test t2) {
		// TODO Auto-generated method stub
		if(t1.roll==t2.roll)
		return 0;
		else if(t1.roll>t2.roll)
			return 1;
		else
			return -1;
	}
	
}
class nameComparator implements Comparator<Student>
{
	public int compare(Student t1, Student t2) {
		// TODO Auto-generated method stub
		return t1.name.compareTo(t2.name);
	}
	
}
public class c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Test("ratz",20));
		list.addAll((Collection<? extends Student>) new Test("ratz",20));
		Collections.sort(list,new rollComparator());
		Collections.sort(list,new nameComparator());

	}

}
