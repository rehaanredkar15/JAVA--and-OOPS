class pattern12
{
    public static void main(String[] Args)
	{
		int j = 0;
	   
	   for(int i = 5;i>=1;i--)
	   {
	      for(j = 4;j>=i;j--)
		  {
		  
		     System.out.print(" ");  
		  }
		    for(int k = 1;k<=i;k++)
		   {
		    	System.out.print("*");  
		    }

		  System.out.println();  
			  }
	 }
	 
}