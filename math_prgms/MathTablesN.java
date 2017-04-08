package math_prgms;

import java.util.Scanner;

public class MathTablesN {

	public static void main(String[] args) {
		int w;
	  
	  System.out.println("enetr the stsrting no from which the tables is required");
	  Scanner se=new Scanner(System.in);
	  int a= se.nextInt();
	  System.out.println("enter the last value for which the tables is required ");
	  //Scanner end= new Scanner(System.in);
	  int b=se.nextInt();
	  System.out.println("enter the no of tables required");
	  //Scanner mid=new Scanner(System.in);
	  int c=se.nextInt();
	  for( int i=a;i<=b;i++){
		  for( int j=1;j<=c;j++){
			  w=i*j;
			  System.out.println(i +" "+ "*"+j+"="+w);
			  
		  }
	  }

	}

}
