package company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Exercise3Test extends Base{

    Exercise3 exercise3 = new Exercise3(company);

    @Test
    public void findItemNames(){
        List<String> itemNames = exercise3.findItemNames();
        Object[] sortedItemNames = itemNames.stream().sorted().toArray();
        List<String> expectedList = List.of("shed", "big shed", "bowl", "cat", "cup", "chair", "dog",
                "goldfish", "gnome", "saucer", "sofa", "table");
        Object[] sortedExpectedList = expectedList.stream().sorted().toArray();
        Assertions.assertArrayEquals(sortedExpectedList,sortedItemNames);
    }

}