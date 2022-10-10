package services.CommandService.impl;

import services.CommandService.Order;
import services.CommandService.Stock;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
