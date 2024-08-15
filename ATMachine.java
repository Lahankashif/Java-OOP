package pack1;
import java.util.Scanner;
public class ATMachine {
	public static void main (String[] args) {
	atm[] accounts = new atm[10];
    for (int i = 0; i < 10; i++) {
        accounts[i] = new atm(i, 100);
    }
    Scanner sc = new Scanner(System.in);
    while(true) {
    	int id = promptForValidId(sc, accounts);
    	while (true) {
    		displayMenue();
    		int choice = sc.nextInt();
    		if (choice == 1) {
                // View balance
                System.out.println("The balance is $" + accounts[id].getAmount());
            } else if (choice == 2) {
                // Withdraw money
                System.out.print("Enter an amount to withdraw: ");
                double amount = sc.nextDouble();
                accounts[id].withDraw(amount);
                System.out.print("Your amount after withdraw: " + accounts[id].getAmount());
            } else if (choice == 3) {
                // Deposit money
                System.out.print("Enter an amount to deposit: ");
                double amount = sc.nextDouble();
                accounts[id].deposit(amount);
                System.out.print("Your amount after deposit: " + accounts[id].getAmount());
            } else if (choice == 4) {
                // Exit
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
    	}
    }}
    private static int promptForValidId(Scanner sc, atm[] accounts) {
    	while(true) {
    		System.out.println("Enter id (0-9): ");
    		int id = sc.nextInt();
    		if (id>0 && id<accounts.length) {
    			return id;
    		}
    		System.out.println("INVALID ID .. ");
    	}
    }
    private static void displayMenue() {
    	 System.out.println("\nMain menu");
         System.out.println("1: check balance");
         System.out.println("2: withdraw");
         System.out.println("3: deposit");
         System.out.println("4: exit");
         System.out.print("Enter a choice: ");
    }
}
class atm {
	private double aB;
	private int id ;
	public double getAmount() {
		return aB;
	}
	public int getId() {
		return id;
	}
	void deposit(double amount) {
    	aB=aB+amount;
    }
    void withDraw(double amount) {
    	if (amount <= aB) {
            aB -= amount;
        } else {
            System.out.println("INSUFFICIENT BALANCE .. SORRY :( ");
        }    }
    atm(int id, double initialBalance){
    	 this.id = id;
         this.aB = initialBalance;
    }
    atm(){}
    }