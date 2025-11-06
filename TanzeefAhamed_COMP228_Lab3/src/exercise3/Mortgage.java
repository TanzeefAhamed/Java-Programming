package exercise3;

public abstract class Mortgage implements MortgageConstants {
    protected String mortgageNumber;
    protected String customerName;
    protected double mortgageAmount;
    protected double interestRate;
    protected int term;

    public Mortgage(String number, String name, double amount, double primeRate, int years) {
        mortgageNumber = number;
        customerName = name;

        if (amount > MAX_MORTGAGE_AMOUNT) {
            mortgageAmount = MAX_MORTGAGE_AMOUNT;
        } else {
            mortgageAmount = amount;
        }

        term = years;
        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM) {
            term = SHORT_TERM;
        }

        interestRate = primeRate;
    }

    public abstract void setInterestRate(double primeRate);

    public String getMortgageInfo() {
        return "Bank: " + BANK_NAME +
                "\nMortgage Number: " + mortgageNumber +
                "\nCustomer: " + customerName +
                "\nAmount: $" + mortgageAmount +
                "\nInterest Rate: " + interestRate +
                "\nTerm: " + term + " years";
    }
}
