package in.yash.GlobalException;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.yash.exceptionClasses.ErrorResponse;
import in.yash.exceptionClasses.PersonNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(PersonNotFoundException.class)
	public ResponseEntity<?>personNotFoundException(PersonNotFoundException exception){
		ErrorResponse errorResponse=new ErrorResponse(exception.getMessage(),LocalDateTime.now());
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.BAD_REQUEST);
		
	}

}
