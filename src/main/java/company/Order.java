package company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Order {

    private static final AtomicInteger NEXT_ORDER_NUMBER = new AtomicInteger(1);
    private final int orderNumber;
    private final List<LineItem> lineItems = new ArrayList<>();
    private boolean delivered;

    public Order() {
        this.orderNumber = NEXT_ORDER_NUMBER.getAndIncrement();
    }

    public static void resetNextOrderNumber() {
        NEXT_ORDER_NUMBER.set(1);
    }

    public void addLineItem(LineItem aLineItem) {
        this.lineItems.add(aLineItem);
    }

    public List<LineItem> getLineItems() {
        return this.lineItems;
    }

    @Override
    public String toString() {
        return "order " + this.orderNumber + " items: " + this.lineItems.size();
    }

    public double getValue() {
        return lineItems.stream()
                .collect(Collectors.summingDouble(LineItem::getValue));
    }
}
