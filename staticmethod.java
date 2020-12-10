class student
{  
    private String Name;
	private int rollno;
	static private String collegename="SETI";
	
	public student(int rn,String nm)
	{
	    rollno = rn;
		Name =nm;
	
	}
	
	
	public static void change()
	{
		 
		 collegename = "KIT";
	}
	   
	public void showdata()
	{
       System.out.println("the rollno is : "+rollno);
       System.out.println("the name is : "+Name);
       System.out.println("the collegename is : "+collegename);
	}
}

class stest
{
	  public static void main(String[] Args)
	  {
		  student s1;
		  student.change();
		  s1 = new student(40,"dola");
		  s1.showdata();
		  
		  student s2;
		  
		  s2 = new student(8,"shivani");
		  s2.showdata();
		  
		  student s3;
		  
		  s3 = new student(16,"tushar");
		  s3.showdata();
	  }
}