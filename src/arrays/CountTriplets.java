package arrays;

public class CountTriplets {
	
	int Count(int arr[],int n)
	{
		int MaxValue = 0;
		
		for(int i=0;i<n;i++)
			MaxValue = Math.max(MaxValue, arr[i]);
		int freq[]=new int[MaxValue+1];
		for(int i=0;i<n;i++)
			freq[arr[i]]++;
		
		int ans=0;
		
		//case 1 :0,0,0
		
		ans+=freq[0]*(freq[0]-1)*(freq[0]-2)/6;
		
		//case 2 :0,x,x
		for(int i=1;i<=MaxValue;i++)
			ans+=freq[0]*freq[i]*(freq[i]-1)/2;
		
		//case 3 :x,x,2x
		for(int i=1;2*i<=MaxValue;i++)
			ans+=freq[i]*(freq[i]-1)/2*freq[2*i];
		
		//case 4 :x,y,x+y
		for(int i=1;i<=MaxValue;i++)
			for(int j=i+1;i+j<=MaxValue;j++)
				ans+=freq[i]*freq[j]*freq[i+j];
		
		return ans;
	}
	
	
	public static void main(String[] args) {
		
		CountTriplets obj = new CountTriplets();
		int arr[] = {1,2,3,4,5};
		
		int n = arr.length;
		System.out.println("Count of Triplets is "+obj.Count(arr, n));
		
	}

}
