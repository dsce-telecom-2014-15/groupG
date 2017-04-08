package math_prgms;

public class SumOfArray {

	public static void main(String[] args) {
		int sum=0 ;
		int []a=new int[10];
		for(int i=0;i<10;i++)
		{
			a[i]=i;
			sum=sum+a[i];
			
		}
		
		System.out.println( "the sum of arry elements are"+sum);

	}

}
