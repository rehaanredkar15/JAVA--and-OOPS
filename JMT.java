class JMT extends Thread 
{
  public void run()
  {
     for(int i = 1;i<=10;i++)
	 {
	    try
		{
		   Thread.sleep(1000);
		  
		  }
		  catch(Exception e)
		  {
		      System.out.println(e);
			  
			 }
	    
	     System.out.println(i);
      }
	 
	}
}

class stest1
{
   public static void main(String[] Args)
   {
     JMT t1 = new JMT();
     JMT t2 = new JMT();
     JMT t3 = new JMT();
	  
	  t1.start();
	  
	  try
	  {
		 t1.join(5000); 
		  
	  }
	  catch(Exception e) 
	  {
		  
	     System.out.println(e);

		 
	  }
	  t2.start();
	  t3.start();
	}
}