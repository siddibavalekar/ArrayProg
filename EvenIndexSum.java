package ArrayProg;

public class EvenIndexSum {
	public static void main(String[] args) {
		int a[]= {2,5,8,9,3,3,7,9,10,11};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+": even digits");
				sum=sum+a[i];
//				System.out.println(sum);
			}
		}
		System.out.println(sum+":sum of even digit number");
		
	}

}
