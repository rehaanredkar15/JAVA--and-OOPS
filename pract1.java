class practice1
{
   public static void main(String[] Args)
   {
	  int n=5;
      for(int i =1;i<=5;i++)
	  { 
		  for(int j = 2;j<=i;j++)
		  {
			 
             System.out.print(" ");
   
		    }
		   for(int k =5;k>=i;k--)
		   {
			   System.out.print(" "+n);
		   }
		   n--;
		   System.out.println();
        }
		
     }
}