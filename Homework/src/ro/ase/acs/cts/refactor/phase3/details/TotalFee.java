package ro.ase.acs.cts.refactor.phase3.details;

import ro.ase.acs.cts.refactor.exceptions.InvalidPeriodException;
import ro.ase.acs.cts.refactor.phase3.Loan;

public class TotalFee implements ActiveDaysInterface{
	public static double getFee(Loan account) throws InvalidPeriodException {
		
		return(brokerFee*account.loan_value*Math.pow(account.rate,ActiveDaysInterface.ActiveDaysPerYear(account.daysActive)) - account.loan_value);
		}
}
