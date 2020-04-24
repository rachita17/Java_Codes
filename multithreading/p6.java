package multithreading;
class Table5{
	synchronized public void table(int n)
	{
		for(int i=1;i<=5;i++)
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
public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Table5 obj=new Table5();
		Thread  t1=new Thread() {
			public void run()
			{
				obj.table(5);
			}
			
		};
		Thread  t2=new Thread() {
			public void run()
			{
				obj.table(100);
			}
			
		};
		t1.start();
		t2.start();

	}

}
