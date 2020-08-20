package stringClass;


class LongestPalindromeSubstring{
	
	static void SubString(String input,int start,int maxLength) {
		System.out.println(input.substring(start, maxLength+1));
	}
	
	static int LongestPalin(String input) {
		int n = input.length();
		int maxLength=1;
		boolean table[][]=new boolean[n][n];
		for(int i=0;i<n;++i) {
			table[i][i]=true;
		}
		
		int start=0;
		for(int i=0;i<n-1;++i) {
			if(input.charAt(i)==input.charAt(i+1)) {
				table[i][i+1]=true;
				start=i;
				maxLength=2;
			}
		}
		for(int k=3;k<=n;++k) {
			for(int i=0;i<n-k+1;++i) {
				int j=i+k-1;
				
				if(table[i+1][j-1]&&input.charAt(i)==input.charAt(j)) {
					table[i][j]=true;
					if(k>maxLength) {
						start=i;
						maxLength=k;
					}
				}
			}
		}
		System.out.print("Substring is : ");
		SubString(input,start,start+maxLength-1);
		return maxLength;
		
	}
	
	public static void main(String[]args) {
		String input = "forUmaamUfor";
		System.out.println("The Longest Palindrome is : "+LongestPalin(input));
	}
}