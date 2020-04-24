package collections;
import java.util.*;
class Student{
	String name;
	int rollno;
	Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	
}
public class c9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Student> list=new ArrayList<Student>();
      Student s1=new Student("rachita",1);
      Student s2=new Student("anku",10);
      Student s3=new Student("nonu",51);
      list.add(s1);
      list.add(s2);
      list.add(s3);
      Iterator itr=list.iterator();
      while(itr.hasNext())
      {
    	 Student st =(Student) itr.next();
    	  System.out.println("name is:"+st.name+"roll no is:"+st.rollno);
      }
	}

}
