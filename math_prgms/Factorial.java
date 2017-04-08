package math_prgms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("enter the no");
	
	Scanner intptr=new Scanner(System.in);
		
		
        int n=intptr.nextInt();
        int i,fact=1;	 
			
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
    System.out.println("the factorial is" +fact );
	}

}
