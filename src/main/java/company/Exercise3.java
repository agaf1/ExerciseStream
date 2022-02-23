package company;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {

    private final Company company;
    Exercise3 (Company company){
        this.company = company;
    }

    public List<String> findItemNames(){
        return company.getCustomers().stream()
                .map(Customer::getOrders)
                .flatMap(orders -> orders.stream())
                .map(Order::getLineItems)
                .flatMap(lineItems -> lineItems.stream())
                .map(LineItem::getName)
                .distinct()
                .collect(Collectors.toList());
    }
}
