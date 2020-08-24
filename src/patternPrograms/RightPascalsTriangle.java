package patternPrograms;

import java.util.Scanner;

public class RightPascalsTriangle {
	
	public static void rightPascals(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<=i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number of rows : ");
		int n = in.nextInt();
		System.out.println();
		
		rightPascals(n);

	}

}
