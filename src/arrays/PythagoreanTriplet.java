package arrays;

import java.util.Arrays;

public class PythagoreanTriplet {
	
	static boolean isTriplet(int arr[],int n)
	{
		for(int i=0;i<n;i++)
			arr[i] = arr[i] * arr[i];
		
		Arrays.sort(arr);
		
		for(int i=n-1;i>=2;i--)
		{
			int l=0;
			int r=i-1;
			
			while(l<r)
			{
				
				if(arr[l]+arr[r]==arr[i])
					return true;
				
				if(arr[l]+arr[r]<arr[i])
					l++;
				
				else
					r--;	
			}
			
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		int arr[] = new int [] {1,2,3,4,5,6 };
		int n = arr.length;
		
		if(isTriplet(arr,n)==true)
			System.out.println("yes");
		else
			System.out.println("No");
	}

}
