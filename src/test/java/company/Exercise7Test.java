package company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class Exercise7Test extends Base{
    Exercise7 exercise7 = new Exercise7(company);

    @Test
    public void customersByCity(){
        Map<String, List<Customer>> customersByCity = exercise7.customersByCity();

        Assertions.assertEquals(2,customersByCity.get("London").size());
        Assertions.assertEquals(1,customersByCity.get("Liphook").size());
    }

    @Test
    public void itemsBySuppliers(){
        Map<String,List<Supplier>> itemsBySuppliers = exercise7.itemsBySuppliers();

        Assertions.assertEquals(2,itemsBySuppliers.get("sofa").size());
    }

}