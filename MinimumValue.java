package ArrayProg;

public class MinimumValue {
	public static void main(String[] args) {
		int a[]= {4,3,2,6,7,88,3,4};
		
	int min=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(min>a[i])
		{
			min=a[i];
		}
	}
	System.out.println("Minimum value is:"+min);
	}

}
