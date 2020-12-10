import javax.swing.*;
class percentage
{
   public static void main(String[] Args)
   {
      
	   String eng,math,phy,chem,bio,name;
	   int e=0,m=0,p=0,c=0,b=0;
	   name = JOptionPane.showInputDialog("Enter the students name");
	   
	   	eng = JOptionPane.showInputDialog("Enter the marks of english ");
		 
		 e = Integer.parseInt(eng);
		 
		math = JOptionPane.showInputDialog("Enter the marks of maths ");
		
		 m = Integer.parseInt(math);

	   	phy = JOptionPane.showInputDialog("Enter the marks of physics");
		
		 p = Integer.parseInt(phy);

        chem = JOptionPane.showInputDialog("Enter the marks of chem ");
		
		c = Integer.parseInt(chem);

	   	bio = JOptionPane.showInputDialog("Enter the marks of bio");
		
	     b = Integer.parseInt(bio);


        if( e >= 40 && m >= 40 && p >=	40 && c >= 40 && b >=40)
		{
          int sum = e + m + p+ c+b;
		  int per =  sum/5;
           if(per >= 80)
		   {
			   System.out.println("STUDENT IS IN FIRST CLASS");
		   }
		   else
		   {
			   System.out.println("Student  is in second class");
		   }
		   System.out.println("STUDENT,s name is "+ name+" his totalmarks are " + sum + " and his percentage is "+ per + " %");
		}
	     else 
		 {
			 
            System.out.println("failed");

        
    
		 }
	   
	   
	   
	   
	   
	   
   }


}