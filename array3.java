class Atest1
{
  static void maximum(int arr[])
  {
    int max = arr[0];
	
	for(int i = 0;i<arr.length ; i++)
	{ 
	  if(max < arr[i])
	  {
	     max = arr[i];
		 
		}
	}
    
	System.out.println("minimum element " +max);
   }


public static void main(String[] Args)
{
  int[] a = {16,32,8,67,4};
  
  maximum(a);
 }
}