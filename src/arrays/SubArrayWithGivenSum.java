package arrays;


public class SubArrayWithGivenSum 
	{
	
	int SubArray(int arr[],int n,int sum)
	{
		int Curr_Sum = arr[0];
		int start=0,i;
		
		for(i=1;i<=n;i++)
		{
			while(Curr_Sum>sum&&start<n-1)
			{
				Curr_Sum=Curr_Sum-arr[start];
				start++;
			}
			if(Curr_Sum==sum)
			{
				int p=i-1;
				System.out.println("Sum found between indexes "+start+" and "+p);
				return 0;
			}
			
			if(i<n)
			{
				Curr_Sum=Curr_Sum+arr[i];
			}
		}
		System.out.println("No SubArray found");
		return 1;
	}
	
	public static void main(String[] args)
	{
		int arr[] = {0,1,2,3,4,5,6,7,8};
		int n = arr.length;
		int sum=11;
		
		SubArrayWithGivenSum obj = new SubArrayWithGivenSum();
		obj.SubArray(arr, n, sum);
	}

}
