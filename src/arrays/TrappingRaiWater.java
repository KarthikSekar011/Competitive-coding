package arrays;

public class TrappingRaiWater {
	
	static int store(int arr[], int n)
	{
	
		int size = n-1;
		int previous = arr[0];
		int previousIndex = 0;
		int water = 0;
		int temp = 0;
		
		for(int i=1;i<size;i++)
		{
			if(arr[i]>previous)
			{
				previous = arr[i];
				previousIndex = i;
				
				temp = 0;
			}
			else
			{
				water +=previous-arr[i];
				
				temp +=previous-arr[i];
			}
		}
		
		if(previousIndex<size)
		{
			water -=temp;
			
			previous = arr[size];
			
			for(int i=size;i>=previousIndex;i--)
			{
				if(arr[i]>=previous)
				{
					previous = arr[i];
				}
				else
				{
					water +=previous-arr[i];
				}
			}
		}
		
		return water;
		
	}

	public static void main(String[] args) {
		
		int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int n = arr.length;
		System.out.println("Stored water in the array is : "+store(arr,n));
	}

}
