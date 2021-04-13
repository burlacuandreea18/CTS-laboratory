package ro.ase.acs.cts.refactor.phase3;

import ro.ase.acs.cts.refactor.exceptions.InvalidPeriodException;
import ro.ase.acs.cts.refactor.exceptions.InvalidValueException;
import ro.ase.acs.cts.refactor.phase3.details.ActiveDaysInterface;

public class Loan {
	public double	loan_value, rate;	
	public int	daysActive;
	public static AccountType accountType = null;
	private ActiveDaysInterface totalFee = null;
	
	
	public double getLoan_Value() {
		System.out.println("The loan value is " + loan_value);
		return loan_value;
	}
	
	public void setLoan_Value(double loan_value) throws InvalidValueException {
		if(loan_value<0)
			throw new InvalidValueException();
		else
		{
			this.loan_value = loan_value;
		}
	}
	
	public double getRate() {
		System.out.println("The rate is "+rate);
		return rate;
	}
	
	
	public double getMonthlyRate() {
		return loan_value*rate;
	}
	
	
	public Loan(double value, double rate, AccountType accountType) throws InvalidValueException {
		if(value<0)
			throw new InvalidValueException();
		else
		{
			loan_value = value;
		}
		this.rate = rate;
		this.accountType = accountType;
	}
	

	@Override
	public String toString() {
		return "Loan: [loan value=" + loan_value + ", rate=" + rate + ", daysActive=" + daysActive + "]";
	}
	

	public static double MarketingStrategy(Loan account) throws InvalidPeriodException {
		double totalFee=0.0;
		switch(account.accountType) {
		case PREMIUM:
			totalFee=ActiveDaysInterface.getFee(account);
		case SUPER_PREMIUM:
			totalFee=ActiveDaysInterface.getFee(account);
		}
		
		return totalFee;
	}
	
	
}
