package in.yash.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.yash.model.Person;
import in.yash.model.PhoneNumber;
import in.yash.repo.PersonRepo;
import in.yash.repo.PhoneRepo;
import java.util.*;

@Service
public class PhoneServiceImpl implements PhoneService {

	@Autowired
	private PhoneRepo phoneRepo;
	
	@Autowired
	private PersonRepo personRepo;
	
//	@Override
//	public String savePhoneNumber(Iterable<PhoneNumber> phoneNumber) {
//		for (PhoneNumber number : phoneNumber) {
//			phoneRepo.save(number);
//		}
//		return ((Set<PhoneNumber>) phoneNumber).size()+" ";
//	}

	@Override
	public PhoneNumber getPhoneById(int id) {
		return phoneRepo.findById(id).get();
	
	}

	@Override
	public PhoneNumber savePhoneNumber(PhoneNumber number,int id) {
		Person person=personRepo.findById(id).get();
		number.setPerson(person);
		person.getContactDetails().add(number);
		personRepo.save(person);
		return number;
	}

	@Override
	public String deleteById(int id) {
		Optional<PhoneNumber>number=phoneRepo.findById(id);
		
		if(number.isPresent()) {
			number.get().setPerson(null);
			phoneRepo.deleteById(id);
			return "Phone Number deleted by id: "+id;
		}
		
		return "Phone number not found with id: "+id;
	}

}
