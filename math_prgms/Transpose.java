package math_prgms;

public class Transpose {

	public static void main(String[] args) {
		int i,j;
		int [][]a=new int [4][4];
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{a[i][j]=i;
			
				a[j][i]=a[i][j];
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}

	}

}
