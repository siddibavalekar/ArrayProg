package ArrayProg;

import java.util.ArrayList;
import java.util.Arrays;

public class Copy_array_by_iterating_array {
	public static void main(String[] args) {
	
		int a[]= {3,6,9,12};
		int b[]= {2,4,6,8};
		
	ArrayList<Integer>ref=new ArrayList();
	
	for(Integer i:a)
	{
		ref.add(i);
	}
	for(Integer i:b)
	{
		ref.add(i);
	}
		System.out.println(ref);
		
	}
}
