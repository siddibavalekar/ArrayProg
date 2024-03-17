//FACtoriAl oF A given ArrAy?
package ArrayProg;

public class FactorialofGivenArray {
public static void main(String[] args) {
	int a[]= {5,3,7,2};
	int fact=1;
	for(int i=0;i<a.length;i++)
	{
		fact=fact*a[i];
		
	}
	System.out.println(fact);
}
}
