package ArrayProg;

public class SumOfArrayEle {
	public static void main(String[] args) {
		int a[]= {2,5,4,7,8};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println("Total sum:"+sum);
	}

}
