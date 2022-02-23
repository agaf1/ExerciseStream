package company;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise2 {

    private final Company company;
    Exercise2 (Company company){
        this.company = company;
    }

    public boolean doAllCustomersLiveInCity(String city){
        return company.getCustomers().stream().allMatch(customer -> city.equals(customer.getCity()));
    }

    public boolean doAnyCustomersLiveInCity(String city){
        return company.getCustomers().stream().anyMatch(customer -> city.equals(customer.getCity()));
    }

    public int howManyCustomersLiveInCity(String city){
        return (int)company.getCustomers().stream().filter(customer -> city.equals(customer.getCity()))
                .count();
    }

    public List<Customer> getCityCustomers(String city){
        return company.getCustomers().stream().filter(customer -> city.equals(customer.getCity()))
                .collect(Collectors.toList());
    }

    public List<Customer> getCustomersWhoDontLiveInCity(String city){
        return company.getCustomers().stream().filter(customer-> !city.equals(customer.getCity()))
                .collect(Collectors.toList());
    }

    public Map<Boolean,List<Customer>> getCustomersWhoDoAndDoNotLiveInCity(String city){
        return company.getCustomers().stream()
                .collect(Collectors.partitioningBy(customer -> city.equals(customer.getCity())));
    }

    public Customer findCustomerByName(String customerName){
        return company.getCustomers().stream()
                .filter(customer -> customerName.equals(customer.getName()))
                .findAny().orElse(null);
    }
}
