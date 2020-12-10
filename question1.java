import javax.swing.*;

class largest_no
{
	public static void main(String[] Args)
	{
		int num = 0,num2 = 0,num3 =0;
	
	String S = JOptionPane.showInputDialog("Enter the first no");
	
	num = Integer.parseInt(S);
	
     S = JOptionPane.showInputDialog("Enter the second no");

    num2 = Integer.parseInt(S);
	
	
    
	S = JOptionPane.showInputDialog("Enter the third no");
	
     num3 = Integer.parseInt(S);


	if(num > num2)
	{
		if(num2 > num3 )
		{
			System.out.println("the largest no is " + num );
		}
		else if (num2 == num3 )
		{
		   System.out.println("the largest nos are  " + num2 + num3 );
		}
	    else if (num < num3)
		{
	      System.out.println("the largest no is " + num3 );
        }
		else if (num == num3)
		{
		   System.out.println("the largest nos are  " + num + num );
	
		}
		
		
	}
	else if(num < num2 )
	{
		if(num2 > num3)
		{
		     System.out.println("the largest no is " + num2 );

		}
		else if (num2 == num3)
		{
		    System.out.println("the largest nos are  " + num2 + num3 );	
		}
		else
		{
			System.out.println("the largest no is " + num3);
	    }
	}
	else if (num == num2 )
	{
		
		if(num2 < num3)
		{
			System.out.println("the largest no is "+ num3);
		}
		else if (num2 == num3)
		{
			System.out.println("the largest no is "+ num + num2 + num3);
		}
		else 
		{
			System.out.println("the largest no is " + num + num2 );
		}

    }
	
	
}
}