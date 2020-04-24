package multithreading;
class Item
{
	int count=0;
	synchronized public void consume()
	{
		System.out.println("going to consume");
		while(count==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		count--;
		System.out.println("item is consumed");
	}
	synchronized public void produce()
	{
		System.out.println("produce the resource");
		count++;
		notify();
	}
}
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item obj=new Item();
		Thread t1=new Thread()
				{
			public void run()
			{
				obj.consume();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				};
				Thread t2=new Thread()
				{
			public void run()
			{
				obj.produce();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				};

	}

}
