

class Person
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
	  System.out.println("name is "+name);
      System.out.println("city is" +city);	  
	   
   }

}


class student extends Person
{
	private int roll;
	private String cname;
	private int mark;
	public void setdata(String nm, String ct,int rn,String ch,int m1)
	{
		super.setdata(nm,ct);
		roll = rn;
		cname = ct;
		mark = m1;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("name is "+roll);
         System.out.println("city is" +cname);	
		 System.out.println("mark is" +mark);
		
	}
}

class htest
{
	public static void main(String[] Args)
	{
	   student s1;
	   s1 = new student();
	   
	   s1.setdata("tushar","kolhapur",101,"seti",98);
	   s1.showdata();
	}
	
}









+