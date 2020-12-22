class Atest
{
  static void minimum(int arr[])
  {
    int min = arr[0];
	
	for(int i = 0;i<arr.length ; i++)
	{ 
	  if(min > arr[i])
	  {
	     min = arr[i];
		 
		}
	}
    
	System.out.println("minimum element " +min);
   }


public static void main(String[] Args)
{
  int[] a = {25,12,11,7};
  
  minimum(a);
 }
}