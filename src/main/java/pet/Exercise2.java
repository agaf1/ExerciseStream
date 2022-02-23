package pet;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {

    List<Person> people;
    Exercise2 (List<Person> people){
        this.people = people;
    }

    public boolean findAnyPeopleHavePets( PetType petType ){

        return people.stream().flatMap(person -> person.getPets().stream())
                .filter(pet -> petType.equals(pet.getType())).findAny().isPresent();
    }

    public boolean doAllPeopleHavePets(){
        boolean answer = people.stream().filter(p-> !p.isPetPerson())
                .findAny().isPresent();
        return !answer;
    }

    public long howManyPeopleHaveTypePets(PetType petType){
        return people.stream().filter(p->p.hasPet(petType)).count();
    }

    public Person findPerson(String firstName, String lastName){
        Person person = people.stream()
                .filter(p->firstName.equalsIgnoreCase(p.getFirstName())&&lastName.equalsIgnoreCase(p.getLastName()))
                .findAny().orElse(null);
        return person;
    }

    public List<PetType> getAllPetTypesOfAllPeople(){
        return people.stream().flatMap(person -> person.getPets().stream()).map(Pet::getType).distinct()
                .collect(Collectors.toList());
    }
}
