import javax.swing.*;


class question3
{
	public static void main(String[] Args)
	{
		int num1 = 0,num2 = 0;
		
			String S = JOptionPane.showInputDialog("Enter the first no");
			 
			 num1 = Integer.parseInt(S);
	
			S = JOptionPane.showInputDialog("Enter the second no");

			 num2 = Integer.parseInt(S);
	
	        num1 = num1 + num2;
			
			num2 = num1 - num2;
			
			num1 = num1 - num2;
			
			System.out.println("the swapped values are of first number is " + num1 +" and the swaped value of secomd num is" + num2 );
 
		
	}
	
	
}