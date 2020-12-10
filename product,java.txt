
class  payments1
{
	public static void main(String[] Args)
	{
     	 employee s1;
     	 employee s2;
     
         s1 = new employee();
         s2 = new employee();
         s1.setdata("rehan",350,25);
         s2.setdata("kaif",250,17);
          s1.show();
          s2.show();
		  s1.payments();
		  s2.payments();
	}
	
	
	
	
}


class employee
{
	private String name;
	private int wages;
	private int working_days;
	
	
	public void setdata(String nam , int wg,int wd)
	{
		name = nam;
		wages  = wg;
		working_days= wg;

	}
	
	public void show()
	{
		System.out.println("name : " + name);
		System.out.println("wages"+ wages);
		System.out.println("working_days"+ working_days);
		System.out.println();
	}
	
    public void payments()
	{
		double payment = working_days*wages;
		
	    System.out.println("the payment is "+ payment);

	    if(payment > 25000)
		{
		    
			payment = payment * 0.82;
			System.out.println("the gst is "+ payment);
		}
		else
		{
			System.out.println("the gst  is not aplicable");
		}
			
	}
	 
	
	
	
	
}