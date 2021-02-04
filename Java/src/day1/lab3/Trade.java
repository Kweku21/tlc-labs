package day1.lab3;

public class Trade {

    private String id;
    private String symbol;
    private int quantity;
    private double price ;

    private static int counter;

    public Trade(String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;

        counter++;
    }


    public Trade(String id, String symbol, int quantity) {

        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;

        counter++;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String toString() {
        return "Trade{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public static int getCounter() {
        return counter;
    }
}
