package ro.ase.acs.cts.refactor.phase1;

import ro.ase.acs.cts.refactor.exceptions.InvalidPeriodException;
import ro.ase.acs.cts.refactor.exceptions.InvalidValueException;

public class Loan {
	public double	loan_value, rate;	
	public int	daysActive;
	public static AccountType accountType = null;
	
	
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
	
	public static int ActiveDaysPerYear (int daysActive) throws InvalidPeriodException {
		int activeDaysPerYear=0;
		if(daysActive < 365) 
			throw new InvalidPeriodException();
		else {
			
			activeDaysPerYear=daysActive/365;
		}
		return activeDaysPerYear;
	}
	
	public static final double brokerFee=0.0125;
	
	public static double getFee(Loan account) throws InvalidPeriodException {
		return(brokerFee*account.loan_value*Math.pow(account.rate,ActiveDaysPerYear(account.daysActive)) - account.loan_value);
		}
	
	public static double MarketingStrategy(Loan account) throws InvalidPeriodException {
		double totalFee=0.0;
		switch(account.accountType) {
		case PREMIUM:
			totalFee=getFee(account);
		case SUPER_PREMIUM:
			totalFee=getFee(account);
		}
		
		return totalFee;
	}
	
	
}
