class Atest
{
  public static void main(String[] args)
  {
    int arr[][] = {{1,2,3},{3,4,5}};
	int arr2[][] = {{1,3,4},{3,4,5}};
	int arr3[][] = new int[2][3];
	
	for(int i=0;i<2;i++)
	{
	   for(int j =0;j<3;j++)
	   {
	     arr3[i][j] = arr[i][j] + arr2[i][j];
		 System.out.print(arr3[i][j] + " ");
		}
		System.out.println();
     }
	}
	
}