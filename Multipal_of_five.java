package ArrayProg;

public class Multipal_of_five {
	public static void main(String[] args) {
		int a[]= {20,10,43,25,65,22,34};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%5==0)
			{
				System.out.println(a[i]+":multiply by five");
			}
		}
	}

}
