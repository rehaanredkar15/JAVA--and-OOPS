class NMT extends Thread 
{
  public void run()
  {
     System.out.println("Thread is Running");
	
	}
	
}

class stes2
{
   public static void main(String[] Args)
   {
     NMT t1 = new NMT();
     NMT t2 = new NMT();
     NMT t3 = new NMT();
	  
	 
	 System.out.println("before Naming Ceremony of t1" +t1.getName());
	 System.out.println("before Naming Ceremony of t2" +t2.getName());
	 System.out.println("before Naming Ceremony of t3" +t3.getName());
	  
	  t1.start();
	  t2.start();
	  t3.start();
	  
	  t1.setName("Sakshi");
	  t2.setName("Rehan");
	  t3.setName("Tushar");
	 
	 System.out.println("After Naming Ceremony of t1" +t1.getName());
	 System.out.println("After Naming Ceremony of t2" +t2.getName());
	 System.out.println("After Naming Ceremony of t3" +t3.getName());
	  
	}
}