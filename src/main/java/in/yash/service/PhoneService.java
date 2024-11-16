package in.yash.service;

import in.yash.model.PhoneNumber;

public interface PhoneService {
	
//	String savePhoneNumber(Iterable<PhoneNumber> phoneNumber);
	PhoneNumber getPhoneById(int id);
	PhoneNumber savePhoneNumber(PhoneNumber number,int id);
	String deleteById(int id);
	
}
