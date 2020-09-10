package arrays;

import java.util.Scanner;

public class ReverseArrayGroups {
	
	static void reverseArray(int arr[],int n,int k)
	{
		for(int i=0;i<n;i+=k)
		{
			int Left = i;
			
			int Right = Math.min(i+k-1, n-1);
			
			int temp;
			while(Left<Right)
			{
				temp = arr[Left];
				arr[Left] = arr[Right];
				arr[Right] = temp;
				
				Left++;
				Right--;
			}
		}
	}

	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,3,4,5,6,7,8};
		int n = arr.length;

		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int k = obj.nextInt();
		
		reverseArray(arr,n,k);
		System.out.println();
		
		for(int arr1 : arr)
			System.out.print(arr1+" ");
	}

}
