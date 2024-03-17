package ArrayProg;

public class MaximumElement {
	public static void main(String[] args) {
		int a[]= {3,7,9,5,22,31,10};
		int max=a[0];
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i]>max);
			max=a[i];
		}
		System.out.println("maximum value is:"+max);
		
	}
	

}
