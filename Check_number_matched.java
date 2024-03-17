package ArrayProg;

import java.util.Scanner;

public class Check_number_matched {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter any number");
		int n=sc.nextInt();
		int a[]= {10,30,40,20};
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				flag=true;
				break;
			}
			
		}
		if(flag==true)
		{
			System.out.println("matched");
		}
		else
		{
			System.out.println("not matched");
		}
		
	}

}
