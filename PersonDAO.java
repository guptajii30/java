package myPack.ganesh.PersonCrud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
    private static List<Person> person = new ArrayList<>();

    static {
        person.add(new Person(1, "Kedar", 45));
        person.add(new Person(2, "Ninad", 48));
        person.add(new Person(3, "Nilesh", 40));
        person.add(new Person(4, "Swami", 35));
    }

    public List<Person> displayAll() {
        return new ArrayList<>(person); // Return a copy to prevent external modification
    }

    public Person savePerson(Person personParam) {
        // Ensure no duplicate IDs are added
        for (Person per : person) {
            if (per.getPersonId() == personParam.getPersonId()) {
                throw new IllegalArgumentException("Person with ID " + personParam.getPersonId() + " already exists.");
            }
        }
        person.add(personParam);
        return personParam;
    }

    public Person findPerson(int pid) {
        for (Person per : person) {
            if (per.getPersonId() == pid) {
                return per;
            }
        }
        return null; // Return null if person not found
    }

    public Person updatePerson(Person per) {
        int pid = per.getPersonId();
        for (int i = 0; i < person.size(); i++) {
            if (person.get(i).getPersonId() == pid) {
                return person.set(i, per); // Update and return updated person
            }
        }
        return null; // Return null if person not found
    }

    public Person deletePersonById(int pid) {
        Iterator<Person> perIterator = person.iterator();
        while (perIterator.hasNext()) {
            Person per = perIterator.next();
            if (per.getPersonId() == pid) {
                perIterator.remove();
                return per; // Return the deleted person
            }
        }
        return null; // Return null if person not found
    }
}
