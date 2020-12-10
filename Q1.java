
class account
{
   private int accno;
   private int balance;
   private String name;
   
   
   public account()
   {
      accno = 1001;
	  balance = 4000;
	  name = "Rehan";
   }
   public void showdata()
   {
      System.out.println("the acc no is " + accno);
      System.out.println("the balance is " + balance);
      System.out.println("the acc holder name is  is " + name);
   }
   
    public void deposit(int d)
	{
	     balance = balance + d;
	    System.out.println("the balance after deposit is " + balance);
	   }
	 
	public void withdraw(int w)
	{
	  if(w>balance)
	  {
	    System.out.println("insufficient balance");
       }
	   else
	   {
	    balance = balance - w;
	    System.out.println(" after withdraw balance is " + balance);  
	   }
	}
}



class bank
{

    public static void main(String[] Args)
	{
	   account a1;
	   a1 = new account();
	   
	   a1.showdata();
	   a1.deposit(5000);
	   a1.withdraw(1000);
   }
}