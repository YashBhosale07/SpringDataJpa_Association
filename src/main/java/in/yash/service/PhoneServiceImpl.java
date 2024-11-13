package in.yash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.yash.model.PhoneNumber;
import in.yash.repo.PhoneRepo;
import java.util.*;

@Service
public class PhoneServiceImpl implements PhoneService {

	@Autowired
	private PhoneRepo phoneRepo;
	
	@Override
	public String savePhoneNumber(Iterable<PhoneNumber> phoneNumber) {
		for (PhoneNumber number : phoneNumber) {
			phoneRepo.save(number);
		}
		return ((Set<PhoneNumber>) phoneNumber).size()+" ";
	}

}
