 class DMT extends Thread 
 {
    public void run()
	{
	    if(Thread.currentThread().isDaemon())
		{
		    System.out.println("amhi apnas bheun seves tatpar ahot "+Thread.currentThread().getName());
			
		}
		else
		{
			System.out.println(" Hey i am user Thread " + Thread.currentThread().getName());
		}
	}
 }
 
 class Dtest
 {
	 public static void main(String[] args)
	 {
		 
		 DMT t1 = new DMT();
		 DMT t2 = new DMT();
		 DMT t3 = new DMT(); 
		 
		 t1.setName("Rehan");
		 t2.setName("Sakshi");
		 t3.setName("FortunerWale");
		 
		 t3.setDaemon(true);
		 
		 t1.start();
		 t2.start();
		 t3.start();
		 
		 
	 }
	
 }
		 
		 