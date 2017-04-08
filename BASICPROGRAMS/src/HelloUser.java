import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		
		System.out.println("enter your name");
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		
		System.out.println("hello" +" "+ name);
		

	}

}
