
class ptest 
{
	public static void main(String[] Args)
	{
	   person p1;
     
         p1 = new person();
         p1.setdata("rehan","peth",123);
          p1.show();
	}
	
	
	
	
}


class person
{
	private String name;
	private String city;
	private int mobno;
	
	
	public void setdata(String nm, String ct , int mn)
	{
		name = nm;
		city = ct;
		mobno = mn;

	}
	
	public void show()
	{
		System.out.println("name : " + name);
		System.out.println("city"+ city);
		System.out.println("monile no"+ mobno);

		
	}
	
	
}