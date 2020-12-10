class practice2
{
  public static void main(String[] Args)
   {
	   int n=1;
      for(int i=1;i<=5;i++)
	  {
         for(int j=4;j>=i;j--)
         { 
              System.out.print(" "); 

		 }
		 for(int k=1;k<=i;k++)
		 {
			 System.out.print(" "+k);
		 }
		 n++;
		 System.out.println();
	  }
    }
}