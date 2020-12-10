class mythread extends Thread 
{
   public void run()
   {
      for(int i = 0;i<=10;i++)
	  {
	  
	     System.out.println("child thread running");
		 
		}
    }
	
}


class test 
{
   public static void main(String[] Args)
   {
       mythread s1 = new mythread();
	   
	  s1.start();
      for(int i = 0;i<=10;i++)
      {
	     System.out.println("main thread running");
		}
	
		
	}
}