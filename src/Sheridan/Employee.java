package Sheridan;

public class Employee {
    protected String name;
    protected int hours;
    protected double hourlySalary;

    public Employee(String name, int hours, double hourlySalary) {
        this.name = name;
        this.hours = hours;
        this.hourlySalary = hourlySalary;
    }
    
    public final double calculatePay() {
        return hours * hourlySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    @Override
    public String toString() {
        return "name: " + this.name + ", hours: " + this.hours + ", hourlySalary: " + this.getHourlySalary();
    }

    public double calculatepay() {
        return hours * hourlySalary;
    }
}
