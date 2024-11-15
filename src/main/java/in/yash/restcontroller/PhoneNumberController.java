package in.yash.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.yash.model.PhoneNumber;
import in.yash.service.PhoneService;

@RestController
public class PhoneNumberController {
	
	@Autowired
	private PhoneService phoneService;
	
	@GetMapping("/getPhoneNumber/{id}")
	public ResponseEntity<PhoneNumber>getPhoneNumber(@PathVariable int id){
		PhoneNumber number=phoneService.getPhoneById(id);
		return new ResponseEntity<PhoneNumber>(number,HttpStatus.FOUND);
	}

}
