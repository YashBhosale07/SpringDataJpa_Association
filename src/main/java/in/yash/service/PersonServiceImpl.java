package in.yash.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.yash.exceptionClasses.PersonNotFoundException;
import in.yash.model.Person;
import in.yash.model.PhoneNumber;
import in.yash.repo.PersonRepo;
import jakarta.transaction.Transactional;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepo personRepo;
	
	@Override
	public Person savePerson(Person person) {
		return personRepo.save(person);
	}

	@Override
	@Transactional
	public Person getPerson(int id) {
		Person person =personRepo.findById(id).get();
		if(person==null) {
			throw new PersonNotFoundException("Person is not present with id: "+id);
		}
		return person;
	}

	@Override
	public String deletePerson(int id) {
		Person person=personRepo.findById(id).orElseThrow(()->new PersonNotFoundException("Person is not present with id: "+id));
		personRepo.deleteById(id);
		return "Person is deleted by id: "+id;
	}

	@Override
	@Transactional
	public Person updatePerson(Person person) {
		Person p=personRepo.findById(person.getPid()).get();
		if(p==null) {
			throw new PersonNotFoundException("Person is not present with id: "+person.getPid());
		}
		  if (person.getName() != null) {
			  p.setName(person.getName());
		  } 
		  if (person.getAddress() != null) {
			  p.setAddress(person.getAddress());
		  }
		  if (person.getContactDetails()!=null) {
			p.setContactDetails(person.getContactDetails());
		}
		
		return person;
	}

	@Override
	@Transactional
	public Person updatePerson(int id, String service, String name) {
		Person p=personRepo.findById(id).get();
		p.setName(name);
		for (PhoneNumber number : p.getContactDetails()) {
			if(number.getRegNo()==1) {
				number.setProvider(service);
			}
		}
		return p;
	}
	
	
	
	
}
