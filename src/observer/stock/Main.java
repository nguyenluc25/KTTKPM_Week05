package observer.stock;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Investor investor1 = new Investor("Investor 1");
        Investor investor2 = new Investor("Investor 2");
        Investor investor3 = new Investor("Investor 3");

        stock.addObserver(investor1);
        stock.addObserver(investor2);
        stock.addObserver(investor3);

        System.out.println("Thay đổi giá thành 200: ");
        stock.setStockPrice(200);

        System.out.println("----------------------------------------------------");

        System.out.println("Thay đổi giá thành 300: ");
        stock.setStockPrice(300);
    }
}
