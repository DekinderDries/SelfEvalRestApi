package domain;

public class Item {
    private String productName;
    private String description;
    private int price;
    private StockAmount stockAmount;

    public Item(String productName, String description, int price, StockAmount stockAmount) {
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }


}
