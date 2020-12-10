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
		System.out.println(name);
		System.out.println(city);
	}
}

class consumer extends person
{
	private String pname;
	private int price;
	private int  quantity;
	
	public void setdata(String nm,String ct,String pn,int p,int q)
	{
    	super.setdata(nm,ct);
		pname = pn;
		price = p;
		quantity = q;
		
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("the product name is " +pname);
		System.out.println("the price of the product  is " +price);
		System.out.println("the quantity of the product  is " +quantity);
		
	}
	public void bill()
	{
		int bill = price * quantity;
		System.out.println("the bill name is " +bill);
		
	}
}

class ptest
{
	public static void main(String[] Args)
	{
	consumer c1;
	c1 = new consumer();
	
	c1.setdata("Rehan","kolhapur","parle",19,2);
	c1.showdata();
	c1.bill();
	}

}


