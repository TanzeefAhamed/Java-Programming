package exercise2;

public abstract class GameTester {
    protected String testerName;
    protected boolean isFullTime;

    public GameTester(String name, boolean fullTime) {
        testerName = name;
        isFullTime = fullTime;
    }

    public String getTesterName() {
        return testerName;
    }

    public boolean getIsFullTime() {
        return isFullTime;
    }

    public abstract double calculateSalary();

    public String showInfo() {
        String jobType;
        if (isFullTime) {
            jobType = "Full-Time";
        } else {
            jobType = "Part-Time";
        }
        return "Tester: " + testerName + " (" + jobType + ")";
    }
}
