package pet;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise1 {


    public List<String> getFirstNameOfAllPeople(List<Person> people){
        return people.stream().map(Person::getFirstName).collect(Collectors.toList());
    }

    public List<String> getNameOfPersonPets(List<Person> people,String fullName){
        Optional<Person> foundPerson =  people.stream().filter(p->p.named(fullName)).findAny();
         if(foundPerson.isPresent()){
                return foundPerson.get().getPets()
                        .stream().map(Pet::getName).collect(Collectors.toList());
         }
         return Collections.emptyList();
    }

    public List<Person> getPeopleWithTypePet (List<Person> people, PetType petType){
        List<Person> peopleWithPetType = people.stream().filter(p->p.hasPet(petType)).collect(Collectors.toList());
        return peopleWithPetType;
    }

    public List<Person> getPeopleWithoutTypePet(List<Person> people, PetType petType) {
        return people.stream()
                .filter(p-> !p.hasPet(petType))
                .collect(Collectors.toList());
    }
}
