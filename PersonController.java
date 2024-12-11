package myPack.ganesh.PersonCrud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person") // Optional: Base path for clarity
public class PersonController {
    
    @Autowired
    PersonDAO service;

    @GetMapping
    public List<Person> displayAllPerson() {
        return service.displayAll();
    }

    @PostMapping
    public ResponseEntity<Object> createPerson(@RequestBody Person per) {
        Person newPerson = service.savePerson(per);
        return ResponseEntity.status(HttpStatus.CREATED).body("New person data added with id=" + newPerson.getPersonId());
    }

    @GetMapping("/person/{pid}")
    public ResponseEntity<Object> displayPersonInfo(@PathVariable int pid) {
        Person per = service.findPerson(pid);
        if (per != null) {
            return ResponseEntity.ok(per);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Person not found.");
        }
    }

    @PostMapping("/updateperson")
	public String updatePerson(@RequestBody Person per) {
		Person updatePerson = service.updatePerson(per);
		if(updatePerson == null)
			throw new IllegalArgumentException("PersonId = " + per.getPersonId());
		return "Person Data updated with id = " + updatePerson.getPersonId();
	}


    @DeleteMapping("/person/{pid}")
    public ResponseEntity<Object> deletePerson(@PathVariable int pid) {
        Person per = service.deletePersonById(pid);
        if (per != null) {
            return ResponseEntity.ok("Person details deleted: " + per);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Person not found for deletion.");
        }
    }
}
