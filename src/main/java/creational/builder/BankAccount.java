package creational.builder;

public class BankAccount {
	
	private String owner;
	private double balance;
	private int number;
	
	private BankAccount(BankAccountBuilder builder) {
		this.owner = builder.owner;
		this.balance = builder.balance;
		this.number = builder.number;
	}
	
	public static class BankAccountBuilder {
		private String owner;
		private double balance;
		private int number;
		
		public BankAccountBuilder(int number) {
			this.number = number;
		}
		
		public BankAccountBuilder withOwner(String owner) {
			this.owner = owner;
			return this;
		}
		
		public BankAccountBuilder withBalance(double balance) {
			this.balance = balance;
			return this;
		}
		
		public BankAccount build() {
			return new BankAccount(this);
		}		
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	

}
