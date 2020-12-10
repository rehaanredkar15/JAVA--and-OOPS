class pattern11
{
	
	public static void main(String[] Args)
	{
		int u = 1;
		for(char i = 'B';i<'G';i++) 
		{
			for(char j = 'F';j>i;j--)  //runs 4 times only
			{
				System.out.print(" ");
			}
			for(char k = 'A';k<i;k++)
			{
				
			   System.out.print(k);
			}
			System.out.println();	
		}
		 
				
	}

}
/*

    A
   AB
  ABC
 ABCD
ABCDE

*/