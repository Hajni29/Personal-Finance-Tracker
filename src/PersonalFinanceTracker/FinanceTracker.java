package PersonalFinanceTracker;

import java.util.ArrayList;
import java.util.List;

//This department manages transactions and financial records.

public class FinanceTracker {
	private List<Transaction> transactions;
	
	public FinanceTracker() {
		transactions = new ArrayList();	
	}

	public void addTransaction(String description, double amount, String type) {
		transactions.add(new Transaction(description, amount, type));
	}
	
	public void showTransactions() {
		for (Transaction transaction : transactions) {
			System.out.println(transaction);
		}
	}
	
	public double calculateBalance() {
		double balance = 0;
		for(Transaction transaction : transactions) {
			if(transaction.getType().equals("income")) {
				balance+= transaction.getAmount();
			}else if(transaction.getType().equals("expense")) {
				balance -= transaction.getAmount();
			}
		}
		return balance;
	}
}
