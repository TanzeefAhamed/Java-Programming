package exercise2;

public class FullTimeTester extends GameTester {
    public FullTimeTester(String name) {
        super(name, true);
    }

    public double calculateSalary() {
        return 3000.00;
    }

    public String showInfo() {
        return super.showInfo() + " - Monthly Salary: $" + calculateSalary();
    }
}
