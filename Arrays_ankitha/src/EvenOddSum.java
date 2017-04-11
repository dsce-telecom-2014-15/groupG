import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		System.out.println("enter the size of array");
		Scanner len=new Scanner(System.in);
		int n=len.nextInt();
		
     int []a=new int [n];
     int even_sum=0,odd_sum=0;
     System.out.println("enter the array elements");
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
    		 odd_sum=odd_sum+a[i];
    		 System.out.println("the odd no:"+odd_sum);
    		 
    	 }
     }

	}

}
