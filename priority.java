class PMT extends Thread
{
     public void run()
	 {
		
		// System.out.println("running thread name is"+ Thread.currentThread().getName());
		
		System.out.println("running thread priority is  "+ Thread.currentThread().getPriority()+" and the name is "+ Thread.currentThread().getName());
	 
	 
	   //System.out.println("running thread Id is "+ Thread.currentThread().getId());	
	 }
	 
	 
}

class ptest
{
	public static void main(String[] args)
	{
		PMT t1 = new PMT();
		PMT t2 = new PMT();
		PMT t3 = new PMT();
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
	
   /*    Priorities are just a suggestion to the scheduler.
        The only way to guarantee that one particular thread executes before another is to do it yourself
		
		using ExecutorService or ForkJoinPool gives better control on your threads */
		t1.setName("lease prior");
		t3.setName("most prior");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}