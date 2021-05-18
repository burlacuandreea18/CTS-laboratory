package cts.burlacu.andreea.g1092.pattern.factory;

public class Credit extends BankAccount {

	int noInstallments;
	double limit;
	
	public Credit(double Balance, String Id, int NoInstallments, double Limit) {
		super(Balance, Id);
		this.balance=Balance;
		this.id=Id;
		this.noInstallments=NoInstallments;
		this.limit=Limit;
	}
	
	

}
