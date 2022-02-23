package company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {

    private final Company company;
    Exercise4 (Company company){
        this.company = company;
    }

    public List<String> findSupplierNames(){
        return company.getSuppliers().stream()
                .map(Supplier::getName)
                .collect(Collectors.toList());
    }

    public int countSuppliersWithMoreThanTwoItems(){

        return (int)company.getSuppliers().stream()
                .filter(supplier -> supplier.getItemNames().length>2)
                .count();
    }

    public String whoSuppliesThisItem(String itemName){
        record Pair(Supplier supplier, String lineItemName){}

        return company.getSuppliers().stream()
                .flatMap(supplier -> {
                    return Arrays.stream(supplier.getItemNames())
                            .map(lineItemName->new Pair(supplier,lineItemName));
                }).filter(p -> itemName.equals(p.lineItemName))
                .collect(Collectors.toList())
                .stream()
                .filter(p->itemName.equals(p.lineItemName))
                .map(p->p.supplier.getName()).findAny().orElse(null);
    }

    public List<Double> filterOrderValues(Double value){
        return company.getMostRecentCustomer().getOrders().stream()
                .map(order -> order.getValue())
                .filter(v -> v > value)
                .collect(Collectors.toList());
    }
}
