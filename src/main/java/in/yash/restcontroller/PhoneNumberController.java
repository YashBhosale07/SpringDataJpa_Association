package in.yash.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/savePhoneNumber/{id}")
		public ResponseEntity<PhoneNumber>savePhoneNumber(@RequestBody PhoneNumber number,@PathVariable int id){
			PhoneNumber savedNumber=phoneService.savePhoneNumber(number,id);
			return new ResponseEntity<PhoneNumber>(savedNumber,HttpStatus.OK);
		}
	
	@DeleteMapping("/deletePhoneNumber/{id}")
	public ResponseEntity<String>deletePhoneNumber(@PathVariable int id){
		String ans=phoneService.deleteById(id);
		return new ResponseEntity<String>(ans,HttpStatus.OK);
	}
	
}


