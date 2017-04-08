import java.util.Scanner;

public class ConsoleReader {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter an integer");
		int number=scan.nextInt();
		System.out.println("the number entered was"+ " "+ number);
		System.out.println("enter a double value");
		
		double db=scan.nextDouble();
		System.out.println("the doubke value is"+" "+db);
		System.out.println("enter your name ");
		String name=scan.next();
		System.out.println("your name is:)"+" "+name);

	}

}
