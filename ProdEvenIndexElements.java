package ArrayProg;

public class ProdEvenIndexElements {
	public static void main(String[] args) {
		int a[]= {2,6,7,9,3,5};
		int product=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			product=product*a[i];
			}
		}
		System.out.println("product of even number:"+product);
	}

}
