package arrays;

import java.util.Arrays;

public class MinimumPlatforms {
	
	static int findMaxPlatforms(int ari[],int dep[],int n)
	{
		Arrays.sort(ari);
		Arrays.sort(dep);
		
		int platforms = 1, i=1, j=0, result=1;
		
		while(i<n&&j<n)
		{
			if(ari[i]<=dep[j])
			{
				platforms++;
				i++;
			}
			
			else if(ari[i]>dep[j])
			{
				platforms--;
				j++;
			}
			
			if(platforms>result)
				result = platforms;
			
		}
		
		return result;
	}	

	public static void main(String[] args) {
		
		int ari[] = {900, 940, 950, 1100, 1500, 1800};
		int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

		int n = ari.length;
		
		System.out.println("Number of platforms required : "+findMaxPlatforms(ari,dep,n));
	}

}
