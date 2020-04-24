package multithreading;
public class p1 extends Thread {
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		    try 
		    {
				p1.sleep(500);
			}
		    catch (InterruptedException e) 
		    {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println(i);
		}
		
	}

	public static void main(String args[]) {
		p1 t1=new p1();
		p1 t2=new p1();
		p1 t3=new p1();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		
		
	}

}
