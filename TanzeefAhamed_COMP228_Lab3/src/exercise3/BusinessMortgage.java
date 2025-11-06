package exercise3;

public class BusinessMortgage extends Mortgage {
    public BusinessMortgage(String number, String name, double amount, double primeRate, int years) {
        super(number, name, amount, primeRate, years);
        setInterestRate(primeRate);
    }

    public void setInterestRate(double primeRate) {
        interestRate = primeRate + 0.01;
    }
}
