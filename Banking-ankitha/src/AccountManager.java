import java.util.Scanner;

public class AccountManager {

	public static void main(String[] args) {
		
		int FinalBalance=0;
		
		System.out.println("enter the balance amount");
		Scanner s1=new Scanner(System.in);
		int balance=s1.nextInt();
		while(true)
		{
			
			
		 System.out.println("enter 1 for deposit and 2 for withdrawal");
		 Scanner scan=new Scanner (System.in);
		int trans=scan.nextInt();
		Account account=new Account();
		
		System.out.println("enter the transaction amount");
		Scanner a=new Scanner (System.in);
		int amount=a.nextInt();
		
		
		if(trans==1)
		{
		
		
		account.deposit(balance, amount);
		System.out.println("the final balance is"+ (balance+amount));
		FinalBalance=balance+amount;
		

		
	}
		else
		{
			account.withdraw(balance, amount);
			System.out.println("the final balance is"+ (balance-amount));
			FinalBalance=balance-amount;	
		}
		balance=FinalBalance;
		}

}
}
