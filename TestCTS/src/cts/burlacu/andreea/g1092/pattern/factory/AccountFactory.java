package cts.burlacu.andreea.g1092.pattern.factory;

public class AccountFactory {
	public static BankAccount getAccount(AccountType type, String id, double balance) {
		BankAccount account = null;
		switch(type) {
		case DEBIT:
			account = new Debit(id, balance, false, false);
			break;
		case CREDIT:
			account = new Credit(balance, id, 10, 100000);
		default:
			throw new UnsupportedOperationException();
		}
		return account;
	}
}
