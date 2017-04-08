import java.util.Scanner;

public class ArrayAdder {

	public static void main(String[] args) {
		System.out.println("enter the size of matrix");
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		int [][]a=new int [n][n];
		int [][]b=new int [n][n];
		int [][]sum=new int [n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++){
				a[i][j]=j;
				b[i][j]=j;
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+" ");
				
			}
			System.out.println();
		}
		

	}

}
