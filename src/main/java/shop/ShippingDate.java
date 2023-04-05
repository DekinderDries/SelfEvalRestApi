package shop;

import domain.StockAmount;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;

public class ShippingDate {

    //calculate shipping dates
    //1 daya after order made when items are on stock at that time.
    //7days after order is made when items are not in stock.
    public static LocalDate now(ZoneId zone) {
        return now(Clock.system(zone).getZone());
    }
//    public int shippingDate(StockAmount stockAmount){
//        if(stockAmount != 0) return shippingDate(LocalDate.now().plusDays(1));
//        if(stockAmount == 0) return shippingDate(LocalDate.now().plusDays(7));
//    }
}
