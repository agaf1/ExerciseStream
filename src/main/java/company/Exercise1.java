package company;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {

    public List<String> getCustomerNames(Company company){
        return company.getCustomers().stream().map(customer -> customer.getName())
                .collect(Collectors.toList());
    }

    public List<String> getCustomerCities(Company company){
        return company.getCustomers().stream().map(customer -> customer.getCity())
                .collect(Collectors.toList());
    }

    public List<Customer> getCityCustomers(Company company,String city){
        return company.getCustomers().stream().filter(customer -> city.equals(customer.getCity()))
                .collect(Collectors.toList());
    }
}
