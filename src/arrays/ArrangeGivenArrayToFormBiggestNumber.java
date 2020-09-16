package arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class ArrangeGivenArrayToFormBiggestNumber {
	
	static void BiggestNumber(Vector<String>arr)
	{
		Collections.sort(arr, new Comparator<String>(){
			
			
			public int compare(String x,String y) {
				String xy = x + y;
				String yx =y + x;
				
				return xy.compareTo(yx)>0?-1:1;
			}
			
		});
		
		Iterator<String> it = arr.iterator();
		
		while(it.hasNext())
			System.out.print(it.next());
	}

	public static void main(String[] args) {
		Vector<String> arr = new Vector<String>();
		
		arr.add("1");
		arr.add("34");
		arr.add("3");
		arr.add("98");
		arr.add("9");
		arr.add("76");
		arr.add("45");
		arr.add("4");
		
		BiggestNumber(arr);	

	}

}
