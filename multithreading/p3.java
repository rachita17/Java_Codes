package multithreading;

public class p3 extends Thread {
	public void run()
	{
		System.out.println("run of p3 class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p3 t1=new p3();
		p3 t2=new p3();
		t1.start();
		
		System.out.println("name of thread t1 is:"+t1.getName());
		System.out.println("id of thread is"+t1.getId());
		System.out.println("name of current thread is:"+Thread.currentThread().getName());
		int i=Integer.parseInt(Thread.currentThread().getName());
		t1.setName("rachita");
		System.out.println("name of thread t1 is:"+t1.getName());
		
		t2.start();
		System.out.println("name of thread t2 is:"+t2.getName());
		System.out.println("id of thread is"+t2.getId());
		System.out.println("name of current thread is:"+Thread.currentThread().getName());

	}

}
