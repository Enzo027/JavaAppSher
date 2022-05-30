package Sheridan;

public class Program {
    
    public static void main (String args[]) {
        Employee employee = new Employee(null, 0, 0);
        employee.setHourlySalary(25.0);
        employee.setHours(40);

        Manager manager = new Manager(null, 0, 0, 0);
        manager.setHours(40);
        manager.setHourlySalary(35.0);
        manager.setBonus(500);
        manager.calculatepay();
        manager.calculatePay();
        
        CEO ceo = new CEO();
        ceo.setBonus(500000);
        ceo.setStockPrice(12000);
        ceo.setNumberSharesSold(5);

        System.out.println("Employee pay : " + employee.calculatePay());
        System.out.println("Manager pay : " + manager.calculatepay());
        System.out.println("CEO pay : " + ceo.calculatePay());
    }
    
}