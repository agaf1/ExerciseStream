package pet;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static pet.PetType.CAT;

class Exercise1Test extends Base {



    @Test
    public void shouldGetFirstNameOfAllPeople() {

        Exercise1 exercise1 = new Exercise1();

        List<String> firstNames = exercise1.getFirstNameOfAllPeople(people);

        List<String> expectedFirstNames = List.of("Mary", "Bob", "Ted", "Jake", "Barry", "Terry", "Harry", "John");

        assertArrayEquals(expectedFirstNames.toArray(), firstNames.toArray());
    }

    @Test
    public void shouldGetNameOfMarySmithPets(){

        Exercise1 exercise1 = new Exercise1();

        List<String> namePets = exercise1.getNameOfPersonPets(people,"Mary Smith");

        assertEquals("Tabby",namePets.get(0));
    }

    @Test
    public void shouldGetPeopleWithCats(){

        Exercise1 exercise1 = new Exercise1();

        List<Person> peopleWithCat = exercise1.getPeopleWithTypePet(people,CAT);

        assertEquals(2,peopleWithCat.size());
    }

    @Test
    public void shouldGetPeopleWithoutCats(){
        Exercise1 exercise1 = new Exercise1();

        List<Person> peopleWithoutCats = exercise1.getPeopleWithoutTypePet(people,CAT);

        assertEquals(6,peopleWithoutCats.size());
    }

}