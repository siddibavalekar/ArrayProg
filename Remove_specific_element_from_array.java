package ArrayProg;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_specific_element_from_array {
	public static void main(String[] args) {
		usingArrayListConvertion();
		usingLoop();
		
	}
	
	public static void usingArrayListConvertion() {
		int a[]= {4,3,6,7,8};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println();
		ArrayList list =new ArrayList();
		for(Integer i:a)
		{
			list.add(i);
		}
		
		System.out.println(list);
		System.out.println("remove the specific index element is :"+list.remove(2));
		
	}
	
	
	public static void usingLoop()
	 {
		int a[]= {1,4,6,8,3};
		System.out.println(Arrays.toString(a));
		int remove=6;
		System.out.println();
		
		int b[]=new int[a.length-1];
		for(int i=0,k=0;i<a.length;i++)
		{
			if(a[i]!=remove)
			{
				b[k]=a[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(b));
		
	 }

}
