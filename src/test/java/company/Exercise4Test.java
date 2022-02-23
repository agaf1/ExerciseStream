package company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Exercise4Test extends Base{
    Exercise4 exercise4 = new Exercise4(company);

    @Test
    public void findSupplierNames(){
        List<String> supplierNames = exercise4.findSupplierNames();
        List<String> expectedList = List.of("Shedtastic",
                "Splendid Crocks",
                "Annoying Pets",
                "Gnomes 'R' Us",
                "Furniture Hamlet",
                "SFD",
                "Doxins");
        Assertions.assertArrayEquals(expectedList.toArray(),supplierNames.toArray());
    }

    @Test
    public void countSuppliersWithMoreThanTwoItems(){
        int result = exercise4.countSuppliersWithMoreThanTwoItems();
        Assertions.assertEquals(5,result);
    }

    @Test
    public void whoSuppliesSandwichToaster(){
        String nameSupplier = exercise4.whoSuppliesThisItem("sandwich toaster");
        Assertions.assertEquals("Doxins",nameSupplier);
    }

    @Test
    public void filterOrderValues(){
        List<Double> orderValues = exercise4.filterOrderValues(1.5);
        List<Double> expectedList = List.of(372.5, 1.75);
        Assertions.assertArrayEquals(expectedList.toArray(),orderValues.toArray());
    }

}