package pet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.IntSummaryStatistics;

class Exercise4Test extends Base {

    Exercise4 exercise4 = new Exercise4(people);

    @Test
    public void getAgeStatisticsOfPets(){
        IntSummaryStatistics agePetsStatistics = exercise4.getAgeStatisticsOfPets();

        Assertions.assertEquals(17,agePetsStatistics.getSum());
        Assertions.assertEquals(1,agePetsStatistics.getMin());
        Assertions.assertEquals(4,agePetsStatistics.getMax());
    }
}
