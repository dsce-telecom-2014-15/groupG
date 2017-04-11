import java.util.Scanner;

public class Arrays2D {

	public static void main(String[] args) {
		System.out.println("enter the order of matrix");
		Scanner order_n=new Scanner(System.in);
		int n=order_n.nextInt();
		
		Scanner order_m=new Scanner(System.in);
		int m=order_m.nextInt();
	 int [][]a=new int[n][m];
	 System.out.println("enter the matrix elements");
	 Scanner element=new Scanner(System.in);
	 for(int i=0;i<n;i++)
	 {
		 for( int j=0;j<m;j++)
		 {
			 a[i][j]=element.nextInt();
			 System.out.print(a[i][j]+" ");
			 

			 
		 }
		 System.out.println();
	 }

	}

}
