class pattern10
{
	
	public static void main(String[] Args)
	{
		int u = 1;
		for(int i = 1;i<6;i++)
		{
			for(int j = 5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k = i;k>0;k--)
			{
				
			   System.out.print(k);
			   
			}
			System.out.println();	
		}
		 
				
	}

}
/*	
    1
   21
  321
 4321
54321

*/