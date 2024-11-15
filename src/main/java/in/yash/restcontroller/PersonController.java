package in.yash.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.yash.model.Person;
import in.yash.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/getPerson/{id}")
	public ResponseEntity<Person>getPerson(@PathVariable int id){
		Person p=personService.getPerson(id);
		return new ResponseEntity<Person>(p,HttpStatus.FOUND);
	}
	
	@PutMapping("/updatePerson/{id}/{service}/{name}")
	public ResponseEntity<Person>updatePerson(@PathVariable int id,@PathVariable String service,@PathVariable String name){
		Person p=personService.updatePerson(id,service,name);
		return new ResponseEntity<Person>(p,HttpStatus.ACCEPTED);
	}

}
