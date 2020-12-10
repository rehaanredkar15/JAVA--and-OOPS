class Rbi
{
    public int Roi()
	{
	   return 0;
	}
}


class sbi extends Rbi
{
    public int Roi()
	{
	   return 7;
	}
}


class axis extends Rbi
{
    public int Roi()
	{
	   return 11;
	}
}

class Boi extends Rbi
{
    public int Roi()
	{
	   return 8;
	}
}


class Vtest 
{
     public static void main(String[] Args)
	 {
	     sbi s1 = new sbi();
		 axis a1 = new axis();
		 Boi b1 = new Boi();
		 
		 System.out.println("the roi is:"+s1.Roi());
		 System.out.println("the roi is:"+a1.Roi());
		 System.out.println("the roi is:"+b1.Roi());
		 
		 }
}
		 
		 
	