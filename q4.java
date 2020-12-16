import javax.swing.*;
class stest
{
	public static void main(String[] Args)
	{
		  
	     String str = JOptionPane.showInputDialog("enter your product name: ");
	   
	     String str2 = JOptionPane.showInputDialog("enter your price of product : ");
	   
	      int pro = Integer.parseInt(str2);
	   
	      String str3 = JOptionPane.showInputDialog("enter the quantity of the product: ");
	   
	      int qua = Integer.parseInt(str3);
	   
	      int bill = pro * qua;
		  
		  System.out.println("the bill is " + bill);
	   
	      if(str.contains("cake"))
	      {
			   double dis = bill * 0.7;
			   System.out.println("the discounted bill is " + dis);
	       }
		   else if(pro >= 5000)
		   {
			   double dis = bill * 0.8;
		    System.out.println("the discounted bill is " + dis);
		   }
	}
}