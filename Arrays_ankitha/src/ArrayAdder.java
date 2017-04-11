import java.util.Scanner;

public class ArrayAdder {

	public static void main(String[] args) {
		System.out.println("enter the size of matrix");
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		int [][]a=new int [n][n];
		int [][]b=new int [n][n];
		int [][]sum=new int [n][n];
		System.out.println("enter the elements of first matrix");
		Scanner elements=new Scanner(System.in);
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++){
				
				a[i][j]=elements.nextInt();
				
				System.out.print(a[i][j]+" ");
				
				
			}
			System.out.println();
		}
		Scanner element=new Scanner(System.in);
		

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++){
				
				b[i][j]=element.nextInt();
				
				System.out.print(b[i][j]+" ");
				
				
				
			}
			System.out.println();
			
		}
 System.out.println("the resultant matrix is");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++){
				
				sum[i][j]=a[i][j]+b[i][j];
				
				System.out.print(sum[i][j]+" ");
				
				
				
			}
			System.out.println();
		}

	}

}
