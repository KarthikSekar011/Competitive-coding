package patternPrograms;

public class RightTrianglePattern {
	
	public static void rightPattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int n=5;
		rightPattern(n);
		

	}

}
