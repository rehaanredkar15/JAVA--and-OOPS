
class  payments1
{
	public static void main(String[] Args)
	{
     	 employee s1;
     	 employee s2;
     	 employee s3;
     
         s1 = new employee();
         s2 = new employee();
         s3 = new employee();
         s1.setdata("rehan",3050,25);
         s2.setdata("kaif",2050,17);
         s3.setdata("tejas",1050,27);
          s1.show();
          s2.show();
          s3.show();
   		 double py1 = s1.payments();
		  double py2 =  s2.payments();
		  double py3 = s3.payments();
		double sum = py1 + py2 + py3;		 
	    System.out.println("the total payment of the employees is " + sum);
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
		working_days= wd;

	}
	
	public void show()
	{
		System.out.println("name : " + name);
		System.out.println("wages"+ wages);
		System.out.println("working_days"+ working_days);
		System.out.println();
	}
	
    public double payments()
	{
		double payment = working_days*wages;
		
	    System.out.println("theindividual  payment of the employee without calculating gst is "+ payment);

	    if(payment > 25000)
		{
		    
			payment = payment * 0.82;
			System.out.println("the individual payment including is "+payment);

		   return payment;
		}
		else
		{
			System.out.println("the gst  is not aplicable");
			return payment;
		}
			
	}
	 
	
	
	
	
}

