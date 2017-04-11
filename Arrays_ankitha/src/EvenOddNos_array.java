import java.util.Scanner;

public class EvenOddNos_array {

	public static void main(String[] args) {
		System.out.println("enter the length of array");
		Scanner len=new Scanner(System.in);
		int n=len.nextInt();
		int []a=new int [n];
		System.out.println("enter the elements");
	
	for(int i=0;i<10;i++)
	{Scanner element=new Scanner(System.in);
		a[i]= element.nextInt();
		
		
	}
	
	for(int j=0;j<10;j++){
		if((a[j]%2)==0){  
			System.out.println("even no:"+a[j]+" ");
		}
		else
		System.out.println("odd no : "+ a[j]);
	}
		

	}

}
