package Sheridan;

public class CEO {
    
    private double bonus;
    private double stockPrice;
    private double numberSharesSold;


    
    public double calculatePay() {
        return stockPrice * numberSharesSold + this.bonus;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getStockPrice() {
        return stockPrice;
    }
    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }
    public double getNumberSharesSold() {
        return numberSharesSold;
    }
    public void setNumberSharesSold(double numberSharesSold) {
        this.numberSharesSold = numberSharesSold;
    }
    
    
}
