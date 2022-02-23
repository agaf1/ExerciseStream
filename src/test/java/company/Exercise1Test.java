package company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Exercise1Test extends Base{

    @Test
    public void getCustomerNames(){
        Exercise1 exercise1 = new Exercise1();
        List<String> names = exercise1.getCustomerNames(company);
        List<String> expectedNames = List.of("Fred", "Mary", "Bill");

        Assertions.assertArrayEquals(expectedNames.toArray(),names.toArray());
    }

    @Test
    public void getCustomerCities(){
        Exercise1 exercise1 = new Exercise1();
        List<String> cities = exercise1.getCustomerCities(company);
        List<String> expectedCities = List.of("London", "Liphook", "London");

        Assertions.assertArrayEquals(expectedCities.toArray(),cities.toArray());
    }

    @Test
    public void getLondonCustomers(){
        Exercise1 exercise1 = new Exercise1();
        List<Customer> customersFromLondon = exercise1.getCityCustomers(company,"London");

        Assertions.assertEquals(2,customersFromLondon.size());
    }
}