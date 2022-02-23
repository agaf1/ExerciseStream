package company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

    private final String name;
    private final List<Customer> customers = new ArrayList<>();
    private final List<Supplier> suppliers = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addCustomer(Customer aCustomer) {
        this.customers.add(aCustomer);
    }

    public List<Customer> getCustomers() {
        return Collections.unmodifiableList(this.customers);
    }

    public Customer getMostRecentCustomer() {
        return this.customers.get(customers.size()-1);
    }

    public void addSupplier(Supplier supplier) {
        this.suppliers.add(supplier);
    }

    public List<Supplier> getSuppliers() {
        return Collections.unmodifiableList(this.suppliers);
    }

    public Customer getCustomerNamed(String name) {
        return customers.stream().filter(customer -> name.equals(customer.getName()))
                .findAny().orElse(null);
    }

}
