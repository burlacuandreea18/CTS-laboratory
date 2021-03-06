package cts.burlacu.andreea.g1092.pattern.adapter;

public interface IVisaProcessor {

    public void transaction(String sourseAccount, String destinationAccount, double value, String currency);

    public void transactionWithCurrencyExchange(String sourseAccount, String destinationAccount, double value,
            String sourseCurrency, String destinationCurrency);

}