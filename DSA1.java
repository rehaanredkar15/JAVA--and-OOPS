import javax.swing.*;

class DSA1
{
	public static void main(String[] Args)
	{
		
		 
		 String s = JOptionPane.showInputDialog("enter the no of elements you will enter:");
		 int i = Integer.parseInt(s);
		 int[] arr = new int[i];
		 int[] revarr = new int[i];
		 for(int j = 0;j<i;j++)
		 {
			 s = JOptionPane.showInputDialog("enter the no of elements you will enter:");
		     arr[j]= Integer.parseInt(s);
		 }
		 int start = arr[1];
		 int end = arr[i-1];
		 int temp=0;
		while(start < end)
		{
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;	
		}
		for(int l = 0;l<=i;l++)
		 {
			System.out.println(arr[l]);
		 }
		
	}
	
}