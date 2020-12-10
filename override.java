class Baseclass
{
    public void method1()
	{
	    System.out.println("I am Baseclass");
	}
   
}

class childclass extends Baseclass
{
	 public void method1()
	 {
		 System.out.println("I am child class"); 
	 }

}

class vtest
{
    public static void main(String[] Args)
	{
	   Baseclass b1 = new Baseclass();
	   b1.method1();
	   
	   Baseclass b2 = new childclass();
	   b2.method1();
	   
	   childclass c1 = new childclass();
	   c1.method1();
	}
	
	
}