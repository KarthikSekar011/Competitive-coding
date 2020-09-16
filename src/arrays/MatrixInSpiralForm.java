package arrays;

public class MatrixInSpiralForm {
	
	static void Spiral(int RowEnd,int n,int arr[][])
	{
		int i;
		int RowStart=0;
		int ColStart=0;
		
		while(RowStart<RowEnd&&ColStart<n)
		{
			for(i=ColStart;i<n;i++) {
				System.out.print(arr[RowStart][i]+" ");
			}
			RowStart++;
			
			for(i=RowStart;i<RowEnd;i++) {
				System.out.print(arr[i][n-1]+" ");
			}
			n--;
			
			if(RowStart<RowEnd)
			for(i=(n-1);i>=ColStart;i--) {
				System.out.print(arr[RowEnd-1][i]+" ");
			}
			RowEnd--;
			
			if(ColStart<n)
				for(i=RowEnd-1;i>=RowStart;i--) {
					System.out.print(arr[i][ColStart]+" ");
				}
			ColStart++;
			
		}
		
	}

	public static void main(String[] args) {
		
		int arr[][] = {{1, 2, 3, 4, 5},
					   {6, 7, 8, 9, 10},
				       {11,12,13,14,15}};
		int n = 5;
		int RowEnd = 3;
		Spiral(RowEnd,n,arr);

	}

}
