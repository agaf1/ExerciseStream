package pet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class Exercise5Test extends Base{

    Exercise5 exercise5 = new Exercise5(people);

    @Test
    public void partitionPetAndNonPetPeople(){
        Map<Boolean, List<Person>> partitionedPerson = exercise5.partitionPetAndNonPetPeople();

        Assertions.assertEquals(7,partitionedPerson.get(true).size());
        Assertions.assertEquals(1,partitionedPerson.get(false).size());
    }

    @Test
    public void getOldestPet(){
        Pet oldestPet = exercise5.getOldestPet();

        Assertions.assertEquals(4,oldestPet.getAge());
    }

    @Test
    public void getAveragePetAge(){
        double averagePetAge = exercise5.getAveragePetAge();

        Assertions.assertEquals(1.8888888888,averagePetAge,0.00001);
    }
}