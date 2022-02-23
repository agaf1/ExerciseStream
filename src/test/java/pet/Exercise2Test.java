package pet;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static pet.PetType.CAT;

class Exercise2Test extends Base {

    private final Exercise2 exercise2 = new Exercise2(people);

    @Test
    public void doAnyPeopleHaveCats(){
        boolean result = exercise2.findAnyPeopleHavePets(CAT);

        assertTrue(result);
    }

    @Test
    public void doAllPeopleHavePets(){
        boolean result = exercise2.doAllPeopleHavePets();
        assertFalse(result);
    }

    @Test
    public void howManyPeopleHaveCats(){
        long result = exercise2.howManyPeopleHaveTypePets(CAT);
        assertEquals(2,result);
    }

    @Test
    public void findMarySmith(){
        Person person = exercise2.findPerson("Mary", "Smith");
        assertEquals("Mary",person.getFirstName());
        assertEquals("Smith",person.getLastName());
    }

    @Test
    public void getAllPetTypesOfAllPeople(){
        List<PetType> expectedTypes = List.of(PetType.CAT, PetType.DOG, PetType.TURTLE, PetType.HAMSTER, PetType.BIRD, PetType.SNAKE);
        List<PetType> actualTypes = exercise2.getAllPetTypesOfAllPeople();

        PetType[] expectedArr = expectedTypes.toArray(new PetType[expectedTypes.size()]);
        Arrays.sort(expectedArr);
        PetType[] actualArr = actualTypes.toArray(new PetType[actualTypes.size()]);
        Arrays.sort(actualArr);

        assertArrayEquals(expectedArr,actualArr);
    }

}