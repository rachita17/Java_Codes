package multithreading;




class TestTable {
	synchronized void table(int n)
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(n*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Threada extends Thread{
	TestTable t;
	Threada(TestTable t){
		this.t=t;
	}
	public void run()
	{
		t.table(5);
	}
}
class Threadb extends Thread{
	TestTable t;
	Threadb(TestTable t){
		this.t=t;
	}
	public void run()
	{
		t.table(11);
	}
}
class Threada extends Thread{
	TestTable t;
	Threada(TestTable t){
		this.t=t;
	}
	public void run()
	{
		t.table(200);
	}
}
class Threadd extends Thread{
	TestTable t;
	Threadd(TestTable t){
		this.t=t;
	}
	public void run()
	{
		t.table(10);
	}
}

public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestTable obj=new TestTable();
		Threada t1= new Threada(obj);
		Threadb t2=new Threadb(obj);
		Threada t3=new Threada(obj);
		Threadd t4=new Threadd(obj);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

	}

}

