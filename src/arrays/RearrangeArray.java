package arrays;

import java.util.Arrays;

public class RearrangeArray {
	
	static void getArray(int arr[],int n)
	{
		int small=0;
		int large=n-1;
		int temp[] = new int [n];
		
		boolean pass = true;
		
		for(int i=0;i<n;i++)
		{
			if(pass)
				temp[i]=arr[large--];
			else
				temp[i]=arr[small++];
			
			pass=!pass;
		}
		
		arr=temp.clone();
		System.out.println("After Rearrange");
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		int arr[] = {1, 2, 3, 4, 5, 6};
		int n = arr.length;
		
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(arr));
		
		getArray(arr,n);	
		
		
	}

}
