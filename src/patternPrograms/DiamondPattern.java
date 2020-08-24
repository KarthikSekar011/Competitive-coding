package patternPrograms;

import java.util.Scanner;

public class DiamondPattern {
	
	public static void diamondMethod(int n) {
		
		int space=n-1;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
		space--;
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		space=1;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space++;
			for(int k=1;k<=2*(n-i)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n=input.nextInt();
		diamondMethod(n);
		
   }
}
