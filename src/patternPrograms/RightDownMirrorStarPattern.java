package patternPrograms;

import java.util.Scanner;

public class RightDownMirrorStarPattern {
	
	public static void rightDownMirror(int n)
	{
		for(int i=n-1;i>=0;i--)
		{
			
			for(int j=n;j>i;j--)
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
		rightDownMirror(n);
		in.close();

	}

}
