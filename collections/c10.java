package collections;
import java.util.*;
class Book{
	String name,author;
	int id,quantity;
	Book(String name,String author,int id,int quantity)
	{
		this.name=name;
		this.author=author;
		this.id=id;
		this.quantity=quantity;
	}
}
public class c10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Integer,Book> map=new HashMap<Integer,Book>();
       Book b1=new Book("biology","S.chand",1,10);
	 Book b2=new Book("let us c","ll",2,50);
	 Book b3=new Book("physics","h.k.verma",20,5);
	 map.put(1,b1);
	 map.put(2,b2);
	 map.put(3, b3);
	 for(Map.Entry<Integer, Book> hm:map.entrySet())
	 {
		 int key=hm.getKey();
		 Book b=hm.getValue();
		 System.out.println("for key "+key+" details are:"+ b.name+" "+ b.author+" "+ b.id+" "+ b.quantity);
		
	 }
	}

}
