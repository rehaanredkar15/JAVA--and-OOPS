class str19
{
	   public static void main(String[] args)
	   {
		   String s1 = new String("pleasure");
		   String r1 = "pleasure";
		   String s2 = s1.intern();
		   
		   System.out.println(s1==r1);		   
		   System.out.println(s1==s2);		   
		   System.out.println(r1==s2);		   
		   
		   
	   }

}