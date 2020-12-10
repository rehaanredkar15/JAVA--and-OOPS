

class circle
{
    private int x;
	public circle(int r)
	{
	   x = r; 
	   
	}
   public void area()
   {
       double a = 3.14 *x*x;
	  System.out.println("Area of circle"+a);
	}
	
 }
 
 class ctest
 {
   
   public static void main(String[] Args)
   {
     circle c1;
	 
	 c1 = new circle(5);
	 	 c1.area();
   
     circle c2;
	 c2 = new circle(9);
	 c2.area();
    
 
 
 
     }
}