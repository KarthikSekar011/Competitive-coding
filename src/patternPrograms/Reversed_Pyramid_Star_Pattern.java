package patternPrograms;

import java.util.Scanner;

public class Reversed_Pyramid_Star_Pattern {
	
	public static void reversePyramid(int n)
	{
		int space=1;
		for(int i=n-1;i>=0;i--)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space++;
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter the number of rows : ");
		
		int n = in.nextInt();
		System.out.println();
		reversePyramid(n);

	}

}
