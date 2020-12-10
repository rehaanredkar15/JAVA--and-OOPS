class mythread implements Runnable 
{
     public  void run()
	 {
	    for(int i =1;i<=10;i++)
		{
			System.out.println("child thread runnning");
			
	    }
	}
	
}

class testdemo
{
   public static void main(String[] Args)
   {
       mythread r = new mythread();
	   
	   Thread t1 = new Thread(r);
	   
	   
	   t1.start();
	   
      for(int i = 0;i<=10;i++)
      {
	     System.out.println("main thread running");
		 
		}
		
	}
}
    