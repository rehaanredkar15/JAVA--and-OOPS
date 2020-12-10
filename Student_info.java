
class display 
{
	public static void main(String[] Args)
	{
	   student s1;
	   student s2;
     
         s1 = new student();
         s2 = new student();
         s1.setdata("rehan","peth",35,"cse","dypsn");
         s2.setdata("sakshi","peth",17,"cse","dypsn");
          s1.show();
          s2.show();
	}
	
	
	
	
}


class student
{
	private String name;
	private String city;
	private String branch;
	private String college_name;
	private int rollno;
	
	
	public void setdata(String nm, String ct , int mn,String br,String clgnm)
	{
		name = nm;
		city = ct;
		rollno = mn;
		branch = br;
		college_name = clgnm;

	}
	
	public void show()
	{
		System.out.println("name : " + name);
		System.out.println("city"+ city);
		System.out.println("roll  no"+ rollno);
		System.out.println("branch"+ branch);
		System.out.println("college name"+ college_name);
		System.out.println();

		
	}
	
	
}