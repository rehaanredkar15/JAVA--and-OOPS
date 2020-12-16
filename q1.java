import javax.swing.*;
class test 
{
  public static void main(String[] Args)
  {
      String str = JOptionPane.showInputDialog("enter your string");
	  
	  int characters = str.length();
	  
	 String[] w = str.split("\\s");
	 
	 int count = 0;
     
	  
      for(String s:w)
	  {
		 System.out.println("character in this word is " +w[count].length());
		 count++;
		 
		}
	  
	  System.out.println("the words in the string are  " +count);
	  
  }
}
	  