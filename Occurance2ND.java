//Print the oCCUrAnCe oF 2nd index in given ArrAy?
package ArrayProg;

import java.util.Scanner;

public class Occurance2ND {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,10,20,50,30};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int b=sc.nextInt();
		int count=0;
		boolean flag=true;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==b)
			{
				count++;
			}
			if(count==2)
			{
				flag=false;
				break;

				
			}
		}
			if(flag==flag)
			{
				System.out.println(count);
			
		}
	}

}
