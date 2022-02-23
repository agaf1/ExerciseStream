package pet;

import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.List;

import static pet.PetType.CAT;

public class Base {

    protected static List<Person> people;

    @BeforeAll
    public static void setList() {
        people = new ArrayList<>();
        people.add(new Person("Mary", "Smith").addPet(CAT, "Tabby", 2));
        people.add(new Person("Bob", "Smith")
                .addPet(CAT, "Dolly", 3)
                .addPet(PetType.DOG, "Spot", 2));
        people.add(new Person("Ted", "Smith").addPet(PetType.DOG, "Spike", 4));
        people.add(new Person("Jake", "Snake").addPet(PetType.SNAKE, "Serpy", 1));
        people.add(new Person("Barry", "Bird").addPet(PetType.BIRD, "Tweety", 2));
        people.add(new Person("Terry", "Turtle").addPet(PetType.TURTLE, "Speedy", 1));
        people.add(new Person("Harry", "Hamster")
                .addPet(PetType.HAMSTER, "Fuzzy", 1)
                .addPet(PetType.HAMSTER, "Wuzzy", 1));
        people.add(new Person("John", "Doe"));
    }
}
