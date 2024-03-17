package ArrayProg;

import java.util.Arrays;

public class SortIntArray {
	public static void main(String[] args) {
		int arr[]= {1,2,5,7,3};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(  arr[i]+"  ");
		}
		
		Arrays.sort(arr);
		System.out.println();
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+"  ");
		}
		System.out.println();
		
		for(int k=arr.length-1;k>=0;k--)
		{
			System.out.print(arr[k]+"  ");
		}
		
		
		
	}
		

}
