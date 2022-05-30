package Sheridan;

public class Manager extends Employee {

    public Manager(String name, int hours, double hourlySalary, double bonus) {
        super(name, hours, hourlySalary);
        this.bonus = bonus;
    }

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //@Override
    //public double calculatePay() {
    //    return super.calculatePay() + bonus;
   // }

   @Override
   public double calculatepay() {
       return super.calculatepay() + bonus;
   }


    @Override
    public String toString() {
        return super.toString() + ", bonus: " + bonus;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }

        Manager manager = (Manager) o;
        return this.getBonus() == manager.getBonus() && this.getHours() == manager.getHours()
                && this.getHourlySalary() == manager.getHourlySalary() && this.getName() != null
                && this.getName().equals(manager.getName());

    }

}
