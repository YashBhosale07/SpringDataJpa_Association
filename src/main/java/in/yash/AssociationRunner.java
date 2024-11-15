package in.yash;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import in.yash.model.Person;
import in.yash.model.PhoneNumber;
import in.yash.service.PersonServiceImpl;
import in.yash.service.PhoneService;
import jakarta.transaction.Transactional;

@Component
public class AssociationRunner implements CommandLineRunner {
	
	@Autowired
	private PersonServiceImpl impl;
	
	@Autowired
	private PhoneService phoneService;

	@Override
	public void run(String... args) throws Exception {

		
//		//create a person object
//		
//		
//		//create a child object
//		PhoneNumber p1=new PhoneNumber(213232323L,"airtel");
//		PhoneNumber p2=new PhoneNumber(676787673L,"idea");
//		
//		Person p=new Person("Yash","Pune");
//	
//		//link parent to child
//		p1.setPerson(p);
//		p2.setPerson(p);
//		
//		Set<PhoneNumber>phoneNumbers=Set.of(p1,p2);
//		//link child to parent
//		p.setContactDetails(phoneNumbers);
////		phoneService.savePhoneNumber(phoneNumbers);
//		Person savedPerson=impl.savePerson(p);
////		System.out.println(savedPerson.toString());
		
//		PhoneNumber number=new PhoneNumber(2323212L,"jio");
//		PhoneNumber number2=new PhoneNumber(23213123L,"airtel");
//		Person p=new Person("Sam","Panvel");
//		number.setPerson(p);
//		number2.setPerson(p);
//		Set<PhoneNumber>phoneNumbers=Set.of(number,number2);
//		p.setContactDetails(phoneNumbers);
//		phoneService.savePhoneNumber(phoneNumbers);
		
		
//		parent to child fetch
		
//		
//		//child to parent fetch
//		PhoneNumber num=phoneService.getPhoneById(1);
//		System.out.println(num);
//		System.out.println(num.getPerson());
		
//		Person person=impl.getPerson(1);
//		person.setAddress("pune");
//		for (PhoneNumber number : person.getContactDetails()) {
//			if(number.getRegNo()==1) {
//				number.setProvider("hgd");
//			}
//		}
//		impl.savePerson(person);
//		
		
		
		
		
	}
	
//	public void loadsthePerson(int id) {
//	    Person person = impl.getPerson(id);  // Fetch person based on id
//	    Set<PhoneNumber> number = person.getContactDetails();  // Get the contact details
//	    System.out.println(person);  // Print person details
//	    System.out.println(number);  // Print contact details (PhoneNumbers)
//	}

}
