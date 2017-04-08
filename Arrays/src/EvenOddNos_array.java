import java.util.Scanner;

public class EvenOddNos_array {

	public static void main(String[] args) {
		int []a=new int [10];
		System.out.println("enter the elements");
	
	for(int i=0;i<10;i++)
	{Scanner element=new Scanner(System.in);
		int n= element.nextInt();
		a[i]=n;
		
	}
	
	for(int j=0;j<10;j++){
		if((a[j]%2)==0){  
			System.out.println("even no:"+  a[j]+" ");
		}
		else
		System.out.println("odd no : "+ a[j]);
	}
		

	}

}
