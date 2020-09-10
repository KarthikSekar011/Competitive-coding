package arrays;

public class Equlibrium_Index_Array {
	
	static int findArray(int arr[], int n)
	{
		int sum =0;
		int leftSum =0;
		
		for(int i=0;i<n;i++)
		{
			sum +=arr[i];
		}
		
		for(int i=0;i<n;i++)
		{
			sum -=arr[i];
			
			if(leftSum==sum)
				return i;
			
			leftSum +=arr[i];
			
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		
		int arr[] = {-7, 1, 5, 2, -4, 3, 0};
		int n = arr.length;
		
		System.out.println("Equlibrium index is "+findArray(arr,n));
	}

}
