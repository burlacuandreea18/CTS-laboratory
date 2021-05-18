package cts.burlacu.andreea.g1092.pattern.adapter;

public class AccountAdapter implements IVisaProcessor {

	BankAccount sourceAccount = null;
	BankAccount destinationAccount = null;


	@Override
	public void transaction(String sourseAccount, String destinationAccount, double value, String currency) {
		this.destinationAccount.balance += value;
		this.sourceAccount.balance = sourceAccount.balance - value;
		System.out.println("Tranzactie efectuata!");

	}

	@Override
	public void transactionWithCurrencyExchange(String sourseAccount, String destinationAccount, double value,
			String sourseCurrency, String destinationCurrency) {

	}

}
