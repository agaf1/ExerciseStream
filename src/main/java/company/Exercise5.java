package company;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise5 {

    private final Company company;
    Exercise5 (Company company){
        this.company = company;
    }

    public List<Double> sortedTotalOrderValue(){
        return company.getCustomers().stream().map(customer -> customer.getTotalOrderValue())
                .sorted()
                .collect(Collectors.toList());
    }

    public Double maximumTotalOrderValue(){
        return  findCustomerWithMaxValue()
                .map(Customer::getTotalOrderValue)
                .orElse(Double.valueOf(0));
    }

    public Customer customerWithMaxTotalOrderValue(){
        return findCustomerWithMaxValue().orElse(null);
    }

    private Optional<Customer> findCustomerWithMaxValue(){
        return company.getCustomers().stream()
                .max(Comparator.comparingDouble(Customer::getTotalOrderValue));
    }

}
