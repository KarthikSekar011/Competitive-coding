package arrays;

import java.util.ArrayList;

class Stockmarket {
	int buy, sell;
}

public class StockBuySell {
	
	static int buySell(int Price[],int n)
	{
		
		if(n==1)
			return 0;
		
		int count=0;
		
		ArrayList<Stockmarket> obj = new ArrayList<Stockmarket>();
		
		int i=0;
		
		while(i<n-1)
		{
			
			while(i<n-1&&(Price[i+1]<Price[i]))
				i++;
			
			if(i==n-1)
				break;
			
			Stockmarket e = new Stockmarket();
			
			e.buy = i++;
			
			while(i<n&&(Price[i-1]<=Price[i]))
				i++;
			
			e.sell = i-1;
			
			obj.add(e);
			
			count++;
			
			
		}
		
		if(count==0)
			System.out.println("There is no day when buying the stock will make profit");
		
		else
			for(int j=0;j<count;j++)
				System.out.println("Buy on day : "+obj.get(j).buy+" Sell on day : "+obj.get(j).sell);
		return 1;
		
	}

	public static void main(String[] args) {
		
		int Price[] = {100, 180, 260, 310, 40, 535, 695};
		int n = Price.length;
		
		buySell(Price,n);
		
	}

}
