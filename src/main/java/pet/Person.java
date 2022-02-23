package pet;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String firstName;
    private final String lastName;
    private final List<Pet> pets = new ArrayList<>();

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public boolean named(String name) {
        return name.equals(this.firstName + ' ' + this.lastName);
    }

    public boolean hasPet(PetType petType) {
        boolean result = pets.stream()
                .map(Pet::getType)
                .anyMatch(t -> petType.equals(t));
        return result;
    }

    public List<Pet> getPets() {
        return pets;
    }


    public Person addPet(PetType petType, String name, int age) {
        this.pets.add(new Pet(petType, name, age));
        return this;
    }

    public boolean isPetPerson() {
        boolean result = !pets.isEmpty();
        return result;
    }

}
