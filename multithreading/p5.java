package multithreading;
class Table{
	 synchronized public void table(int n) 
	{
		for(int i=1;i<6;i++)
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
class Thread1 extends Thread {
	Table t;
	Thread1(Table t){
		this.t=t;
	}
	public void run() {
		t.table(100);
	}
}
class Thread2 extends Thread {
	Table t;
	Thread2(Table t){
		this.t=t;
	}
	public void run() {
		t.table(5);
	}
}
public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj=new Table();
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
		t1.start();
		t2.start();

	}

}
