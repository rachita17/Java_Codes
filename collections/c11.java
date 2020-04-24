package collections;
import java.util.*;
class Student1 implements Comparable<Student1>
{
	int roll;
	String name;
	int age;
	Student1(int roll,String name,int age)
	{
		this.roll=roll;
		this.name=name;
		this.age=age;
	}
	
	public int compareTo(Student1 st) {
		// TODO Auto-generated method stub
		if(age==st.age)
		return 0;
		if(age>st.age)
		return 1;
		else
		return -1;
	}
}
public class c11 {

	public static void main(String[] args) {
		ArrayList<Student1> al=new ArrayList<Student1>();
	 Student1 s1=new Student1(53,"ratz",20);
	 Student1 s2=new Student1(5,"nonu",30);
	 Student1 s3=new Student1(13,"anku",10);
	 al.add(s1);
	 al.add(s2);
	 al.add(s3);
	 Collections.sort(al);
	 for(Student1 sl:al)
	 {
		 System.out.println(sl.roll+" "+ sl.name+" "+sl.age);
	 }

	}

}
