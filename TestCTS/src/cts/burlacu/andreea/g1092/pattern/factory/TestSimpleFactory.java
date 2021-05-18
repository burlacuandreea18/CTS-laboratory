package cts.burlacu.andreea.g1092.pattern.factory;

public class TestSimpleFactory {
	public static void main(String[] args) {
	BankAccount debit=AccountFactory.getAccount(AccountType.DEBIT, "27346493", 6785);
	}
}
