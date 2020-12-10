class Box 
{  
   private int len = 0;
   private int bre = 0;
   private int hei = 0;

   public void setdata(int l,int b,int h)
   {
     len = l;
	 bre = b;
	 hei = h;
    }
	public void showdata()
	{
	  System.out.println("length  is " +len);
	  System.out.println("breadth  is " +bre);
	  System.out.println("heigth  is " +hei);
	}
	
	public int volume()
	{
	  int v = len * bre * hei;
	   
	   return v;
	
	}


}

class vtest
{
   public static void main(String[] Args)
   {
   
      Box b1;
	  b1 = new Box();
	  
	  
	  b1.setdata(10,20,30);
	  b1.showdata();
	  int vb1 = b1.volume();
	  
	  System.out.println("volume of box b1 : " +vb1);
	  
	  Box b2;
	  b2 = new Box();
	  
	  b2.setdata(2,4,5);
	  b2.showdata();
	  int vb2 = b2.volume();
	  	  System.out.println("volume of box b2 : " +vb2);

	  
	  int vb = vb1 + vb2;
	  
	  	  System.out.println("volume of boxes is : " +vb);

	  
   
   
   
   
   




  }
 }