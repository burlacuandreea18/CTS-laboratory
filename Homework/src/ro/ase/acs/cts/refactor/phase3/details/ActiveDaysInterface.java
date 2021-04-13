package ro.ase.acs.cts.refactor.phase3.details;

import ro.ase.acs.cts.refactor.exceptions.InvalidPeriodException;
import ro.ase.acs.cts.refactor.phase3.Loan;

public interface ActiveDaysInterface {
	public static final int NoOfDays=365;
	public static final double brokerFee=0.0125;
	
	public static int ActiveDaysPerYear(int daysActive) throws InvalidPeriodException {
		if (daysActive<NoOfDays) 
			throw new InvalidPeriodException();
		else
			return daysActive/NoOfDays;
	}
	public static double getFee(Loan account) throws InvalidPeriodException {
		
		return(brokerFee*account.loan_value*Math.pow(account.rate,ActiveDaysInterface.ActiveDaysPerYear(account.daysActive)) 
				- account.loan_value);
		}
	
	
	
	
}
