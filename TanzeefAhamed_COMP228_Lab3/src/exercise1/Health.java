package exercise1;

public class Health extends Insurance {
    public Health() {
        super("Health");
    }

    public void setInsuranceCost() {
        monthlyCost = 172;
    }

    public String displayInfo() {
        return "Monthly cost for Health Insurance: $" + monthlyCost;
    }
}
