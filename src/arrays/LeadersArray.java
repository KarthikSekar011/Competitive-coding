package arrays;

public class LeadersArray {
	
	static void printLeader(int arr[], int n)
	{
		int MaxAtRight = arr[n-1];
		
		System.out.print(MaxAtRight+" ");
		
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]>MaxAtRight)
			{
				MaxAtRight=arr[i];
				System.out.print(MaxAtRight+" ");
				
			}
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {20,99,53,41,66,10,20};
		int n = arr.length;	
		System.out.print("Leaders of an Array : ");
		printLeader(arr,n);

	}

}
