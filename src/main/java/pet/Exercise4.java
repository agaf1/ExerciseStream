package pet;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {

    private final List<Person> people;
    Exercise4(List<Person> people) {
        this.people = people;
    }

    public IntSummaryStatistics getAgeStatisticsOfPets(){
        return people.stream().map(Person::getPets).flatMap(pet->pet.stream())
                .collect(Collectors.summarizingInt(Pet::getAge));
    }
}
