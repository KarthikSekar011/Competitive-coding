package patternPrograms;

import java.util.Scanner;

public class SandglassStarPattern {
	
	public static void sandGlass(int n)
	{
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n-i;k>=0;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n=in.nextInt();
		System.out.println();
		sandGlass(n);
		in.close();

	}

}
