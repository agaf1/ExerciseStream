package pet;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise3 {

    private final List<Person> people;

    Exercise3(List<Person> people) {
        this.people = people;
    }

    public Map<PetType, Long> getCountsByPetType() {
        return people.stream().flatMap(p -> p.getPets().stream())
                .map(Pet::getType)
                .collect(Collectors.groupingBy(p -> p, Collectors.counting()));
    }

    public Map<String, List<Person>> getPeopleByLastName() {
        return people.stream()
                .collect(Collectors.groupingBy(person -> person.getLastName()));
    }

    public Map<PetType, List<Person>> getPeopleByTheirPets() {
        record Pair(Person person, PetType type) {}

         return people.stream()
                .flatMap(person -> {
                    return person.getPets().stream().map(Pet::getType).distinct().map(petType -> new Pair(person, petType));
                })
                .collect(Collectors.groupingBy(Pair::type, Collectors.mapping(Pair::person, Collectors.toList())));
    }
}
