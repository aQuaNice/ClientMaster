package com.andana.Controller;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andana.Model.ReturnMessage;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class OrderController {
	@RequestMapping(value = "/setOrder", method = RequestMethod.POST, headers = "content-type=application/json")
	public ResponseEntity<?> OrderController(@Valid @ModelAttribute String model, BindingResult bindingResult)throws IOException{
		ObjectMapper mapper = new ObjectMapper();
		ReturnMessage respon = new ReturnMessage();
			try {
//				generalHandler.SetResponse(respon,"RE-0400");				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return new ResponseEntity<>(mapper.writeValueAsString(respon),HttpStatus.BAD_REQUEST);
//				e.printStackTrace();
			}		
		return new ResponseEntity(mapper.writeValueAsString(respon), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/setPayment", method = RequestMethod.POST, headers = "content-type=application/json")
	public ResponseEntity<?> PaymentController(@Valid @ModelAttribute String model, BindingResult bindingResult)throws IOException{
		ObjectMapper mapper = new ObjectMapper();
		ReturnMessage respon = new ReturnMessage();
			try {
//				generalHandler.SetResponse(respon,"RE-0400");				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return new ResponseEntity<>(mapper.writeValueAsString(respon),HttpStatus.BAD_REQUEST);
//				e.printStackTrace();
			}		
		return new ResponseEntity(mapper.writeValueAsString(respon), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/checkPayment", method = RequestMethod.POST, headers = "content-type=application/json")
	public ResponseEntity<?> CheckPaymentController(@Valid @ModelAttribute String model, BindingResult bindingResult)throws IOException{
		ObjectMapper mapper = new ObjectMapper();
		ReturnMessage respon = new ReturnMessage();
			try {
//				generalHandler.SetResponse(respon,"RE-0400");				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return new ResponseEntity<>(mapper.writeValueAsString(respon),HttpStatus.BAD_REQUEST);
//				e.printStackTrace();
			}
		return new ResponseEntity(mapper.writeValueAsString(respon), HttpStatus.OK);
	}

}


