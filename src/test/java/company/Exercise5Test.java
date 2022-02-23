package company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Exercise5Test extends Base{

    Exercise5 exercise5 = new Exercise5(company);

    @Test
    public void sortedTotalOrderValue(){
        List<Double> sortedTotalValues = exercise5.sortedTotalOrderValue();

        Assertions.assertEquals(Double.valueOf(857),sortedTotalValues.get(2));
        Assertions.assertEquals(Double.valueOf(71),sortedTotalValues.get(0));
    }

    @Test
    public void maximumTotalOrderValue(){
        Double maxOrderValue = exercise5.maximumTotalOrderValue();

        Assertions.assertEquals(Double.valueOf(857),maxOrderValue);
    }

    @Test
    public void customerWithMaxTotalOrderValue(){
        Customer customerWithMaxTotalOrderValue = exercise5.customerWithMaxTotalOrderValue();

        Assertions.assertEquals(company.getCustomerNamed("Mary"),customerWithMaxTotalOrderValue);
    }

}