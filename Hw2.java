import javax.swing.*;
class prime2
{
   public static void main(String[] Args)
   {
	   
	   String S = JOptionPane.showInputDialog("enter the amount of number");
	   int n = Integer.parseInt(S);
	   int j;
	   int i;
	  int count = 0;
	   for(i = 1;i<=n;i++)
	   {
		     
			  if(n%i == 0)
			  {
				  
				  count = count + 1;
			  }
           
	   }
	        if(count == 2)
			{
				System.out.println("the number " +n + " is prime number");
			}
			else
			{
				System.out.println("the number " +n + " is not prime number");
			}

   }

}