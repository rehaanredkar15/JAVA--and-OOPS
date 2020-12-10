
class product1
{
	public static void main(String[] Args)
	{
     	 product2 s1;
     	 product2 s2;
     
         s1 = new product2();
         s2 = new product2();
         s1.setdata("iphone",10000,5);
         s2.setdata("macair",20000,7);
         s1.show();
         s2.show();
	     s1.bill();
	     s2.bill();
	}
	
	
	
	
}


class product2
{
	private String name;
	private int price;
	private int quantity;
	
	
	public void setdata(String nam , int pr,int qt)
	{
		name = nam;
		price  = pr;
		quantity= qt;

	}
	
	public void show()
	{
		System.out.println("name : " + name);
		System.out.println("price"+ price);
		System.out.println("quantity"+ quantity);
		System.out.println();
	}
	
    public void bill()
	{
		double payment = price*quantity;
		
	    System.out.println("the bill is without discount is "+ payment);

	    if(payment > 5000)
		{
		    
			payment = payment * 0.80;
			System.out.println("the final bill is "+ payment);
		}
		else
		{
			System.out.println("the discount  is not aplicable");
		}
			
	}
	 
	
	
	
	
}