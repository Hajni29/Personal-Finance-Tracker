package PersonalFinanceTracker;

//This class represents financial transactions (income or expenditure).

public class Transaction {
	private String description;
	private double amount;
	private String type; //"income" or "expense"
	
	public Transaction(String description, double amount, String type) {
		this.description = description;
		this.amount = amount;
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public double getAmount() {
		return amount;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Transaction [description=" + description + ", amount=" + amount + ", type=" + type + "]";
	}
	
	
}
