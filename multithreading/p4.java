package multithreading;

public class p4 extends Thread
{
	public void run()
	{
		System.out.println("thread run method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p4 t1=new p4();
		p4 t2=new p4();
		p4 t3=new p4();
		System.out.println("priority of t1:"+t1.getPriority());
		System.out.println("priority of t2:"+t2.getPriority());
		System.out.println("priority of t3:"+t3.getPriority());
	
		t1.setPriority(2);
		t2.setPriority(10);
		t3.setPriority(5);
		System.out.println("priority of t1:"+t1.getPriority());
		System.out.println("priority of t2:"+t2.getPriority());
		System.out.println("priority of t3:"+t3.getPriority());
		System.out.println("priority is :"+Thread.currentThread().getPriority());
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		

	}

}
