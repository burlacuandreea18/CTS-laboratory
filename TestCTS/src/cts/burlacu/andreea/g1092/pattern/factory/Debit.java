package cts.burlacu.andreea.g1092.pattern.factory;

public class Debit extends BankAccount{

	boolean salaryOption;
	boolean overdraftOption;
	
	public Debit(String Id, double Balance, boolean salaryOption, boolean overdraftOption) {
		super(Balance, Id);
		this.balance=Balance;
		this.id=id;
		this.salaryOption=salaryOption;
		this.overdraftOption=overdraftOption;
	}
	
	
	
	
}
