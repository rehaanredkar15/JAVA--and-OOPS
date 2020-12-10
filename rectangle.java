
import javax.swing.*;
class rectangle
{
    private int x;
    private int y;
	public rectangle(int l,int b)
	{
	   x = l;
       y = b;	   
	   
	}
   public void area()
   {
       double a = x*y;
	   System.out.println("Area of rectangle"+a);
	}
	public void peri()
	{
	  double o = 2*(x+y);
	  System.out.println("perimeter of rectangle"+o);

	  }
 }
 
 class dtest
 {
   
   public static void main(String[] Args)
   {
      rectangle c1;
     String s = JOptionPane.showInputDialog("enter the length");
	 int len = Integer.parseInt(s);
	 String S = JOptionPane.showInputDialog("enter the height");
	 int hei = Integer.parseInt(S);
	 rectangle r1;
	 c1 = new rectangle(len,hei);
	 c1.area();
	 c1.peri();
 
 
     }
}