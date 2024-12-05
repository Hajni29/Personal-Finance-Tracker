package PersonalFinanceTracker;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FinanceTracker tracker = new FinanceTracker();
		
		
		while(true) {
			System.out.println("Choose an option");
			System.out.println("1. Add transaction");
			System.out.println("2. Show transaction");
			System.out.println("3. Show balance");
			System.out.println("4. Exit");
			int choice = scanner.nextInt();
			scanner.nextLine(); // consume newline
			
			switch (choice) {
			case 1:
				System.out.println("Enter a description of the transaction: ");
				String description = scanner.nextLine();
				System.out.println("Enter the amount: ");
				double amount = scanner.nextDouble();
				System.out.println("Enter the type of transaction (income/expense): ");
				String type = scanner.next();
				tracker.addTransaction(description, amount, type);
				break;
			case 2:
				tracker.showTransactions();
				break;
			case 3:
				System.out.println("Current balance: " + tracker.calculateBalance());
				break;
			case 4:
				System.out.println("Exit the program....");
				scanner.close();
				return;
			default:
				System.out.println("Invalid selection. Please try again. ");
				
			}
		}

	}

}
