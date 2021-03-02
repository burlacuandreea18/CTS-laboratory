package ro.ase.csie.cts.g1092.week2;

import ro.ase.csie.cts.g1092.week2.exeptions.IllegalTransferException;
import ro.ase.csie.cts.g1092.week2.exeptions.InsufficientFundsExceptions;

public abstract class Account {
	public abstract double getBalance();
	public abstract void deposit(double amount);
	public abstract void transfer(Account destination, double amount) throws InsufficientFundsExceptions, IllegalTransferException;
	public abstract void withdraw(double amount) throws InsufficientFundsExceptions;
}
