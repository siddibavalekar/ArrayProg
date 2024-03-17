//CoUnt mAtChing elemrnts in given ArrAy

package ArrayProg;

import java.util.Scanner;

public class CoUntmAtChingelemrntsingivenArrAy {
public static void main(String[] args) {
	int a[]= {1,5,8,3,3,9};
	Scanner sc=new Scanner (System.in);
	System.out.println("enter any number");
	int value=sc.nextInt();
	int count=0;
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==value)
		{
			count++;
			
		}
		
	}
	System.out.println("count is:"+count);
	
}
}
