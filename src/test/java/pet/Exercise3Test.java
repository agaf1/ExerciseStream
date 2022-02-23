package pet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class Exercise3Test extends Base{
    Exercise3 exercise3 = new Exercise3(people);

    @Test
    public void getCountsByPetType(){
        Map<PetType, Long> petTypeCounts = exercise3.getCountsByPetType();

        Assertions.assertEquals(Long.valueOf(2), petTypeCounts.get(PetType.CAT));
        Assertions.assertEquals(Long.valueOf(2), petTypeCounts.get(PetType.DOG));
        Assertions.assertEquals(Long.valueOf(2), petTypeCounts.get(PetType.HAMSTER));
        Assertions.assertEquals(Long.valueOf(1), petTypeCounts.get(PetType.SNAKE));
        Assertions.assertEquals(Long.valueOf(1), petTypeCounts.get(PetType.TURTLE));
        Assertions.assertEquals(Long.valueOf(1), petTypeCounts.get(PetType.BIRD));
    }

    @Test
    public void getPeopleByLastName(){
        Map<String, List<Person>> peopleByLastName = exercise3.getPeopleByLastName();

        Assertions.assertEquals(3,peopleByLastName.get("Smith").size());
    }

    @Test
    public void getPeopleByTheirPets(){
        Map<PetType,List<Person>> peopleByTheirPets = exercise3.getPeopleByTheirPets();

       
        Assertions.assertEquals(2, peopleByTheirPets.get(PetType.CAT).size());
        Assertions.assertEquals(2, peopleByTheirPets.get(PetType.DOG).size());
        Assertions.assertEquals(1, peopleByTheirPets.get(PetType.HAMSTER).size());
        Assertions.assertEquals(1, peopleByTheirPets.get(PetType.TURTLE).size());
        Assertions.assertEquals(1, peopleByTheirPets.get(PetType.BIRD).size());
        Assertions.assertEquals(1, peopleByTheirPets.get(PetType.SNAKE).size());
    }
}