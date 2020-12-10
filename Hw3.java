import javax.swing.*;
class prime3
{
   public static void main(String[] Args)
   {
	   
	   String S = JOptionPane.showInputDialog("enter the number till which you want the sum");
	   int n = Integer.parseInt(S);
	   int j;
	   int i;
	  int count = 0;
	   for(i = 1;i<=n;i++)
	   {
		   count = count + i;
           
	   }
	   System.out.println("the sum of the numbers is  " +count ); 
   }

}