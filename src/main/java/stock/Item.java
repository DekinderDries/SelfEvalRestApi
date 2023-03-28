package stock;

public class Item {
    private String name;
    private String description;
    private int price;
    private StockAmount stockAmount;

    public Item(String name, String description, int price, StockAmount stockAmount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }

}
