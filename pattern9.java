class pattern9
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
			for(int k = 0;k<i;k++)
			{
				
			   System.out.print(i);
			   
			}
			u++;
			System.out.println();	
		}
		 
				
	}

}
	
/*	
    1
   22
  333
 4444
55555
	*/