package ArrayProg;

import java.util.Arrays;

public class InserEleAtSpecificPosition {
	public static void main(String[] args) {
		int a[]= {1,2,3,6};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==6)
			{
				a[i]=1;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
