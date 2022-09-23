import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		bank myBank = new bank(sc.nextInt());
	
		myBank.addAccount();
		myBank.getNewAccountInstance().set_nameOfAccountHolder("tom");
		myBank.getNewAccountInstance().set_balanceInAccount(200);
			myBank.addAccount();
		myBank.getNewAccountInstance().set_nameOfAccountHolder("jerry");
		myBank.getNewAccountInstance().set_balanceInAccount(300);
		myBank.addAccount();
			myBank.getNewAccountInstance().set_nameOfAccountHolder("badak");
		myBank.getNewAccountInstance().set_balanceInAccount(500);
		myBank.deleteAccountByAccountID(1);
		myBank.displayAllAccounts();
	}
}
