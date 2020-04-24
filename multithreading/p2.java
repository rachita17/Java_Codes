package multithreading;

public class p2 implements Runnable
 {
	public void run()
	{
		System.out.println("implementing runnable interface");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p2 t1=new  p2();
		Thread t2=new Thread(t1);
		t2.start();
	

	}

}
