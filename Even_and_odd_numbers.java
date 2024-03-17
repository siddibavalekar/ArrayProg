package ArrayProg;

public class Even_and_odd_numbers {
	public static void main(String[] args) {
		int a[]= {1,5,3,7,8,2,3};
		int count1=0;
		int count2=0;
		for(int i=0;i<a.length;i++)
		{
			if (a[i]%2==0)
			{
				System.out.println(a[i]+":even");
				count1++;
				
			}
			else
			{
				System.out.println(a[i]+":odd");
				count2++;
			}
			
		}
		System.out.println(count1+"count of even values");
	System.out.println(count2+"count of odd values");
	}

}
