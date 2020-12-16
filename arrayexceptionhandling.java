class s2
{
   public static void main(String[] Args)
   {
	   try
	   {
		   int r[] = new int[5];
		    r[5] = 50/10;
		   System.out.println(r[5]);
	   }
	   catch(ArithmeticException e1)
	   {
		   System.out.println(e1);
		   
	   }  
	   catch(ArrayIndexOutOfBoundsException e2)
	   {
		   System.out.println(e2);
		   
	   }
	  catch(Exception e3)
	   {
		 System.out.println(e3);
	   }
	   System.out.println("Rahilele Program");
	 }
}

