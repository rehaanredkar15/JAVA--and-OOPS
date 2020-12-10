import javax.swing.*;
class prime
{
   public static void main(String[] Args)
   {
	   
	   String S = JOptionPane.showInputDialog("enter the amount of number");
	   int n = Integer.parseInt(S);
	   int j;
	   int i;
	  
	   for(i = 1;i<=n;i++)
	   {
		   int count = 0;
		    for(int num = i;num>=1;num--)
		    {
			  
			  if(i%num == 0)
			  {
				  
				  count = count + 1;
			  }
		    }  
            if(count == 2)
			{
				System.out.println("the number " +i + " is prime number");
			}
	   }
	   

   }

}