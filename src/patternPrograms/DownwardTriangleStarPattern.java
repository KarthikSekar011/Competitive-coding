package patternPrograms;

import java.util.Scanner;
public class DownwardTriangleStarPattern {

	public static void downwardTriangle(int n)
	{
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
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
		downwardTriangle(n);
		in.close();
	}

}
