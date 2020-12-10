import javax.swing.*;

class Atm
{
	public static void main(String[] Args)
	{
		
		int bal = 2000;
		String ch = JOptionPane.showInputDialog(" Press D for deposit \n Press W for withdraw \n Press B for balance \n Press E for exit");
		switch(ch)
		{
			case "D" :
			case "d": String don = JOptionPane.showInputDialog("enter amount");
						int dm = Integer.parseInt(don);
						bal = bal+dm;
						System.out.println("After deposit  "+ dm + " balance "+bal);
						break;
		    
			case "W" :
			case "w" : String wdmt = JOptionPane.showInputDialog("Enter the amount for withdraw");
						int wd = Integer.parseInt(wdmt);
					     if(wd>bal)
						 {
							 System.out.print("Insufficient balance:");
						 }
						 else 
						 {
							 bal = bal-wd;					
							 System.out.println("after withdraw "+ wd + "balance is "+bal);

						 }
			case "B" :
			case "b": System.out.println("balance :"+bal);
			         break;
				
			case "E" : System.out.println("thank You visit again");
			          break;
					  
		     default : System.out.println("invalid choice please try again ");
			 
			          
		}
		
			
	}
}
	
	
	
	