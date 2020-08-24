package patternPrograms;

import java.util.Scanner;

public class MirroredRightTriangleStar {

	public static void rightTriangle(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=n-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
	
		int n=in.nextInt();
		System.out.println();
		
		rightTriangle(n);
		
	}

}
