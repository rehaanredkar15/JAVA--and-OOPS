class SMT extends Thread 
{
  public void run()
  {
     for(int i = 1;i<=10;i++)
	 {
	    try
		{
		   Thread.sleep(1000);
		  
		  }
		  catch( Exception e)
		  {
		      System.out.println(e);
			  
			 }
	    
	     System.out.println(e);
      }
	 
	}
}

class stest 
{
   public static void main(String[] Args)
   {
      SMT t1 = new SMT();
      SMT t2 = new SMT();
	  
	  t1.start();
	  t2.start();
	 }
