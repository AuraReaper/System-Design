package ShoppingCart;

import Payments.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class Shopping {

    private List<Item> items;
    public PaymentStrategy payementMode;

    public void setPaymentMode(PaymentStrategy payementMode) {
        this.payementMode = payementMode;
    }

    public Shopping() {
        items = new ArrayList<>();
    }

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
    }

    public int calculateTotalPrice() {
        int amount = 0;
        for (Item item : items) {
            amount += item.getItemPrice();
        }

        return amount;
    }

    public void pay() {
        int amount = calculateTotalPrice();
        payementMode.pay(amount);
    }
}
