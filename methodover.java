class testsum
{
   public void sum(int a,int b)
   {
     int s = a+b;
	 System.out.println("addition is "+s);
     }
     
	 public void sum(int a,int b,int c)
	 {
	    int s = a + b + c;
		System.out.println("the addition is "+s);
	 }
 }
 
 class testing
 { 
     public static void main(String[] Args)
	 {
	    testsum s1;
		s1 = new testsum();
		s1.sum(10,20);
		s1.sum(10,20,30);
	 }
}