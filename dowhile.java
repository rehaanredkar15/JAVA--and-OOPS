import javax.swing.*;
class dowhile
{
   public static void main(String[] Args)
   {
     int sumodd = 0,sumeven = 0;
	 String s;
	 int num;
     do
	 {
	   	   s = JOptionPane.showInputDialog("enter the number ");
          num = Integer.parseInt(s);
		  if(num%2 == 0)
		  {
		    sumeven = sumeven + num;
			}
		   else
		   {
		     sumodd = sumodd + num;
			}
		  
   
     }while(num != 0);
	 System.out.println(sumeven);
	 System.out.println(sumodd);

   

     }
  }