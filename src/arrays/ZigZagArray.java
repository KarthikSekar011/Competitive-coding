package arrays;

public class ZigZagArray {
	
	static void ZigZag(int arr[],int n)
	{
		boolean flag = true;
		int temp = 0;
		
		for(int i=0;i<n-2;i++)
		{
			if(flag==true)
			{
				if(arr[i]>arr[i+1])
				{
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			else
			{
				if(arr[i]<arr[i+1])
				{
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			flag=!flag;
		}
	}

	public static void main(String[] args) {
		
		int arr[] = new int [] {1,2,3,4,5,6,7,8,9};
		int n = arr.length;
		ZigZag(arr,n);
		System.out.print("ZigZag elements are : ");
		for(int arr1 : arr)
			System.out.print(arr1+" ");

	}

}
