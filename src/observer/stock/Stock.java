package observer.stock;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject{
    private List<Observer> investors = new ArrayList<>();
    private double stockPrice;


    @Override
    public void addObserver(Observer observer) {
        investors.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        investors.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer investor : investors) {
            investor.update(stockPrice);
        }
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }
}
