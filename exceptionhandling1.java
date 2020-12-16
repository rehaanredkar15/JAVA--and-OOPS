class ef 
{
	public static void main(String[] Args)
	{
		
		try
		{
			int n = 50/0;
			System.out.println(n);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("kahihi zal tari tharly pramanech honar");
			System.out.println(" bcz its imp code always executed");
		}
		
	}
}

