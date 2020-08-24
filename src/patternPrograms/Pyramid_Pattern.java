package patternPrograms;

public class Pyramid_Pattern {

	public static void pyramidDesighn(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=n-i;j>1;j--)
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
		int n=5;
		
		pyramidDesighn(n);
	}

}
