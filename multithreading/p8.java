package multithreading;
class Test {
	synchronized static void table(int n)
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
class ThreadA extends Thread{
	public void run()
	{
		Test.table(5);
	}
}
class ThreadB extends Thread{
   public void run()
	{
		Test.table(11);
	}
}
class ThreadC extends Thread{
	public void run()
	{
		Test.table(200);
	}
}
class ThreadD extends Thread{
	public void run()
	{
		Test.table(10);
	}
}

public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA t1= new ThreadA();
		ThreadB t2=new ThreadB();
		ThreadC t3=new ThreadC();
		ThreadD t4=new ThreadD();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

	}

}
