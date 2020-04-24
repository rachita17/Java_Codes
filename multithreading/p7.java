package multithreading;
class Table20
{
	public void table(int n)
	{
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(n*i);
			}
		}
	}
}
class Thread10 extends Thread{
	Table20 t;
	Thread10(Table20 t){
		this.t=t;
	}
	public void run() {
		t.table(5);
	}
}
class Thread20 extends Thread{
	Table20 t;
	Thread20(Table20 t){
		this.t=t;
	}
	public void run() {
		t.table(5);
	}
}

public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table20 obj=new Table20();
		Thread10 t1=new Thread10(obj);
		Thread20 t2=new Thread20(obj);
		t1.start();
		t2.start();
		
		

	}

}
