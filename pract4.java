class practice4
{
  public static void main(String[] Args)
   {
	   char n='A';
      for(int i=1;i<=9;i++)
	  {
		
         for(int j=8;j>=i;j--)
         { 
              System.out.print(" "); 

		 }
		 for(int k=1;k<=i;k++)
		 {
			 System.out.print(" "+n);
		 }
		 n++;
		 n++;
		 System.out.println();
		 i++;
	  }
    }
}