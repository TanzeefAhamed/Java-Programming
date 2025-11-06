package exercise3;

public class PersonalMortgage extends Mortgage {
    public PersonalMortgage(String number, String name, double amount, double primeRate, int years) {
        super(number, name, amount, primeRate, years);
        setInterestRate(primeRate);
    }

    public void setInterestRate(double primeRate) {
        interestRate = primeRate + 0.02;
    }
}
