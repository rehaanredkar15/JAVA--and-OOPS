import javax.swing.*;


class question4
{
	public static void main(String[] Args)
	{
		int num1 = 0;
		int sum =0;
			String S = JOptionPane.showInputDialog("Enter the first no");
			 
			 num1 = Integer.parseInt(S);
	
			for(int i =1;i<=10;i++)
			{
			    sum = num1 * i ;
			   
			   System.out.println(" "+ num1 +" * " + i + " = "+ sum);
		     }
	}
	
	
}