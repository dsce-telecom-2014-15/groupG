import java.util.Scanner;

public class FabonacciSeries {

	public static void main(String[] args) {
		System.out.println("enter the number till the series has to be printed");
		Scanner l=new Scanner(System.in);
		int limit=l.nextInt();
		
		
		int []n=new int[limit];
		
		System.out.print("0"+ " " +"1");
		for( int i=2;i<limit;i++)
		{n[0]=0;n[1]=1;
			n [3]=n[1]+n[2];
			System.out.print(n[3]+" ");
			n[1]=n[2];
			n[2]=n[3];
			
		}
		
		

	}

}
