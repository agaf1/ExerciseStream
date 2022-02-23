package company;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise7 {

    private final Company company;
    Exercise7 (Company company){
        this.company = company;
    }

    public Map<String, List<Customer>> customersByCity(){
        return company.getCustomers().stream()
                .collect(Collectors.groupingBy(Customer::getCity));
    }

    public Map<String,List<Supplier>> itemsBySuppliers(){
        record Pair(Supplier supplier,String itemName){}

        return company.getSuppliers().stream()
                .flatMap(supplier ->{
                        return Arrays.stream(supplier.getItemNames()).map(String -> new Pair(supplier,String));
                })
                .collect(Collectors.groupingBy(Pair::itemName, Collectors.mapping(Pair::supplier, Collectors.toList())));
    }
}
