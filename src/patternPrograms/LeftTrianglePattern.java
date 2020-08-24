package patternPrograms;

public class LeftTrianglePattern {

	public static void LeftTriangle(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=2*(n-i);j>=3;j--)
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
	
		int n=10;
		LeftTriangle(n);

	}

}
