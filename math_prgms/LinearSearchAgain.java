package math_prgms;

import java.util.Scanner;

public class LinearSearchAgain {

	public static void main(String[] args) {
		int []a=new int [10];
		int []b=new int[10];
		System.out.println("enter the array elements");
		Scanner ptr=new Scanner (System.in);
		System.out.println("enter the element to be found");
		Scanner no=new Scanner(System.in);
		int n=no.nextInt();
for(int i=0;i<10;i++)
	
{
	
	a[i]=ptr.nextInt();
	if(a[i]==n){
		b[i]=i;
		System.out.println("the element was found "+a[i]+"at the indices"+b[i]);
	}
	
}
	
	}
	}

