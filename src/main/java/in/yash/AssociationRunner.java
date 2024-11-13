package in.yash;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.yash.model.Person;
import in.yash.model.PhoneNumber;
import in.yash.service.PersonServiceImpl;

@Component
public class AssociationRunner implements CommandLineRunner {
	
	@Autowired
	private PersonServiceImpl impl;

	@Override
	public void run(String... args) throws Exception {
		
		//create a person object
		Person p=new Person("Yash","Pune");
		
		//create a child object
		PhoneNumber p1=new PhoneNumber(213232323L,"airtel");
		PhoneNumber p2=new PhoneNumber(676787673L,"idea");
		
		//link parent to child
		p1.setPerson(p);
		p2.setPerson(p);
		
		Set<PhoneNumber>phoneNumbers=Set.of(p1,p2);
		//link child to parent
		p.setContactDetails(phoneNumbers);
		
		Person savedPerson=impl.savePerson(p);
		System.out.println(savedPerson.toString());
		
		
	
		

	}

}
