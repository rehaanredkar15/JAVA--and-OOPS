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

class employee extends person
{
	private int employeeid;
	private String post;
	private int  salary;
	
	public void setdata(String nm,String ct,int ed,String p,int s)
	{
    	super.setdata(nm,ct);
		employeeid = ed;
		post = p;
		salary = s;
		
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("the employeeid name is " +employeeid);
		System.out.println("the post of the product  is " +post);
		System.out.println("the salary of the product  is " +salary);
		
	}
}


class manager extends employee
{
	private String deptname;
	private int comission;
	
	public void setdata(String nm,String ct,int ed,String p,int s,String dn)
	{
    	super.setdata(nm,ct,ed,p,s);
		deptname = dn;
		comission = s * 10;
		
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("the manager name department is" +deptname);
		System.out.println("the comission of the manager is " +comission);
		
	}
}

class otest
{
	public static void main(String[] Args)
	{
	employee c1;
	c1 = new employee();
	
	manager m1;
	m1 = new manager();
	
	c1.setdata("luminious","kolhapur",12,"developer",50000);
	c1.showdata();
	m1.setdata("waag","wadinge",1,"manager",50004,"cse");
    m1.showdata();
	}

}


