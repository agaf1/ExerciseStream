package company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exercise2Test extends Base{

    Exercise2 exercise2 = new Exercise2(company);

    @Test
    public void doAllCustomersLiveInLondon(){
        boolean answer = exercise2.doAllCustomersLiveInCity("London");
        assertFalse(answer);
    }

    @Test
    public void doAnyCustomersLiveInLondon(){
        boolean answer = exercise2.doAnyCustomersLiveInCity("London");
        assertTrue(answer);
    }

    @Test
    public void howManyCustomersLiveInLondon(){
        int count = exercise2.howManyCustomersLiveInCity("London");
        Assertions.assertEquals(2,count);
    }

    @Test
    public void getLondonCustomers(){
        List<Customer> customerFromLondon = exercise2.getCityCustomers("London");
        Assertions.assertEquals(2,customerFromLondon.size());
    }

    @Test
    public void getCustomersWhoDontLiveInLondon(){
        List<Customer> customers = exercise2.getCustomersWhoDontLiveInCity("London");
        Assertions.assertEquals(1,customers.size());
    }

    @Test
    public void getCustomersWhoDoAndDoNotLiveInLondon(){
        Map<Boolean,List<Customer>> customers = exercise2.getCustomersWhoDoAndDoNotLiveInCity("London");
        Assertions.assertEquals(2,customers.get(true).size());
        Assertions.assertEquals(1,customers.get(false).size());
    }

    @Test
    public void findMary(){
        Customer mary = exercise2.findCustomerByName("Mary");
        Assertions.assertEquals("Mary",mary.getName());
    }

}