class con 
{
	private int s;
	public con(int r)
	{
	    
		s = r;
	   
	}
	public void show()
	{
		System.out.println("the value of r is " +s);
	}
 
	
 }

class check2
{
   public static void main(String[] args)
   {
      con c1 ;
	  c1 = new con(5);
	  c1.show();
	 
	  }
	  
}