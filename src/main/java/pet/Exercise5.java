package pet;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise5 {

    private final List<Person> people;

    public Exercise5(List<Person> people) {
        this.people = people;
    }

    public Map<Boolean, List<Person>> partitionPetAndNonPetPeople() {
        return people.stream().collect(Collectors.partitioningBy(Person::isPetPerson));
    }

    public Pet getOldestPet() {
        Comparator<Pet> petAgeComparator = Comparator.comparingInt(Pet::getAge);
        Pet oldestPet = people.stream()
                .map(person -> person.getPets()).flatMap(pet -> pet.stream())
                .collect(Collectors.maxBy(petAgeComparator)).orElse(null);

        return oldestPet;
    }

    public double getAveragePetAge() {

        return people.stream().map(Person::getPets).flatMap(pet -> pet.stream())
                .collect(Collectors.averagingDouble(Pet::getAge)).doubleValue();
    }
}
