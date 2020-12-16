class tables 
{
   synchronized void printTable(int n)
   {
      for(int i = 1; i<= 10; i++)
	  {
	     System.out.println(n*i);
		  
		/* try
		 {
		    Thread.sleep(1000);
			
		   }
		  catch(Exception e)
		  { 
			System.out.println(e);
		   }*/
		}
	}
}

class MyThread1 extends Thread
{
  tables t2;
  MyThread1(tables t2)
   {
    this.t2 = t2;
	
	}
	public void run()
	{
       t2.printTable(2);
     
    }
	
}

class MyThread2 extends Thread
{
   tables t1;
   MyThread2(tables t1)
  {
    this.t1 = t1;
	
	}
	public void run()
	{
       t1.printTable(8);
     
    }
}  
	   
class check
{
   public static void main(String[] Args)
   {
      tables d = new tables();
	  MyThread1 th1 = new MyThread1(d);
	  MyThread2 th2 = new MyThread2(d);
	  
	  th1.start();
	  th2.start();
	  
	 }
	 
}