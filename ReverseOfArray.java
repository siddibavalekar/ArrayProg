package ArrayProg;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an elements in array:");
		int a[]=new int[6];
		//scanner input array
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		//reverse the array 
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print("  "+ a[i]);
		}
		
		
	}

}
