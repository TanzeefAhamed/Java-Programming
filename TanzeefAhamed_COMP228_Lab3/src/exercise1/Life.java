package exercise1;

public class Life extends Insurance {
    public Life() {
        super("Life");
    }

    public void setInsuranceCost() {
        monthlyCost = 65;
    }

    public String displayInfo() {
        return "Monthly cost for Life Insurance: $" + monthlyCost;
    }
}
