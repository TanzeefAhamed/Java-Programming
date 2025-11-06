package exercise2;

public class PartTimeTester extends GameTester {
    private int hoursWorked;

    public PartTimeTester(String name, int hours) {
        super(name, false);
        hoursWorked = hours;
    }

    public double calculateSalary() {
        return hoursWorked * 20.00;
    }

    public String showInfo() {
        return super.showInfo() + " - Hours Worked: " + hoursWorked + " - Pay: $" + calculateSalary();
    }
}
