class testarea
{
       private int l;
       private int h;
       private int b;
      private int r;
   public void area(int a)
   {
       r = a;
      double area = 3.14*r*r;
	 System.out.println("area of circle is "+area);
    }
     
	 public void area(int a,int d)
	 {
	     l =a;
		 b = d;
	    double area = l*b;
		System.out.println("the area of rect is "+area);
	 }
	  public void area(int a,int d,int c)
	  {
	     l = a;
		 b = d;
		 h = c;
		 double area = l * b * h;
		 System.out.println("area of box is "+area);
		}

 }
 
 class testing
 { 
     public static void main(String[] Args)
	 {
	    testarea s1;
		s1 = new testarea();
		s1.area(5);
		s1.area(10,8);
		s1.area(1,2,3);
	 }
}