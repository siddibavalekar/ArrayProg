package ArrayProg;

public class Test_if_array_contains_specific_value {
	public static void main(String[] args) {
		int a[]= {2,4,1,6,4};
		
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+"  ");
	}
	System.out.println();
	
	int check=4;
	int count=0;
	
	for(int j=0;j<a.length;j++)
	{
		if(a[j]==check)
		{
			count ++;
			System.out.println("this index value is present:"+j);
		}
		
	}
	if(count!=0)
	{
		System.out.println("value is present");
	}
	else
	{
		System.out.println("value is not present");
	}
	
	}

}
