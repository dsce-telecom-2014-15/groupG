import java.util.Scanner;

// TODO: Name of the class should be a common noun.
public class EvenOddSum {

	public static void main(String[] args) {
		// TODO: messages displayed to the customer/end user should be proper.
		// TODO: here E in enter is supposed to be capital.
		System.out.println("enter the size of array");
		// Follow code naming conventions.
		// Check the pdf available in this link https://trello.com/c/RqDb7TFT/2-codeconventions-150003-pdf
		Scanner len=new Scanner(System.in);
		int n=len.nextInt();
		
     int []a=new int [n];
     int even_sum=0,odd_sum=0;
     System.out.println("enter the array elements");
     // TODO: There should be no warnings in the code. No yellow lines please.
     Scanner value=new Scanner(System.in);
     for(int i=0;i<n;i++)
     {
    	 a[i]=value.nextInt();
    	 
    	 if((a[i]%2)==0)
    		 
    	 {
    		 even_sum=even_sum+a[i];
    		 
    		 System.out.println( even_sum);
    		 
    	 }
    	 
		 
    	 else
    	 {
    		 // TODO: Naming conventions: follow camelCase. Please do not use _
    		 odd_sum=odd_sum+a[i];
    		 System.out.println("the odd no:"+odd_sum);
    		 
    	 }
     }

	}

}
