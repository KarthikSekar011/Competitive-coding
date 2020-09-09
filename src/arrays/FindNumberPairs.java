package arrays;

import java.util.Arrays;

public class FindNumberPairs {
	
	static int count(int x,int y[],int yl,int noOfY[])
	{
		
		if(x==0)
			return 0;
		
		if(x==1)
			return noOfY[0];
		
		int idx = Arrays.binarySearch(y, x);
		int ans;
		
		if(idx<0)
		{
			idx = Math.abs(idx+1);
			ans = yl-idx;
		}
		else
		{
			while(idx<yl&&y[idx]==x)
			{
				idx++;
			}
			ans = yl-idx;
		}
		
		ans +=(noOfY[0]+noOfY[1]);
		
		if(x==2)
			ans -=noOfY[3]+noOfY[4];
		
		if(x==3)
			ans +=noOfY[2];
		
		return ans;
		
	}
	
	static int countPairs(int x[],int y[],int xl,int yl)
	{
		int noOfY[] = new int[5];
		
		for(int i=0;i<yl;i++)
			if(y[i]<5)
			noOfY[y[i]]++;
		
		Arrays.sort(y);
		
		int totall_Pairs = 0;
		
		for(int i=0;i<xl;i++)
			totall_Pairs += count(x[i],y,yl,noOfY);
		
		return totall_Pairs;
	}

	public static void main(String[] args) {
		
		int x[] = {2, 1, 6};
		int y[] = {1, 5};
		
		System.out.println("Number of pairs are : "+countPairs(x,y,x.length,y.length));
	}

}
