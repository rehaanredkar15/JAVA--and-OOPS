
class str11
{
   public static void main(String[] Args)
   {
	   int count = 0;
	  String s1 = "I like cake";
	  
	  System.out.println("The length of the string is :" +s1.length());

      for(int i = 0;i<s1.length()-1;i++)
	  {
		  
		  if(s1.charAt(i) == 'k')
		  {
			  
	        count++;
		  }
	  }
	  
	  System.out.println("the value of k is " +count);
   }
   
}