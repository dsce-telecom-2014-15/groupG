package math_prgms;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		 int swap=0;
		System.out.println("enter the length of the string");
		Scanner no=new Scanner(System.in);
		int n=no.nextInt();
		int []a=new int [n];
		Scanner elements=new Scanner(System.in);
		System.out.println("enter the elements");
		 
		for (int i=0;i<n;i++)
		{
			a[i]=elements.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			
			if(a[i-1]>a[i])
			{
			swap=a[i];
			a[i]=a[i-1];
			a[i-1]=swap;
			
			}
		}
  
  for(int i=0;i<n;i++)
  {
	  System.out.print(a[i]+" ");
  }
	}


}