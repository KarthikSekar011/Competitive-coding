package arrays;

import java.util.Scanner;

import java.util.Arrays;

public class KthSmallestElement {
	
	static int findElement(int arr[],int n,int k)
	{
		Arrays.parallelSort(arr);
		
		if(k<=n) {
			System.out.println(k+" Smallest elements is : "+arr[k-1]);
			return arr[k-1];
		}
		
		else
		{
			System.out.println("Entered number is exceeding the Array Length!");
			return 0;
		}
			
	}

	public static void main(String[] args) {
		
		int arr[] = {8,6,9,10,5,7,1};
		int n = arr.length;
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number to find the element : ");
		int k = obj.nextInt();
		findElement(arr,n,k);
	}

}
