class person
{
   private String name;
   private String city;
   
   public void setdata(String nm,String ct)
   {
      name = nm;
	  city = ct;
    }
	public void showdata()
	{  
	     System.out.println();
		System.out.println(name);
		System.out.println(city);
	}
}

class savingsacc extends person
{
	private int accno;
	private int  balance;
	
	public void setdata(String nm,String ct,int an,int b)
	{
    	super.setdata(nm,ct);
		accno = an;
		balance = b;
		
	}
	public void deposit(int d)
	{
	     balance = balance - d;

	}

	public void withdraw(int w)
	{
		 if(w>balance)
		 {
			 System.out.println("the balance is insufficient");
			 
		 }
		 else
		 {
			 
	          balance = balance - w;
			  
		 }
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("the account  no is " +accno);
		System.out.println("the balance of the account is " +balance);
		
	}
	
}


class fixeddeposit extends person
{

	private int year;
	private int bal;
	private double roi;
	private double maturity;
	
	
	public void setdata(String nm,String ct,int yr,int b,double ro)
	{
    	super.setdata(nm,ct);
		year = yr;
		bal = b;
		roi = ro;
		
	}
	
	public void showdata()
	{
		super.showdata();
		System.out.println("the years for the maturity of the fixed deposit are " +year);
		System.out.println("the roi of fd is " +roi );
		System.out.println("the deposited amount  is " +bal );
		
		
	}
	
	public void maturityamt()
	{
	     maturity = bal + (bal * roi)*year;
		System.out.println("the maturity amount of the fd  is " +maturity );
	}
}

class worker extends person
{
	
	private int wages;
	private int wday;
	private int payment1;
	
	public void setdata(String nm,String ct,int wg, int wd)
	{
    	super.setdata(nm,ct);
		wages = wg;
		wday = wd;	
	 }
	 
	 public void showdata()
	 {
		 super.showdata();
		 System.out.println("the wages for the worker is :"+wages);
		 System.out.println("the working days of the worker is :"+wday);
	   }
    
	public void payment()
	{
	     
          payment1= wages * wday;
         
		 System.out.println("the payment of the worker is"+payment1);
	}
	
}




class bank
{
	public static void main(String[] Args)
	{
	    savingsacc c1;
	    c1 = new savingsacc();
	
	    c1.setdata("luminious","kolhapur",12,50000);
		c1.deposit(2000);
		c1.withdraw(1000);
	    c1.showdata();
	     

         fixeddeposit m1;
	     m1 = new fixeddeposit();
		 
        m1.setdata("waag","wadinge",5,50004,0.10);
         m1.showdata();
		 m1.maturityamt();
		 
		 worker w1;tftdf7if76f
		 w1 = new worker(); 
		 
		 w1.setdata("kaif","kolhapur",500,30);
		 w1.showdata();
		 w1.payment();

		 
	}

}


