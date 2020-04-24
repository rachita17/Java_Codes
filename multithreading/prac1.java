package practice;

import practice.Test;

class Test{
	synchronized public void printI()
	{
		System.out.println("I");
	}
	synchronized public void printAm()
	{
		System.out.println("Am");
		
	}

	synchronized public void printRachita()
	{
		System.out.println("Rachita");
		
	}

}
public class prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Test obj=new Test();
	     Thread t1 =new Thread()
	     {
	    	 public void run()
	    	 {
	    		 while(true)
	    		 {
	    		 obj.printI();
	    		 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		 }
	    		 
	    	 }
	    	 
	    	 
	     };
	     Thread t2 =new Thread()
	     {
	    	 public void run()
	    	 {
	    		 while(true)
	    		 {
	    		 obj.printAm();
	    		 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		 }
	    	 }
	    	 
	    	 
	     };
	     Thread t3 =new Thread()
	     {
	    	 public void run()
	    	 { while(true)
	    	 {
	    		 obj.printRachita();
	    		 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	 }
	    	 }
	    	 
	    	 
	     };
	     t1.start();
	     t2.start();
	     t3.start();
	}

}
