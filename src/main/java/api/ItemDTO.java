package api;

import domain.StockAmount;

public class ItemDTO {
    private String productName;
    private String description;
    private int price;
    private StockAmount stockAmount;

    public ItemDTO(String productName, String description, int price, StockAmount stockAmount) {
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }

}
