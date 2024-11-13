package in.yash.service;

import in.yash.model.PhoneNumber;

public interface PhoneService {
	
	String savePhoneNumber(Iterable<PhoneNumber> phoneNumber);
	
}
